package com.hegde.learning.movies.domain

import com.hegde.learning.movies.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}