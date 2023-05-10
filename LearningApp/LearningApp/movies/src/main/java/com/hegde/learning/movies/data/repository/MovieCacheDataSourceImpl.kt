package com.hegde.learning.movies.data.repository

import com.hegde.learning.movies.data.model.movie.Movie

class MovieCacheDataSourceImpl : MovieCacheDataSource{

    private var movieList = ArrayList<Movie>()

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }


}