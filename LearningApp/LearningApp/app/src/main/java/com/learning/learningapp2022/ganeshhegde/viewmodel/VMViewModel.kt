package com.learning.learningapp2022.ganeshhegde.viewmodel

import androidx.lifecycle.ViewModel

class VMViewModel(startValue : Long) : ViewModel() {

    private var count = 0
    private var adder :Long = 0

    init{
        adder = startValue
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
}