package com.hegde.learning.movies.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hegde.learning.movies.data.model.tvshow.TVShow


@Dao
interface TVShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTVShows(tvshow: List<TVShow>)

    @Query("DELETE FROM popular_tvshow")
    suspend fun deleteAllTVShows()

    @Query("SELECT * FROM popular_tvshow")
    suspend fun getTVShows():List<TVShow>

}