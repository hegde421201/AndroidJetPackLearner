package com.learning.learningapp2022.ganeshhegde.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.LivedataexampleBinding

class LiveDataActivity : AppCompatActivity() {

    private lateinit var mBinding: LivedataexampleBinding
    private lateinit var ldViewModel: LDViewModel
    private val initialValue = 12.0 //initial value for the multiplier example

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //define the data binding object that connects view and view model
        mBinding = DataBindingUtil.setContentView(this, R.layout.livedataexample)

        //ViewModelProvider class uses the viewmodelfactory class to generate the viewmodel
        //this -- means the lifecycle owner
        ldViewModel = ViewModelProvider(this,LiveDataVMFactory(initialValue)).get(LDViewModel::class.java)

        //set the lifecycle owner because we are using live data with data binding
        mBinding.lifecycleOwner = this

        //we are using data binding with the viewmodel here
        mBinding.ldExampleViewModel = ldViewModel

        // using live data directly as live data source without using live data observer function ---- see the layout livedataexample.xml
        // android:text="@{String.valueOf(ldExampleViewModel.multData)}"

        //we have commented the observer below

        //observe the changes in the mutablelive data via the observer
       /* ldViewModel.multData.observe(this) {
            mBinding.textView.text = it.toString()
        }*/

        //Livedata --- A lifecycle aware observable data holder class.
        //Activity,Fragment and service can act as observer to the livedata. Livedata updates observers in an activity lifecycle state.

        //livedata - updates the UI automatically when app data changes.
        //There is no need to write codes to handle lifecycle manually.
        //Livedata objects clean up themselves(stop emitting data) when their associated lifecycle is destroyed.

        /*
         We can use one way data binding to show the user some data (app to user data flow).
         We can also use one way data binding to get user input(user to app data flow) .
        If, for some reason, we want to both show data and get user input over the same widget,
        in other words, if we need a two-way data flow, we should use two-way data binding .
        * */

    }
}