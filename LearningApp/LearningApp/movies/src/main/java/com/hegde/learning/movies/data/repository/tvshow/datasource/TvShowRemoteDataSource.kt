package com.hegde.learning.movies.data.repository.tvshow.datasource

import com.hegde.learning.movies.data.model.tvshow.TVShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TVShowList>
}