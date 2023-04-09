package com.learning.learningapp2022.ganeshhegde.di.coffee

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ElectricHeaterModule {

    @Binds
    abstract fun providesElectricHeater(electricHeater: ElectricHeater) : Heater
}