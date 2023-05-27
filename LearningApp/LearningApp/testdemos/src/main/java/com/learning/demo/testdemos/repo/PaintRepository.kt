package com.learning.demo.testdemos.repo

import androidx.lifecycle.LiveData
import com.learning.demo.testdemos.api.RetrofitApi
import com.learning.demo.testdemos.model.ImageResponse
import com.learning.demo.testdemos.model.Paint
import com.learning.demo.testdemos.model.PaintDao
import com.learning.demo.testdemos.util.Resource
import javax.inject.Inject

class PaintRepository @Inject constructor(
                            private val paintDao: PaintDao,
                            private val retrofitApi: RetrofitApi): PaintRepoInterface {
    override suspend fun insertPainting(paint: Paint) {
        paintDao.insertPainting(paint)
    }

    override suspend fun deletePainting(paint: Paint) {
        paintDao.deletePainting(paint)
    }

    override fun getPaint(): LiveData<List<Paint>> {
            return paintDao.observePaintings()
    }

    override suspend fun searchImage(imageString: String): Resource<ImageResponse> {
        return try {
            val response = retrofitApi.paintingSearch(imageString)

            if (response.isSuccessful) {
                response.body()?.let {
                    return@let Resource.success(it)
                } ?: Resource.error("Error",null)
            } else {
                Resource.error("Error",null)
            }
        } catch (e: Exception) {
            Resource.error("No data!",null)
        }
    }
    }


