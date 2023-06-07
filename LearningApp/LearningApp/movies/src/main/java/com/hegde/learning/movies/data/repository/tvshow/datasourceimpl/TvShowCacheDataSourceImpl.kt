package com.hegde.learning.movies.data.repository.tvshow.datasourceimpl

import com.hegde.learning.movies.data.model.tvshow.TVShow
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {

    private var tvShowList = ArrayList<TVShow>()

    override suspend fun saveTvShowToCache(tvShow: List<TVShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShow)
    }

    override suspend fun getTvShowFromCache(): List<TVShow> {
        return tvShowList
    }


}