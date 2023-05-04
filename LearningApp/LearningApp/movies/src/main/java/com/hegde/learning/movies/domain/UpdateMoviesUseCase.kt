package com.hegde.learning.movies.domain

import com.hegde.learning.movies.data.model.movie.Movie

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute():List<Movie> ? = movieRepository.updateMovies()
}