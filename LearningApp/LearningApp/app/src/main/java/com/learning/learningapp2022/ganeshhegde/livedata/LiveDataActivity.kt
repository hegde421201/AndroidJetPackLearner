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
    private val initialValue = 12.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //define the data binding object that connects view and view model
        mBinding = DataBindingUtil.setContentView(this, R.layout.livedataexample)

        //ViewModelProvider class uses the viewmodelfactory class to generate the viewmodel
        //this -- means the lifecycle owner
        ldViewModel = ViewModelProvider(this,LiveDataVMFactory(initialValue)).get(LDViewModel::class.java)
        mBinding.lifecycleOwner = this
        mBinding.ldExampleViewModel = ldViewModel

      //  ldViewModel.

        //observe the changes in the mutablelive data via the observer
/*
        ldViewModel.multData.observe(this, Observer {
            mBinding.textView.text = it.toString()
        })
*/



    }
}