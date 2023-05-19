package com.hegde.learning.movies.data.repository

import android.util.Log
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.domain.repository.MovieRepository


class MovieRepositoryImpl(
    private val movieRemoteDataSource:MovieRemoteDataSource,
    private val movieLocalDataSource:MovieLocalDataSource,
    private val movieCacheDataSource:MovieCacheDataSource) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {

        return null
    }

    override suspend fun updateMovies(): List<Movie>? {

        return null
    }

    suspend fun getMoviesFromAPI():List<Movie>{

        lateinit var movieList:List<Movie>

        try {
                    val response = movieRemoteDataSource.getMovies()
                    val body = response.body()

                    body?.let {
                        movieList = body.movies
                    }

            }catch (exception:Exception){
                    Log.i("Mytag",exception.message.toString())
                }

        return movieList
    }
}