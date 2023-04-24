package com.hegde.learning.movies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.model.tvshow.TVShow

@Database(entities = [Movie::class,TVShow::class,Artist::class],
version = 1,
exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao() : MovieDao
    abstract fun tvshowDao() : TVShowDao
    abstract fun artistDao() : ArtistDao
}