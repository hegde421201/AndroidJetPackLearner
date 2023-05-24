package com.learning.demo.testdemos.model


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PaintDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPainting(paint:Paint)

    @Delete
    suspend fun deletePainting(paint: Paint)

    @Query("SELECT * FROM paintings")
    fun observePaintings():LiveData<List<Paint>>

}