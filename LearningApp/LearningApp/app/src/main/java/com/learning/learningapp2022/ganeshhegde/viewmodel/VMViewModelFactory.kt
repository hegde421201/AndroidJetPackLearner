package com.learning.learningapp2022.ganeshhegde.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//use a view model factory class when you have to pass params to the ViewModel constructor
//This class extends ViewModelProvider Factory Class
class VMViewModelFactory(private val total:Long) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(VMViewModel::class.java))
            return VMViewModel(total) as T
        else
            throw IllegalArgumentException("Unknown VMViewModel class")
    }
}