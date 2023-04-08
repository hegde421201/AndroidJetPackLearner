package com.learning.learningapp2022.ganeshhegde.di.phone

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor(){

init {
    Log.i("MEMORY CARD","memory card constructed")
}

    fun getSpaceAvailability(){
        Log.i("MEMORY CARD","memory card space")
    }

}
