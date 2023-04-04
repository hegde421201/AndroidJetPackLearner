package com.learning.learningapp2022.ganeshhegde.roomdb

import android.content.Context
import androidx.room.*

//abstract class --- database class

@Database(entities = [Subscriber::class],version = 1)
abstract class SubscriberDatabase : RoomDatabase() {

    //reference for the DAO interface
abstract val subscriberDao: SubscribeDAO

//creating just one instance of room database --- using singleton class ---- companion object
companion object {

    //volatile annotation makes the writes immediately visible to other threads

    @Volatile
    private var INSTANCE : SubscriberDatabase? = null

    fun getInstance(context: Context):SubscriberDatabase{
        synchronized(this){
            var instance = INSTANCE
            if(instance == null){ //creating the singleton INSTANCE of the database -- name is subscriber_database
                instance = Room.databaseBuilder(context.applicationContext,SubscriberDatabase::class.java,"subscriber_database").build()
                INSTANCE = instance
            }

            return instance
        }
    }
}

}