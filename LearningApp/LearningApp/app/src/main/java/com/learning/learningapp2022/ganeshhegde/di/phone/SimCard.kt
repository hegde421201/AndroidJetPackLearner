package com.learning.learningapp2022.ganeshhegde.di.phone

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {

    init {
        Log.i("SIMCARD","SIMCARD constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }

}
