package com.learning.learningapp2022.ganeshhegde.di.phone

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    //fun getSmartPhone() : SmartPhone
    fun inject(diActivity: DIActivity)
}