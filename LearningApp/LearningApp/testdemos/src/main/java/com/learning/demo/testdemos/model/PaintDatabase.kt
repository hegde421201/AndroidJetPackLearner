package com.learning.demo.testdemos.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Paint::class], version = 1)
abstract class PaintDatabase : RoomDatabase() {
    abstract fun paintDao(): PaintDao
}

