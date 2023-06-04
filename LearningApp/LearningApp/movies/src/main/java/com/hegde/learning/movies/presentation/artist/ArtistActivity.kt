package com.hegde.learning.movies.presentation.artist

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
import com.hegde.learning.movies.databinding.ActivityArtistBinding
import com.hegde.learning.movies.presentation.di.Injector
import javax.inject.Inject

class ArtistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArtistBinding

    @Inject
    lateinit var factory: ArtistViewModelFactory

    private lateinit var artistViewModel: ArtistViewModel

    private lateinit var adapter: ArtistAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_artist)

        (application as Injector).createArtistSubComponent().inject(this)

        artistViewModel= ViewModelProvider(this,factory)[ArtistViewModel::class.java]

        initRecyclerView()

    }

    private fun initRecyclerView(){
        binding.artistRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ArtistAdapter()
        binding.artistRecyclerView.adapter = adapter
        displayPopularShows()
    }

    private fun displayPopularShows() {
        binding.artistProgressBar.visibility = View.VISIBLE
        val responseLiveData = artistViewModel.getArtists()
        responseLiveData.observe(this, Observer {
            it?.let{
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.artistProgressBar.visibility = View.GONE
            }

            if(it == null)
            {
                binding.artistProgressBar.visibility = View.GONE
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
                updateArtists()
                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }

    private fun updateArtists(){
        binding.artistProgressBar.visibility = View.VISIBLE
        val response = artistViewModel.updateArtists()

        response.observe(this, Observer {
            if(it == null){
                binding.artistProgressBar.visibility = View.GONE
            }else{
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.artistProgressBar.visibility = View.GONE
            }
        })
    }
}