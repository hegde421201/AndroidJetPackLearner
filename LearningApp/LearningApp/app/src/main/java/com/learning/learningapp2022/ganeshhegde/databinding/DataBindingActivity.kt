package com.learning.learningapp2022.ganeshhegde.databinding

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.learning.learningapp2022.ganeshhegde.R

//ref variable for databinding object
private lateinit var binding: DatabindingBinding

class DataBindingActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //DataBinding class is generated by ANdroid when we add dataBinding = true option in the build.gradle file
        //We use this databinder class to access the layout xml file
        //Inside the xml we have the layout tag that tells us that the widgets in the layout will be accessed using data binding
        binding = DataBindingUtil.setContentView(this, R.layout.databinding)

        //the above binder object
        binding.buttonClickMe.setOnClickListener {
            displayTextTyped()
        }

        binding.startMe.setOnClickListener {
            progressHide()
        }

        binding.employeeButton.setOnClickListener {
            binding.employee = getEmployee()

        }



    }


    private fun getEmployee() : Employee{

        return Employee(1,"Ganesh Hegde","ganesh.hegde@hegde.com")
    }


    private fun progressHide() {

        //apply scoping function
        binding.apply {
            if(startMe.text.equals(resources.getString(R.string.start))){
                startMe.setText(resources.getString(R.string.stop))
                progressBar.visibility = View.VISIBLE
            }
            else{
                startMe.setText(resources.getString(R.string.start))
                progressBar.visibility = View.INVISIBLE
            }
        }
    }

    private fun displayTextTyped() {

        binding.apply {
            textViewDisplay.text = "Hello ${editTextAnything.text}"
        }


    }
}