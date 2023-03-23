package com.learning.learningapp2022.ganeshhegde.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LDViewModel(private val number:Double) : ViewModel() {

    //variable to store the answer --- mutable live data object that will be observed by the activity
    private var multiplier = MutableLiveData<Double>()

    //variable to get user input
     var userInput = MutableLiveData<String>()

    //two way data binding example
    var userName = MutableLiveData<String>()


    init {
        multiplier.value = number
        userInput.value = number.toString()

        userName.value = "Ganesh"
    }

    //variable to pass on the value back by encapsulation
    val multData : LiveData<Double>
    get() = multiplier

    fun multAnswer(input:String) {
        //plus function for nullable variables --- edit text input will be doubled and added to the previous value on clicking the button
        multiplier.value = (multiplier.value)?.plus(input.toDouble() * 2.0)
    }
}