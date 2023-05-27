package com.learning.demo.testdemos.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject
import com.bumptech.glide.RequestManager


class PaintFragmentFactory @Inject constructor(
    private val glide : RequestManager,
    private val paintRecyclerAdapter : PaintRecyclerAdapter,
    private val imageRecyclerAdapter: ImageRecyclerAdapter
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){

            PaintDetailsFragment::class.java.name -> PaintDetailsFragment(glide)
            PaintFragment::class.java.name -> PaintFragment(paintRecyclerAdapter)
            ImageApiFragment::class.java.name -> ImageApiFragment(imageRecyclerAdapter)
            else -> super.instantiate(classLoader, className)
        }
    }
}