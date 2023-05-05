package com.hegde.learning.movies.data.repository

import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.domain.repository.MovieRepository

class MovieRepositoryImpl : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {

    }

    override suspend fun updateMovies(): List<Movie>? {

    }
}