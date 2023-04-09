package com.learning.learningapp2022.ganeshhegde.di.phone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.learningapp2022.ganeshhegde.LearnerAppApplication
import com.learning.learningapp2022.ganeshhegde.R
import javax.inject.Inject

class DIActivity : AppCompatActivity() {

    @Inject lateinit var smartPhone : SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diactivity)

        /*
         //here we define all dependencies and then inject
        val battery = Battery()
        val memoryCard = MemoryCard()
        val serviceProvider = ServiceProvider()
        val simCard = SimCard(serviceProvider)
        val smartPhone = SmartPhone(battery,simCard,memoryCard) //we injected dependencies to the class constructor

        smartPhone.makeACallWithRecording()
        * */

     //   DaggerSmartPhoneComponent.create().getSmartPhone().makeACallWithRecording()

       // DaggerSmartPhoneComponent.create().inject(this)


        (application as LearnerAppApplication).smartPhoneComponent.inject(this)

        smartPhone.makeACallWithRecording()

    }
}