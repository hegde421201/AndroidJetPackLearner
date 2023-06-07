package com.hegde.learning.movies.data.repository.movie.datasourceimpl

import com.hegde.learning.movies.data.db.MovieDao
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao: MovieDao): MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> = movieDao.getMovies()


    override suspend fun saveMoviesToDB(movie: List<Movie>) {
        //background thread
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movie)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}