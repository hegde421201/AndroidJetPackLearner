package com.learning.learningapp2022.ganeshhegde

import android.app.Application
import com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeMakerComponent
import com.learning.learningapp2022.ganeshhegde.di.coffee.DaggerCoffeeMakerComponent
import com.learning.learningapp2022.ganeshhegde.di.phone.DaggerSmartPhoneComponent
import com.learning.learningapp2022.ganeshhegde.di.phone.MemoryCardModule
import com.learning.learningapp2022.ganeshhegde.di.phone.SmartPhoneComponent

class LearnerAppApplication : Application() {

    lateinit var smartPhoneComponent: SmartPhoneComponent
    lateinit var coffeeMakerComponent: CoffeeMakerComponent

    override fun onCreate() {
        super.onCreate()

        smartPhoneComponent = initDagger()
        coffeeMakerComponent = initDaggerCoffee()
    }

    private fun initDagger() : SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder().
        memoryCardModule(MemoryCardModule(4000)).build()


    private fun initDaggerCoffee() : CoffeeMakerComponent =
        DaggerCoffeeMakerComponent.create()

}