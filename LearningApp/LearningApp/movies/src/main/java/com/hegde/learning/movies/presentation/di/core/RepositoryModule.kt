package com.hegde.learning.movies.presentation.di.core

import com.hegde.learning.movies.data.repository.artist.ArtistRepositoryImpl
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistCacheDataSource
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistLocalDataSource
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistRemoteDataSource
import com.hegde.learning.movies.data.repository.movie.MovieRepositoryImpl
import com.hegde.learning.movies.data.repository.movie.datasource.MovieCacheDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieLocalDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieRemoteDataSource
import com.hegde.learning.movies.data.repository.tvshow.TvShowRepositoryImpl
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.hegde.learning.movies.domain.repository.ArtistRepository
import com.hegde.learning.movies.domain.repository.MovieRepository
import com.hegde.learning.movies.domain.repository.TVShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(

        movieRemoteDataSource:MovieRemoteDataSource,
        movieCacheDataSource: MovieCacheDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ):MovieRepository{
        return MovieRepositoryImpl(movieRemoteDataSource,movieLocalDataSource,movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(

        artistRemoteDataSource: ArtistRemoteDataSource,
        artistCacheDataSource: ArtistCacheDataSource,
        artistLocalDataSource: ArtistLocalDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource,artistLocalDataSource,artistCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(

        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource
    ): TVShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDataSource,tvShowLocalDataSource,tvShowCacheDataSource)
    }

}