package com.hegde.learning.movies.presentation.di

import com.hegde.learning.movies.presentation.di.artist.ArtistSubComponent
import com.hegde.learning.movies.presentation.di.movie.MovieSubComponent
import com.hegde.learning.movies.presentation.di.tvshow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent():MovieSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistSubComponent():ArtistSubComponent

}