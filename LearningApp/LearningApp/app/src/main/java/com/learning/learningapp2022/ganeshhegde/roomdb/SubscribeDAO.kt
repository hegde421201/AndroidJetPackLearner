package com.learning.learningapp2022.ganeshhegde.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.*

//this DAO (Data access object) interface defines the functions that access the DB tables

@Dao
interface SubscribeDAO {

    @Insert
    suspend fun insertSubscriber(subscriber:Subscriber)

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber)

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll()

    //This is a asynchronous query because the return type is of type Livedata. It runs on the background thread-no need to add suspend modifier
    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers(): LiveData<List<Subscriber>>



}