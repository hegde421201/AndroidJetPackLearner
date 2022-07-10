package com.learning.learningapp2022.ganeshhegde.livedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.learning.learningapp2022.ganeshhegde.viewmodel.VMViewModelFactory
import java.lang.IllegalArgumentException

class LiveDataVMFactory(private val initial : Double) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(LDViewModel::class.java)){
            return LDViewModel(initial) as T
        }
        else
            throw IllegalArgumentException("LiveDataVMFactory class not found")
    }
}