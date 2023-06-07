package com.hegde.learning.movies.data.api

import com.hegde.learning.movies.data.model.artist.ArtistList
import com.hegde.learning.movies.data.model.movie.MovieList
import com.hegde.learning.movies.data.model.tvshow.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String) : Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String) : Response<TVShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey: String) : Response<ArtistList>



}

/*
  https://api.themoviedb.org/3/person/popular?api_key=fcd046a6c618d0669bb5b67894773f03&language=en-US&page=1

   https://api.themoviedb.org/3 ----   base url

   person/popular ---- endpoint
   api_key=fcd046a6c618d0669bb5b67894773f03&language=en-US&page=1    ---- query parameters



* */

