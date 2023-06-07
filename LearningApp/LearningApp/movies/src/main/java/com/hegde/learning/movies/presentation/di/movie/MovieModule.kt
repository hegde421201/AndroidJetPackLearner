package com.hegde.learning.movies.presentation.di.movie

import com.hegde.learning.movies.domain.usecase.GetArtistUseCase
import com.hegde.learning.movies.domain.usecase.GetMoviesUseCase
import com.hegde.learning.movies.domain.usecase.UpdateArtistUseCase
import com.hegde.learning.movies.domain.usecase.UpdateMoviesUseCase
import com.hegde.learning.movies.presentation.artist.ArtistViewModelFactory
import com.hegde.learning.movies.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }



}