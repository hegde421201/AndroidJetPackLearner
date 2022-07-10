package com.learning.learningapp2022.ganeshhegde.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentHome2Binding

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment2 : Fragment() {

    private lateinit var hfBinding:FragmentHome2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        hfBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home2, container, false)

        hfBinding.apply {

            buttonSign.setOnClickListener {
                it.findNavController().navigate(R.id.action_homeFragment2_to_nameFragment)
                }

           buttonTerms.setOnClickListener{
               it.findNavController().navigate(R.id.action_homeFragment2_to_termsFragment)
           }
        }



        return hfBinding.root
    }


}

