package com.learning.demo.testdemos.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.databinding.FragmentPaintBinding

class PaintFragment : Fragment(R.layout.fragment_paint) {

    private var fragmentBindings : FragmentPaintBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentPaintBinding.bind(view)
        fragmentBindings = binding

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(PaintFragmentDirections.actionFirstFragmentToSecondFragment())
        }
    }


    override fun onDestroyView() {
        fragmentBindings = null
        super.onDestroyView()
    }
}