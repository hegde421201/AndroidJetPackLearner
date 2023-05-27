package com.learning.demo.testdemos.di

import android.content.Context
import androidx.room.Room
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.api.RetrofitApi
import com.learning.demo.testdemos.model.PaintDao
import com.learning.demo.testdemos.model.PaintDatabase
import com.learning.demo.testdemos.repo.PaintRepoInterface
import com.learning.demo.testdemos.repo.PaintRepository
import com.learning.demo.testdemos.util.Util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext

import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PaintModule {

    @Singleton
    @Provides
    fun injectRoomDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context,PaintDatabase::class.java,"PaintingDB").build()

    @Singleton
    @Provides
    fun injectDao(
        database: PaintDatabase) = database.paintDao()

    @Singleton
    @Provides
    fun injectRetrofitApi():RetrofitApi {

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(RetrofitApi::class.java)
    }

    @Singleton
    @Provides
    fun injectGlide(@ApplicationContext context: Context) = Glide.with(context)
        .setDefaultRequestOptions(RequestOptions().placeholder(R.drawable.ic_launcher_foreground).error(R.drawable.ic_launcher_foreground))

    @Singleton
    @Provides
    fun injectUsualRepository(dao : PaintDao, api: RetrofitApi) = PaintRepository(dao,api) as PaintRepoInterface


}