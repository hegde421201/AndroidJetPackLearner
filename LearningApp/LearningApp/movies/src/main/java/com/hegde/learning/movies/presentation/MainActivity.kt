package com.hegde.learning.movies.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hegde.learning.movies.R
import com.hegde.learning.movies.databinding.ActivityMainBinding
import com.hegde.learning.movies.presentation.artist.ArtistActivity
import com.hegde.learning.movies.presentation.movie.MovieActivity
import com.hegde.learning.movies.presentation.tvshow.TvShowActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnMovies.setOnClickListener {
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtists.setOnClickListener {
            val intent = Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }

        binding.btnTvshows.setOnClickListener {
            val intent = Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }
    }
}