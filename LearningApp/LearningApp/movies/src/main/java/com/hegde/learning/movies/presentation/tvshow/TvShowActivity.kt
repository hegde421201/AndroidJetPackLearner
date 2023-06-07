package com.hegde.learning.movies.presentation.tvshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hegde.learning.movies.R
import com.hegde.learning.movies.databinding.ActivityTvShowBinding
import com.hegde.learning.movies.presentation.di.Injector
import javax.inject.Inject

class TvShowActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: TvShowViewModelFactory

    private lateinit var tvShowViewModel: TvShowViewModel

    private lateinit var adapter: TvShowAdapter

    private lateinit var binding : ActivityTvShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_tv_show)

        (application as Injector).createTvShowSubComponent().inject(this)

        tvShowViewModel= ViewModelProvider(this,factory)[TvShowViewModel::class.java]

        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.tvshowRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = TvShowAdapter()
        binding.tvshowRecyclerView.adapter = adapter
        displayPopularShows()
    }

    private fun displayPopularShows() {
        binding.tvProgressBar.visibility = View.VISIBLE
        val responseLiveData = tvShowViewModel.getTVshows()
        responseLiveData.observe(this, Observer {
            it?.let{
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.tvProgressBar.visibility = View.GONE
            }

            if(it == null)
            {
                binding.tvProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.update,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_update -> {
                updateTVShows()
                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }

    private fun updateTVShows(){
        binding.tvProgressBar.visibility = View.VISIBLE
        val response = tvShowViewModel.updateTVshows()

        response.observe(this, Observer {
            if(it == null){
                binding.tvProgressBar.visibility = View.GONE
            }else{
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.tvProgressBar.visibility = View.GONE
            }
        })
    }
}

