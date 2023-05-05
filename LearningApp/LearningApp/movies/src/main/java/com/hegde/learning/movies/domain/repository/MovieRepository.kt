package com.hegde.learning.movies.domain.repository

import com.hegde.learning.movies.data.model.movie.Movie

interface MovieRepository {

suspend fun getMovies():List<Movie>?
suspend fun updateMovies():List<Movie>?

}