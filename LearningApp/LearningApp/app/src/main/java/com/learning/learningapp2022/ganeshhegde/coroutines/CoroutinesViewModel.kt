package com.learning.learningapp2022.ganeshhegde.coroutines

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.*

class CoroutinesViewModel : ViewModel(){
    private val myJob = Job()
    private val myScope = CoroutineScope(Dispatchers.IO + myJob)
    private var userRepository = UserRepository()
    var users : MutableLiveData<List<User>> = MutableLiveData()

    fun getUserData(){

        //viewmodelscope is a coroutinescope tied to a viewmodel
        viewModelScope.launch {
            var result : List<User>? = null
            withContext(Dispatchers.IO){
                result = userRepository.getUsers()
            }

            users.value = result!!
        }
    }

    /*override fun onCleared() {
        super.onCleared()
        myJob.cancel()

    }*/

}