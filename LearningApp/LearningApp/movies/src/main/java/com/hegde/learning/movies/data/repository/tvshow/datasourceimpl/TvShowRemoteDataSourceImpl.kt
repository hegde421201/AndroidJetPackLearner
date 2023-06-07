package com.hegde.learning.movies.data.repository.tvshow.datasourceimpl

import com.hegde.learning.movies.data.api.TMDBService
import com.hegde.learning.movies.data.model.artist.ArtistList
import com.hegde.learning.movies.data.model.tvshow.TVShowList
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistRemoteDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private val tmdbService: TMDBService,
                                 private val apiKey:String) : TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TVShowList>  = tmdbService.getPopularTvShows(apiKey)
}