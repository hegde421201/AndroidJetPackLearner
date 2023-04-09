package com.learning.learningapp2022.ganeshhegde.di.phone

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

//since we are using inject annotation, we explicitly mention the constructor keyword to make it visible

@Singleton
class SmartPhone @Inject constructor(val battery:Battery,val simCard:SimCard,val memoryCard:MemoryCard ) {

    //SmartPhone --- dependent
    //battery,simcard,memorycard --- dependencies

    init{
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
    }

    fun makeACallWithRecording(){
        Log.i("CALL","CALLING")
    }

}