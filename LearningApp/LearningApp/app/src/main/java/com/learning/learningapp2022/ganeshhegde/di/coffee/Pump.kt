package com.learning.learningapp2022.ganeshhegde.di.coffee

import android.util.Log
import javax.inject.Inject

class Pump @Inject constructor (val thermosiphon: Thermosiphon) {


    fun isPump(){
        thermosiphon.thermos()
        Log.i("PUMP","Coffee is pumped for glory")

    }

}