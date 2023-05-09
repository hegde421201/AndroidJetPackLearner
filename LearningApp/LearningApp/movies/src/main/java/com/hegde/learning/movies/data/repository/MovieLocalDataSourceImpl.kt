package com.hegde.learning.movies.data.repository

import com.hegde.learning.movies.data.db.MovieDao
import com.hegde.learning.movies.data.model.movie.Movie

class MovieLocalDataSourceImpl(private val movieDao: MovieDao): MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> = movieDao.getMovies()


    override suspend fun saveMoviesToDB(movie: List<Movie>) {
        TODO("Not yet implemented")
    }

    override suspend fun clearAll() {
        TODO("Not yet implemented")
    }
}