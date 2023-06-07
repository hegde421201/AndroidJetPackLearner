package com.hegde.learning.movies.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.hegde.learning.movies.data.db.ArtistDao
import com.hegde.learning.movies.data.db.MovieDao
import com.hegde.learning.movies.data.db.TMDBDatabase
import com.hegde.learning.movies.data.db.TVShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideTMDBDatabase(context:Context):TMDBDatabase{
        return Room.databaseBuilder(context,TMDBDatabase::class.java,"tmdbclient").build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase):MovieDao{
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTVshowDao(tmdbDatabase: TMDBDatabase):TVShowDao{
        return tmdbDatabase.tvshowDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase):ArtistDao{
        return tmdbDatabase.artistDao()
    }


}