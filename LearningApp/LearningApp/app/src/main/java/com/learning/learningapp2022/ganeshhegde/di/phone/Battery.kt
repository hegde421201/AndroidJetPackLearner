package com.learning.learningapp2022.ganeshhegde.di.phone

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

    init{
        Log.i("BATTERY","Battery constructed")
    }

    fun getPower(){
        Log.i("BATTERY","Battery power is available")
    }
}