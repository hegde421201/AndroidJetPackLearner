package com.hegde.learning.movies.presentation.di.movie

import com.hegde.learning.movies.presentation.artist.ArtistActivity
import com.hegde.learning.movies.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    
    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }
}