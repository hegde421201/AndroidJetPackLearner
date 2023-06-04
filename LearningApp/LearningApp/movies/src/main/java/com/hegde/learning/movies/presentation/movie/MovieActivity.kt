package com.hegde.learning.movies.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hegde.learning.movies.R
import com.hegde.learning.movies.databinding.ActivityMovieBinding
import com.hegde.learning.movies.presentation.di.Injector
import okhttp3.internal.notify
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {

        @Inject
        lateinit var factory: MovieViewModelFactory

        private lateinit var movieViewModel: MovieViewModel

        private lateinit var binding: ActivityMovieBinding

        private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_movie)

        (application as Injector).createMovieSubComponent().inject(this)

        movieViewModel= ViewModelProvider(this,factory)[MovieViewModel::class.java]

        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.movieRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MovieAdapter()
        binding.movieRecyclerView.adapter = adapter
        displayPopularMovies()
    }

    private fun displayPopularMovies() {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, Observer {
            it?.let{
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.progressBar.visibility = View.GONE
            }

            if(it == null)
            {
                binding.progressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available",Toast.LENGTH_SHORT).show()
            }
        })
    }
}