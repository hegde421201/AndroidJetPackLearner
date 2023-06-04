package com.hegde.learning.movies.presentation.tvshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hegde.learning.movies.R
import com.hegde.learning.movies.databinding.ActivityTvShowBinding
import com.hegde.learning.movies.presentation.di.Injector
import com.hegde.learning.movies.presentation.movie.MovieViewModel
import com.hegde.learning.movies.presentation.movie.MovieViewModelFactory
import javax.inject.Inject

class TvShowActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: TvShowViewModelFactory

    private lateinit var tvShowViewModel: TvShowViewModel


    private lateinit var binding : ActivityTvShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_tv_show)

        (application as Injector).createTvShowSubComponent().inject(this)

        tvShowViewModel= ViewModelProvider(this,factory)[TvShowViewModel::class.java]

        val responseLiveData = tvShowViewModel.getTVshows()
        responseLiveData.observe(this, Observer {
            Log.i("TAG",it.toString())
        })
    }
}