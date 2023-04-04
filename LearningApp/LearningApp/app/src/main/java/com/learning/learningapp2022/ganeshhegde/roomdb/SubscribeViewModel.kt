package com.learning.learningapp2022.ganeshhegde.roomdb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//using the repository as a parameter in the constructor
class SubscribeViewModel(private val repository:SubscriberRepository) : ViewModel() {

    var inputName = MutableLiveData<String?>()

    var inputEmail = MutableLiveData<String?>()

    val clearText = MutableLiveData<String>()
    val saveText = MutableLiveData<String>()

    private var isUpdateOrDelete = false
    private lateinit var subUpdateOrDelete : Subscriber

    init{
        clearText.value = "Clear All"
        saveText.value = "Save"
    }

    fun initUpdateOrDelete(subscriber:Subscriber){
        inputName.value = subscriber.name
        inputEmail.value = subscriber.email
        isUpdateOrDelete = true
        subUpdateOrDelete = subscriber

        saveText.value = "Update"
        clearText.value = "Delete"
    }

    fun saveOrUpdate(){

        val name = inputName.let{
            inputName.value
        }
        val email = inputEmail.let{
            inputEmail.value
        }

        if (!name.isNullOrEmpty() && !email.isNullOrEmpty()) {
                insert(Subscriber(0,name,email))
                inputName.value = null
                inputEmail.value = null
            }
         }

    fun clearOrDelete(){
            clearAll()
    }

    val subscribers = repository.subscribers

    fun clearAll(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAll()
        }
    }


    fun insert(subscriber: Subscriber) =
        viewModelScope.launch(Dispatchers.IO) { //call using background thread
            repository.insert(subscriber)

    }

    fun update(subscriber: Subscriber){
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(subscriber)
        }
    }

    fun delete(subscriber: Subscriber)
       = viewModelScope.launch {
            repository.delete(subscriber)

    }
}
