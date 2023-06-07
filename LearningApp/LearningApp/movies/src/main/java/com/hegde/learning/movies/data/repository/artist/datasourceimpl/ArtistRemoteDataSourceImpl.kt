package com.hegde.learning.movies.data.repository.artist.datasourceimpl

import com.hegde.learning.movies.data.api.TMDBService
import com.hegde.learning.movies.data.model.artist.ArtistList
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService: TMDBService,
                                 private val apiKey:String) : ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList>  = tmdbService.getPopularArtists(apiKey)
}