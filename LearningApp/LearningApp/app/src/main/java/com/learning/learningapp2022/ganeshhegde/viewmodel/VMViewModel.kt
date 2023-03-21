package com.learning.learningapp2022.ganeshhegde.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

//extend this class to viewmodel ---- startvalue is passed as a constructor parameter
// --- we use custom viewmodel defined using viewmodel factory
class VMViewModel(startValue : Long) : ViewModel() {

    private var count = 0
    private var adder :Long = 0

    init{
        adder = startValue
    }

    fun getInitialSum() : Long{

        return adder
    }

    fun getCurrentClickCount() : Int{
        return count
    }

    fun getUpdatedCounter() : Int{
        return ++count
    }

    fun getUserNumber(nums:Long) : Long {
        adder += nums
        return adder
    }


    override fun onCleared() {

        /*
A ViewModel's onCleared() is called when the ViewModel is no longer required.

 It will be called when the app is put into the background and the app process is killed in order to free up the system's memory.

 When the user invokes finish() of an activity, its view model will be cleared().

 Also when we click on the back button, ViewModel of current activity will be cleared (onCleared()  will be invoked)
        * */

        Log.d("Hi on cleared","On cleared called")
    }
}