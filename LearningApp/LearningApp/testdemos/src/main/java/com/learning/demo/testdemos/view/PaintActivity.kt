package com.learning.demo.testdemos.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.demo.testdemos.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PaintActivity : AppCompatActivity() {

 @Inject
 lateinit var fragmentFactory: PaintFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.fragmentFactory = fragmentFactory
        setContentView(R.layout.activity_paint)
    }
}

