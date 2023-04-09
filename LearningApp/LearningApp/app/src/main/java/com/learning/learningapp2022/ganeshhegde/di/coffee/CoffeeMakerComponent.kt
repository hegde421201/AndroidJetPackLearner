package com.learning.learningapp2022.ganeshhegde.di.coffee

import com.learning.learningapp2022.ganeshhegde.di.phone.DIActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ElectricHeaterModule::class])
interface CoffeeMakerComponent {
  //  fun getCoffeeMaker(): CoffeeMaker

    fun inject(coffeeActivity: CoffeeActivity)
}


