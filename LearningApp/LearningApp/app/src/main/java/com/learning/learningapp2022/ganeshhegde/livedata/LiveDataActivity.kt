package com.learning.learningapp2022.ganeshhegde.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.LivedataexampleBinding

class LiveDataActivity : AppCompatActivity() {

    //Livedata ---- a lifecycle aware observable data holder class
    //It only updates observers in an active lifecycle state.
    //it automatically updates UI when app data changes --- we get real time updates from the data sources
    //with livedata wo need not write code to handle lifecycle manually --- no memory leaks or crashes happen due to destroyed activity
    //or fragments

    //mutable livedata is a subclass of livedata class where the data is edited or updated

    private lateinit var mBinding: LivedataexampleBinding
    private lateinit var ldViewModel: LDViewModel
    private val initialValue = 12.0 //initial value for the multiplier example

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //define the data binding object that connects view and view model
        mBinding = DataBindingUtil.setContentView(this, R.layout.livedataexample)

        //ViewModelProvider class uses the viewmodelfactory class to generate the customised viewmodel
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



/*
 1) Where do we create/generate LiveData?

We usually define LiveData, inside ViewModel classes.
Also, supporting libraries like Room and Retrofit allows us to get data directly in LiveData format.

2) From where do we observe LiveData?

LiveData is a lifecycle-aware observable data holder class.
In android we have only 3 app components with lifecycles. Activities , fragments and services.
So, form activities, fragments and services we can observe LiveData.

3) What is the difference between RxJava and LiveData?

RxJava is not a lifecycle aware component.
So, data stream does not go off, when activity, fragment or service becomes inactive.
As a result of that, memory leaks or crashes can happen.
Therefore, we have to write codes to dispose them manually.
But, on the other hand, Android LiveData aware of lifecycle status changes.
And, they clean up themselves(stop emitting data) when their associated lifecycle is destroyed.


4) What is MutableLiveData, what is the difference between LiveData and MutableLiveData ?

MutableLiveData class is a subclass of LiveData class. In other words,
MutableLiveData child class has created by extending the parent LiveData class.

A MutableLiveData instance can do everything a LiveData instnce can do and more.
Data in a LiveData object are only readable. We cannot update those values.
But, in the other hand, a Mutable LiveData object allows us to change(update) its values.
So, When we are creating our own live data(mostly in ViewModels), we define them as MutableLiveData.
But, when we are getting live data from other libraries such as Room and Retrofit we get them as LiveData.
We can easily transfer values between those two formats.


* */