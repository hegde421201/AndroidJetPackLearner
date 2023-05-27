package com.learning.demo.testdemos.api

import com.learning.demo.testdemos.model.ImageResponse
import com.learning.demo.testdemos.util.Util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {

    @GET("/api/")
    suspend fun paintingSearch(
        @Query("q") searchQuery:String,
        @Query("key") apiKey:String = API_KEY
    ) : Response<ImageResponse>



}