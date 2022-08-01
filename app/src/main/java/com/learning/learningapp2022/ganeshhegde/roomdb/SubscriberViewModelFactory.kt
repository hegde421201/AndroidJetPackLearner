package com.learning.learningapp2022.ganeshhegde.roomdb

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class SubscriberViewModelFactory(private val repository:SubscriberRepository):ViewModelProvider.Factory {

override fun <T: ViewModel> create(modelClass: Class<T>):T{
    if(modelClass.isAssignableFrom(SubscribeViewModel::class.java)){
        return SubscribeViewModel(repository) as T
    }
    else
        throw IllegalArgumentException("Unknown Viewmodel class - SubscribeViewModel")
}

}
