package com.learning.demo.testdemos.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.RequestManager
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.databinding.FragmentPaintBinding
import com.learning.demo.testdemos.databinding.FragmentPaintDetailsBinding
import com.learning.demo.testdemos.util.Status
import com.learning.demo.testdemos.viewmodel.PaintViewModel
import javax.inject.Inject

class PaintDetailsFragment  @Inject constructor(
    val glide : RequestManager
): Fragment(R.layout.fragment_paint_details) {

    private var fragmentBindings : FragmentPaintDetailsBinding? = null

    lateinit var viewModel : PaintViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentPaintDetailsBinding.bind(view)
        fragmentBindings = binding

        viewModel = ViewModelProvider(requireActivity())[PaintViewModel::class.java]

        subscribeToObservers()

        binding.paintImage.setOnClickListener {
            findNavController().navigate(PaintDetailsFragmentDirections.actionSecondFragmentToThirdFragment())
        }

        val callback = object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().popBackStack() //go back to the paint fragment -- earlier
            }
        }

        binding.btnSave.setOnClickListener{
            viewModel.makePaint(binding.paintsName.text.toString(),
                binding.artistName.text.toString(),
                binding.yearValue.text.toString())
        }

        requireActivity().onBackPressedDispatcher.addCallback(callback)

    }

    private fun subscribeToObservers(){
        viewModel.selectedImageUrl.observe(viewLifecycleOwner, Observer { url ->
            fragmentBindings?.let {
                glide.load(url).into(it.paintImage)
            }
        })

        viewModel.insertPaintMessage.observe(viewLifecycleOwner, Observer {
            when(it.status){
                Status.SUCCESS -> {
                    Toast.makeText(requireContext(),"Success",Toast.LENGTH_SHORT).show()
                    findNavController().popBackStack()
                    viewModel.resetInsertArtMsg()
                }

                Status.LOADING -> {

                }

                Status.ERROR -> {
                    Toast.makeText(requireContext(),it.message ?: "Error ",Toast.LENGTH_SHORT).show()

                }
            }


        })
    }
}