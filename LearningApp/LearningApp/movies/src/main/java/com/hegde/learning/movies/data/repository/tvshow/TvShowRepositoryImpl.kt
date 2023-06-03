package com.hegde.learning.movies.data.repository.tvshow

import android.util.Log
import com.hegde.learning.movies.data.model.tvshow.TVShow
import com.hegde.learning.movies.domain.repository.TVShowRepository
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowRemoteDataSource

class TvShowRepositoryImpl(
    private val tvshowRemoteDataSource: TvShowRemoteDataSource,
    private val tvshowLocalDataSource: TvShowLocalDataSource,
    private val tvshowCacheDataSource: TvShowCacheDataSource
) : TVShowRepository {
    override suspend fun getTVShow(): List<TVShow>? {

        return getTvShowsFromCache()
    }

    override suspend fun updateTVShow(): List<TVShow>? {

        val newList  = getTvShowsFromAPI()

        tvshowLocalDataSource.clearAll()

        tvshowLocalDataSource.saveTvShowsToDB(newList)

        tvshowCacheDataSource.saveTvShowToCache(newList)

        return newList
    }

    suspend fun getTvShowsFromAPI():List<TVShow>{

        lateinit var tvshowList:List<TVShow>

        try {
                    val response = tvshowRemoteDataSource.getTvShows()
                    val body = response.body()

                    body?.let {
                        tvshowList = body.TVShows
                    }

            }catch (exception:Exception){
                    Log.i("Tvshow",exception.message.toString())
                }

        return tvshowList
    }

    suspend fun getTvShowsFromDB():List<TVShow>{

        lateinit var tvshowList:List<TVShow>

        try {
            tvshowList = tvshowLocalDataSource.getTvShowsFromDB()

        }catch (exception:Exception){
            Log.i("TVShow",exception.message.toString())
        }

        if(tvshowList.isNotEmpty()){
            return tvshowList
        }
        else {
            tvshowList = getTvShowsFromAPI()
            tvshowLocalDataSource.saveTvShowsToDB(tvshowList)
        }

        return tvshowList
    }

    suspend fun getTvShowsFromCache():List<TVShow>{
        lateinit var tvShowList:List<TVShow>

        try {
            tvShowList = tvshowCacheDataSource.getTvShowFromCache()

        }catch (exception:Exception){
            Log.i("TVshow",exception.message.toString())
        }

        if(tvShowList.isNotEmpty()){
            return tvShowList
        }
        else {
            tvShowList = getTvShowsFromDB()
            tvshowCacheDataSource.saveTvShowToCache(tvShowList)
        }

        return tvShowList
    }
}