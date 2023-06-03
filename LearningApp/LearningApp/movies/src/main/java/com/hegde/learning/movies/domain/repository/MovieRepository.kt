package com.hegde.learning.movies.domain.repository

import com.hegde.learning.movies.data.model.movie.Movie

interface MovieRepository {
//since we are using coroutines we use the suspend function
suspend fun getMovies():List<Movie>?
suspend fun updateMovies():List<Movie>?

}