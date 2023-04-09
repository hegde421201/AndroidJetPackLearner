package com.learning.learningapp2022.ganeshhegde.di.coffee

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoffeeMaker @Inject constructor(val heater: Heater,val pump:Pump) {

    fun brew(){

    heater.on()
    heater.isHot()

    pump.isPump()

    Log.i("My brews","Myself brews arabic bean coffee")

    }
}