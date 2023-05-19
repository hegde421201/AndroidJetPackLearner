package com.hegde.learning.movies.data.repository

import com.hegde.learning.movies.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movie: List<Movie>)
    suspend fun clearAll()
}