package com.hegde.learning.movies.presentation.di.core

import com.hegde.learning.movies.data.api.TMDBService
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistRemoteDataSource
import com.hegde.learning.movies.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import com.hegde.learning.movies.data.repository.movie.datasource.MovieRemoteDataSource
import com.hegde.learning.movies.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RemoteDataModule(private val apikey:String) {

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService) : TvShowRemoteDataSource{
        return TvShowRemoteDataSourceImpl(tmdbService,apikey)
    }


    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService) : MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(tmdbService,apikey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService) : ArtistRemoteDataSource{
        return ArtistRemoteDataSourceImpl(tmdbService,apikey)
    }


}