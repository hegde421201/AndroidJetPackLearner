package com.hegde.learning.movies.data.repository.tvshow.datasource


import com.hegde.learning.movies.data.model.tvshow.TVShow


interface TvShowCacheDataSource {

   suspend fun saveTvShowToCache(tvShow:List<TVShow>)
   suspend fun getTvShowFromCache():List<TVShow>
}