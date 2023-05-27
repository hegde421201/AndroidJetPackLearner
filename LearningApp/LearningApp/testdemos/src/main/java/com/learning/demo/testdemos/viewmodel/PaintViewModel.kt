package com.learning.demo.testdemos.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learning.demo.testdemos.model.ImageResponse
import com.learning.demo.testdemos.model.Paint
import com.learning.demo.testdemos.repo.PaintRepoInterface
import com.learning.demo.testdemos.util.Resource

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PaintViewModel @Inject constructor(

    private val repository: PaintRepoInterface
) : ViewModel() {

    val paintsList = repository.getPaint()

    private val paintings = MutableLiveData<Resource<ImageResponse>>()

    val imagesList : LiveData<Resource<ImageResponse>>
        get() = paintings

    private val selectedImage = MutableLiveData<String>()
    val selectedImageUrl : LiveData<String>
        get() = selectedImage

    //Paint details fragment
    private var insertMessage = MutableLiveData<Resource<Paint>>()
    val insertPaintMessage : LiveData<Resource<Paint>>
            get() = insertMessage

    //Solving the navigation bug
    fun resetInsertArtMsg() {
        insertMessage = MutableLiveData<Resource<Paint>>()
    }

    fun setSelectedImage(url : String) {
        selectedImage.postValue(url)
    }

    fun deletePainting(paint: Paint) = viewModelScope.launch {
        repository.deletePainting(paint)
    }

    fun insertPainting(paint: Paint) = viewModelScope.launch {
        repository.insertPainting(paint)
    }

    fun searchForImage(searchText:String){

        if(searchText.isEmpty())return

        paintings.value = Resource.loading(null)

        viewModelScope.launch {
            val response = repository.searchImage(searchText)
            paintings.value = response
        }

    }

    fun makePaint(name:String,painter:String,year:String){

        if(name.isEmpty() || painter.isEmpty() || year.isEmpty())
        {
            insertMessage.postValue(Resource.error("Enter name, painter and year",null))
            return
        }

        val yearInt = try{
            year.toInt()
        }catch (e:Exception)
        {
            insertMessage.postValue(Resource.error("Year must be a number",null))
        }

        val paint = Paint(name,painter, yearInt as Int,selectedImage.value?: "")
        insertPainting(paint)

        setSelectedImage("")
        insertMessage.postValue(Resource.success(paint))
    }


}