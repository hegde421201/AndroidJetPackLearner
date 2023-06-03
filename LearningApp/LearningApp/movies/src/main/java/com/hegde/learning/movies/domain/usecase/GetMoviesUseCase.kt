package com.hegde.learning.movies.domain.usecase

import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.domain.repository.MovieRepository

//injecting the use case class with the repository class as a constructor parameter
class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    //returns a list of movies from repository
    suspend fun execute():List<Movie> ? = movieRepository.getMovies()
}