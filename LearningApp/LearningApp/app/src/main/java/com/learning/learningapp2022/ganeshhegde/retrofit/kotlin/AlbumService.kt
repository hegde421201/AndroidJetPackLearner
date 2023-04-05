package com.learning.learningapp2022.ganeshhegde.retrofit.kotlin

import retrofit2.Response
import retrofit2.http.*

interface AlbumService {

//kotlin coroutines with retrofit is used for Response object.Hence we use suspendd modifier
@GET("/albums")
suspend fun getAlbums() : Response<Albums>

    @GET("/albums")
    suspend fun getSortedAlbums(@Query("userId") userId:Int) : Response<Albums>

    @GET("/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId:Int) : Response<AlbumsItem>

    @POST("/albums")
    suspend fun uploadAlbum(@Body album:AlbumsItem) : Response<AlbumsItem>

}