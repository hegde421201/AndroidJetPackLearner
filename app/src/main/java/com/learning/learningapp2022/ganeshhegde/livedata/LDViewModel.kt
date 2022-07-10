package com.learning.learningapp2022.ganeshhegde.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LDViewModel(private val number:Double) : ViewModel() {

    //variable to store the answer
    private var multiplier = MutableLiveData<Double>()

    //variable to get user input
     var userInput = MutableLiveData<String>()

    init {
        multiplier.value = number
        userInput.value = number.toString()
    }

    val multData : LiveData<Double>
    get() = multiplier

    fun multAnswer(input:String) {
        multiplier.value = (multiplier.value)?.plus(input.toDouble() * 2.0)
    }
}