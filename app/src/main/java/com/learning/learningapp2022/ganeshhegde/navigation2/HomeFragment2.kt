package com.learning.learningapp2022.ganeshhegde.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.learningapp2022.ganeshhegde.R

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
    }


}

