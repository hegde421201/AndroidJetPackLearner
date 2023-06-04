package com.hegde.learning.movies.presentation.di.core

import com.hegde.learning.movies.domain.repository.ArtistRepository
import com.hegde.learning.movies.domain.repository.MovieRepository
import com.hegde.learning.movies.domain.repository.TVShowRepository
import com.hegde.learning.movies.domain.usecase.*
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

@Provides
fun provideGetMovieUseCase(movieRepository: MovieRepository):GetMoviesUseCase{
    return GetMoviesUseCase(movieRepository)
}

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }


    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TVShowRepository):GetTVShowUseCase{
        return GetTVShowUseCase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TVShowRepository): UpdateTVShowUseCase {
        return UpdateTVShowUseCase(tvShowRepository)
    }


    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository):GetArtistUseCase{
        return GetArtistUseCase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistUseCase {
        return UpdateArtistUseCase(artistRepository)
    }


}