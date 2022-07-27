package com.learning.learningapp2022.ganeshhegde.roomdb

import android.content.Context
import androidx.room.*

@Database(entities = [Subscriber::class],version = 1)
abstract class SubscriberDatabase : RoomDatabase() {

    //reference for the DAO interface
abstract val subscriberDao: SubscribeDAO

companion object {
    @Volatile
    private var INSTANCE : SubscriberDatabase? = null

    fun getInstance(context: Context):SubscriberDatabase{
        synchronized(this){
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(context.applicationContext,SubscriberDatabase::class.java,"subscriber_database").build()
            }
            return instance
        }
    }
}

}