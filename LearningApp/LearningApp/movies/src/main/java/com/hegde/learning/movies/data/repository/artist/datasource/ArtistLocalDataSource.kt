package com.hegde.learning.movies.data.repository.artist.datasource

import com.hegde.learning.movies.data.model.artist.Artist


interface ArtistLocalDataSource {

    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artist: List<Artist>)
    suspend fun clearAll()
}

