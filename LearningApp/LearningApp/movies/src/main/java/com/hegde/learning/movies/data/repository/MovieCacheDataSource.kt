package com.hegde.learning.movies.data.repository

import com.hegde.learning.movies.data.model.movie.Movie

interface MovieCacheDataSource {

   suspend fun saveMoviesToCache(movies:List<Movie>)
   suspend fun getMoviesFromCache():List<Movie>
}