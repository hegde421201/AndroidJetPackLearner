package com.learning.learningapp2022.ganeshhegde.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.VmactivityBinding

class VMActivity : AppCompatActivity() {

    private lateinit var binding : VmactivityBinding //data binding object for this activity
    private lateinit var vmViewModel: VMViewModel //viewmodel class created as soon as this activity is created
    private val initialValue = 200L //initial value of SUM (adder initial value)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //instantiate the data binder object
        binding = DataBindingUtil.setContentView(this, R.layout.vmactivity)

        //this means lifecycle owner using factory class
        vmViewModel = ViewModelProvider(this,VMViewModelFactory(initialValue))[VMViewModel::class.java]

        //initial value is set to 0 --- convert integer to string
        binding.txtClicks.text = vmViewModel.getCurrentClickCount().toString()

        //initial value is set to 0 ---- convert integer to string
        binding.textAdd.text = vmViewModel.getInitialSum().toString()

        binding.apply {

            buttonCounter.setOnClickListener {

                //get the updated count after click
                binding.txtClicks.text =  vmViewModel.getUpdatedCounter().toString()

            }

            buttonAdd.setOnClickListener {
                textAdd.text = vmViewModel.getUserNumber(editTextNumber.text.toString().toLong()).toString()
            }
        }

       /* binding.buttonAdd.setOnClickListener {

            //adder implementation using viewmodel
            binding.textAdd.text = vmViewModel.getUserNumber(binding.editTextNumber.text.toString().toLong()).toString()

        }*/

    }


}

/*
When is the ViewModel's onCleared() called?
A ViewModel's onCleared() is called when the ViewModel is no longer required.

It will be called when the app is put into the background and the app process is killed in order to free up the system's memory.

When the user invokes finish() of an activity, its view model will be cleared(). Also when we click on the back button,
ViewModel of current activity will be cleared (onCleared()  will be invoked)
* */

