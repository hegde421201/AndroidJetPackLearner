package com.learning.demo.testdemos.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.RequestManager
import com.learning.demo.testdemos.R
import javax.inject.Inject

class ImageApiFragment @Inject constructor(
    private val imageRecyclerAdapter: ImageRecyclerAdapter
) :Fragment(R.layout.fragment_image_api) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}