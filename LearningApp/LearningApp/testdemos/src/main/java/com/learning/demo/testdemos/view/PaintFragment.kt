package com.learning.demo.testdemos.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.databinding.FragmentPaintBinding
import com.learning.demo.testdemos.viewmodel.PaintViewModel
import javax.inject.Inject

//https://github.com/atilsamancioglu/IA27-ArtBookHiltTesting/blob/master/app/src/main/java/com/atilsamancioglu/artbookhilttesting/view/ArtFragment.kt


class PaintFragment @Inject constructor(
    val paintRecyclerAdapter: PaintRecyclerAdapter
): Fragment(R.layout.fragment_paint) {

    private var fragmentBindings : FragmentPaintBinding? = null
    lateinit var viewModel : PaintViewModel

    private var fragmentBinding : FragmentPaintBinding? = null
    private val swipeCallBack = object : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
        override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            val layoutPosition = viewHolder.layoutPosition
            val selectedPainting = paintRecyclerAdapter.paints[layoutPosition]
            viewModel.deletePainting(selectedPainting)
        }

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[PaintViewModel::class.java]

        val binding = FragmentPaintBinding.bind(view)
        fragmentBindings = binding

        subscribeToObservers()

        binding.recyclerView.adapter = paintRecyclerAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        ItemTouchHelper(swipeCallBack).attachToRecyclerView(binding.recyclerView)


        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(PaintFragmentDirections.actionFirstFragmentToSecondFragment())
        }
    }

    private fun subscribeToObservers(){
        viewModel.paintsList.observe(viewLifecycleOwner, Observer {
            paintRecyclerAdapter.paints = it
        })
    }


    override fun onDestroyView() {
        fragmentBindings = null
        super.onDestroyView()
    }
}