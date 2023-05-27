package com.learning.demo.testdemos.repo


import androidx.lifecycle.LiveData
import com.learning.demo.testdemos.model.ImageResponse
import com.learning.demo.testdemos.model.Paint
import com.learning.demo.testdemos.util.Resource

interface PaintRepoInterface {

    suspend fun insertPainting(paint: Paint)

    suspend fun deletePainting(paint: Paint)

    fun getPaint() : LiveData<List<Paint>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}