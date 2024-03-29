package com.hegde.learning.movies.data.repository.movie.datasource

import com.hegde.learning.movies.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}