package com.hegde.learning.movies.data.repository.artist.datasource

import com.hegde.learning.movies.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {

    suspend fun getArtists(): Response<ArtistList>
}