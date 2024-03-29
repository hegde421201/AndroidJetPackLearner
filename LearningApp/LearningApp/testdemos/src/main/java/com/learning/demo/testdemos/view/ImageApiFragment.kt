package com.learning.demo.testdemos.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.RequestManager
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.databinding.FragmentImageApiBinding
import com.learning.demo.testdemos.databinding.FragmentPaintBinding
import com.learning.demo.testdemos.databinding.FragmentPaintDetailsBinding
import com.learning.demo.testdemos.util.Status
import com.learning.demo.testdemos.viewmodel.PaintViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class ImageApiFragment @Inject constructor(
     val imageRecyclerAdapter: ImageRecyclerAdapter
) :Fragment(R.layout.fragment_image_api) {

    lateinit var viewModel:PaintViewModel

    private var fragmentBindings:FragmentImageApiBinding? = null



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[PaintViewModel::class.java]

        val binding = FragmentImageApiBinding.bind(view)

        fragmentBindings = binding

        var job : Job? = null

        binding.searchText.addTextChangedListener{
            job?.cancel()
            job = lifecycleScope.launch {
                delay(1000)
                it?.let{
                    if(it.toString().isNotEmpty())
                        viewModel.searchForImage(it.toString())
                }
            }
        }

        subscribeToObservers()



        binding.imageRecyclerview.adapter = imageRecyclerAdapter
        binding.imageRecyclerview.layoutManager = GridLayoutManager(requireContext(),3)
        imageRecyclerAdapter.setOnItemClickListener {
            findNavController().popBackStack()
            viewModel.setSelectedImage(it)
        }

    }

    fun subscribeToObservers(){

       viewModel.imagesList.observe(viewLifecycleOwner, Observer {
           when(it.status){
               Status.SUCCESS ->{
                   val urls = it.data?.hits?.map { imageResult -> imageResult?.previewURL }

              imageRecyclerAdapter.images = urls as List<String>
                   fragmentBindings?.progressBar?.visibility = View.GONE
               }

               Status.ERROR ->{
                   Toast.makeText(requireContext(),it.message ?: "Error",Toast.LENGTH_SHORT).show()
                   fragmentBindings?.progressBar?.visibility = View.GONE
               }

               Status.LOADING ->{
                   fragmentBindings?.progressBar?.visibility = View.VISIBLE
               }
           }
       })
    }

}