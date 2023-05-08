package com.hegde.learning.movies.data.repository

import com.hegde.learning.movies.data.api.TMDBService
import com.hegde.learning.movies.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        TODO("Not yet implemented")
    }
}