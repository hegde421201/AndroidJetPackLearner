package com.learning.learningapp2022.ganeshhegde.coroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.CoroutinesBinding

class CoroutinesActivity : AppCompatActivity() {

    private lateinit var cBinding: CoroutinesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cBinding = DataBindingUtil.setContentView(this, R.layout.coroutines)

    }

}