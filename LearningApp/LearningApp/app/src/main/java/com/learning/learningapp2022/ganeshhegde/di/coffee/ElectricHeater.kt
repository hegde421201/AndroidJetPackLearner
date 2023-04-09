package com.learning.learningapp2022.ganeshhegde.di.coffee

import android.util.Log
import javax.inject.Inject

class ElectricHeater @Inject constructor(): Heater{
    override fun isHot(): Boolean {

        var hotness = true
        Log.i("ELECTRIC HOTNESS","$hotness")

        return hotness
    }

    override fun on() {
        Log.i("ELECTRIC ON","ON")
    }

    override fun off() {
        Log.i("ELECTRIC OFF","OFF")
    }
}