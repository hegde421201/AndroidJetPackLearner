package com.hegde.learning.movies.presentation.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hegde.learning.movies.R
import com.hegde.learning.movies.databinding.ActivityArtistBinding
import com.hegde.learning.movies.databinding.ActivityMovieBinding
import com.hegde.learning.movies.presentation.di.Injector
import com.hegde.learning.movies.presentation.tvshow.TvShowViewModel
import com.hegde.learning.movies.presentation.tvshow.TvShowViewModelFactory
import javax.inject.Inject

class ArtistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArtistBinding

    @Inject
    lateinit var factory: ArtistViewModelFactory

    private lateinit var artistViewModel: ArtistViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_artist)

        (application as Injector).createArtistSubComponent().inject(this)

        artistViewModel= ViewModelProvider(this,factory)[ArtistViewModel::class.java]

        val responseLiveData = artistViewModel.getArtists()
        responseLiveData.observe(this, Observer {
            Log.i("TAG",it.toString())
        })
    }
}