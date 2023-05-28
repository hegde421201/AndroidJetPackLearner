package com.learning.demo.testdemos.di

import android.content.Context
import androidx.room.Room
import com.learning.demo.testdemos.model.PaintDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object TestPaintModule {

    @Provides
    @Named("testDatabase")
    fun injectInMemoryRoom(@ApplicationContext context: Context) =
           Room.inMemoryDatabaseBuilder(context,PaintDatabase::class.java)
                .allowMainThreadQueries()
                .build()

}