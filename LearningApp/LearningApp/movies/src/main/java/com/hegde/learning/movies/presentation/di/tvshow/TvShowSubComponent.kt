package com.hegde.learning.movies.presentation.di.tvshow

import com.hegde.learning.movies.presentation.movie.MovieActivity
import com.hegde.learning.movies.presentation.tvshow.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvshowActivity: TvShowActivity)

    
    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }
}