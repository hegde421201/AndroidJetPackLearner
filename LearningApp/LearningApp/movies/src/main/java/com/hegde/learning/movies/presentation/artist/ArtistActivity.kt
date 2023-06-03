package com.hegde.learning.movies.presentation.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hegde.learning.movies.R
import com.hegde.learning.movies.databinding.ActivityArtistBinding
import com.hegde.learning.movies.databinding.ActivityMovieBinding

class ArtistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArtistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_artist)
    }
}