package com.hegde.learning.movies.domain.usecase

import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute():List<Movie> ? = movieRepository.updateMovies()
}