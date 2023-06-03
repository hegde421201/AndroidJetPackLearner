package com.hegde.learning.movies.data.repository.movie

import android.util.Log
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.repository.movie.datasource.MovieCacheDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieLocalDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieRemoteDataSource
import com.hegde.learning.movies.domain.repository.MovieRepository


class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {

        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {

        val newList  = getMoviesFromAPI()

       movieLocalDataSource.clearAll()

       movieLocalDataSource.saveMoviesToDB(newList)

       movieCacheDataSource.saveMoviesToCache(newList)

        return newList
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

    suspend fun getMoviesFromDB():List<Movie>{

        lateinit var movieList:List<Movie>

        try {
            movieList = movieLocalDataSource.getMoviesFromDB()

        }catch (exception:Exception){
            Log.i("Mytag",exception.message.toString())
        }

        if(movieList.isNotEmpty()){
            return movieList
        }
        else {
            movieList = getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }

        return movieList
    }

    suspend fun getMoviesFromCache():List<Movie>{
        lateinit var movieList:List<Movie>

        try {
            movieList = movieCacheDataSource.getMoviesFromCache()

        }catch (exception:Exception){
            Log.i("Mytag",exception.message.toString())
        }

        if(movieList.isNotEmpty()){
            return movieList
        }
        else {
            movieList = getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }

        return movieList
    }
}