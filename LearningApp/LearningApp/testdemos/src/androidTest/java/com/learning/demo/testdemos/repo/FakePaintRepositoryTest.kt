package com.learning.demo.testdemos.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.learning.demo.testdemos.model.ImageResponse
import com.learning.demo.testdemos.model.Paint
import com.learning.demo.testdemos.util.Resource

class FakePaintRepositoryTest : PaintRepoInterface {

    private val paints = mutableListOf<Paint>()
    private val paintsLiveData = MutableLiveData<List<Paint>>(paints)

    override suspend fun insertPainting(paint: Paint) {
            paints.add(paint)
            refreshData()
    }

    override suspend fun deletePainting(paint: Paint) {
        paints.remove(paint)
        refreshData()
    }

    private fun refreshData() {
        paintsLiveData.postValue(paints)
    }

    override fun getPaint(): LiveData<List<Paint>> {
            return paintsLiveData
    }

    override suspend fun searchImage(imageString: String): Resource<ImageResponse> {
            return Resource.success(ImageResponse(listOf(),0,0))
    }
}