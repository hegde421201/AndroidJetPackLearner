package com.learning.learningapp2022.ganeshhegde.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.VmactivityBinding

class VMActivity : AppCompatActivity() {

    private lateinit var binding : VmactivityBinding
    private lateinit var vmViewModel: VMViewModel
    private val initialValue = 125L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.vmactivity)

        //this means lifecycle owner
        vmViewModel = ViewModelProvider(this,VMViewModelFactory(initialValue))[VMViewModel::class.java]


        binding.txtClicks.text = vmViewModel.getCurrentClickCount().toString()

        binding.buttonCounter.setOnClickListener {

            binding.txtClicks.text =  vmViewModel.getUpdatedCounter().toString()

           // binding.txtClicks.text = (++count).toString()
        }

        binding.buttonAdd.setOnClickListener {

            binding.textAdd.text = vmViewModel.getUserNumber(binding.editTextNumber.text.toString().toLong()).toString()

        }

    }
}

/*
When is the ViewModel's onCleared() called?
A ViewModel's onCleared() is called when the ViewModel is no longer required.

It will be called when the app is put into the background and the app process is killed in order to free up the system's memory.

When the user invokes finish() of an activity, its view model will be cleared(). Also when we click on the back button,
ViewModel of current activity will be cleared (onCleared()  will be invoked)
* */

