package com.learning.learningapp2022.ganeshhegde.databinding

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.learning.learningapp2022.ganeshhegde.R

private lateinit var binding: DatabindingBinding

class DataBindingActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.databinding)

        binding.buttonClickMe.setOnClickListener {
            displayTextTyped()
        }

    }

    private fun displayTextTyped() {

        binding.textViewDisplay.text = "Hello ${binding.editTextAnything.text}"
    }
}