package com.learning.learningapp2022.ganeshhegde.di.coffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.learningapp2022.ganeshhegde.LearnerAppApplication
import com.learning.learningapp2022.ganeshhegde.R
import javax.inject.Inject

class CoffeeActivity : AppCompatActivity() {

    @Inject lateinit var coffeeMaker: CoffeeMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee)

       // DaggerCoffeeMakerComponent.create().getCoffeeMaker().brew()

      //  DaggerCoffeeMakerComponent.create().inject(this)

        (application as LearnerAppApplication).coffeeMakerComponent.inject(this)
        coffeeMaker.brew()
    }

}


/*

val heater = ElectricHeater()
val pump = Thermosiphon(heater)
val coffeMaker = CoffeeMaker(heater, pump)
coffeeMaker.brew()
* */