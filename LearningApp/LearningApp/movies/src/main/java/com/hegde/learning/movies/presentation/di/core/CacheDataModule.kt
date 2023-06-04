package com.hegde.learning.movies.presentation.di.core

import com.hegde.learning.movies.data.db.TVShowDao
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistCacheDataSource
import com.hegde.learning.movies.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import com.hegde.learning.movies.data.repository.movie.datasource.MovieCacheDataSource
import com.hegde.learning.movies.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import com.hegde.learning.movies.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource() : TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource() : ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideMovieCacheDataSource() : MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }


}