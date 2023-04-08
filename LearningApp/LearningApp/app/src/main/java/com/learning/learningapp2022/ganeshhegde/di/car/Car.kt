package com.learning.learningapp2022.ganeshhegde.di.car



class Car {

    private val engineInstance: Engine = Engine()

    private fun startCar(){
        engineInstance.startEngine()
    }

}