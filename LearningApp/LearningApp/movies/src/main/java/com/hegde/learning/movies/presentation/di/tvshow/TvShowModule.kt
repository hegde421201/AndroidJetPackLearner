package com.hegde.learning.movies.presentation.di.tvshow

import com.hegde.learning.movies.domain.usecase.*
import com.hegde.learning.movies.presentation.artist.ArtistViewModelFactory
import com.hegde.learning.movies.presentation.movie.MovieViewModelFactory
import com.hegde.learning.movies.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTVShowUseCase: GetTVShowUseCase,
        updateTVShowUseCase: UpdateTVShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTVShowUseCase, updateTVShowUseCase)
    }



}