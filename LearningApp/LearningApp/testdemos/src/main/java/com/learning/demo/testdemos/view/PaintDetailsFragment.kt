package com.learning.demo.testdemos.view

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.RequestManager
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.databinding.FragmentPaintBinding
import com.learning.demo.testdemos.databinding.FragmentPaintDetailsBinding
import javax.inject.Inject

class PaintDetailsFragment  @Inject constructor(
    val glide : RequestManager
): Fragment(R.layout.fragment_paint_details) {

    private var fragmentBindings : FragmentPaintDetailsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentPaintDetailsBinding.bind(view)

        fragmentBindings = binding

        binding.paintImage.setOnClickListener {
            findNavController().navigate(PaintDetailsFragmentDirections.actionSecondFragmentToThirdFragment())
        }

        val callback = object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().popBackStack() //go back to the paint fragment -- earlier
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callback)

    }
}