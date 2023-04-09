package com.learning.learningapp2022.ganeshhegde.di.phone

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize:Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard{
        Log.i("MEMCARD","Size of memory is $memorySize")
        return MemoryCard()
    }
}