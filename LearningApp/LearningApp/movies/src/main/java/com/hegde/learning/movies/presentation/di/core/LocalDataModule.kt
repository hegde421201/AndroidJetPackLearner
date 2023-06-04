package com.hegde.learning.movies.presentation.di.core

import com.hegde.learning.movies.data.api.TMDBService
import com.hegde.learning.movies.data.db.ArtistDao
import com.hegde.learning.movies.data.db.MovieDao
import com.hegde.learning.movies.data.db.TVShowDao
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistLocalDataSource
import com.hegde.learning.movies.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import com.hegde.learning.movies.data.repository.movie.datasource.MovieLocalDataSource
import com.hegde.learning.movies.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import com.hegde.learning.movies.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule(private val apiKey:String) {

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvshowDao:TVShowDao) : TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvshowDao)
    }

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao) : MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao) : ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

}