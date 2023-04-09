package com.learning.learningapp2022.ganeshhegde.di.coffee

import android.util.Log
import javax.inject.Inject

class Thermosiphon @Inject constructor(heater:ElectricHeater) {

    fun thermos(){
        Log.i("Thermos","Where is the heater ?")
    }

}