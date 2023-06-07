package com.hegde.learning.movies.data.repository.tvshow.datasource


import com.hegde.learning.movies.data.model.tvshow.TVShow


interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB():List<TVShow>
    suspend fun saveTvShowsToDB(tvShow: List<TVShow>)
    suspend fun clearAll()
}

