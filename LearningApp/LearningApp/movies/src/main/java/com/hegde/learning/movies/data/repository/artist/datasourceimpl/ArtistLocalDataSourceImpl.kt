package com.hegde.learning.movies.data.repository.artist.datasourceimpl

import com.hegde.learning.movies.data.db.ArtistDao
import com.hegde.learning.movies.data.db.MovieDao
import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistLocalDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao): ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> = artistDao.getArtists()


    override suspend fun saveArtistsToDB(artist: List<Artist>) {
        //background thread
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artist)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.deleteAllArtists()
        }
    }
}