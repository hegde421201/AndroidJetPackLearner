package com.learning.learningapp2022.ganeshhegde

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.unit.TextUnit
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var hBinding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        hBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)

        hBinding.buttonSubmit.setOnClickListener {

            if(!TextUtils.isEmpty(hBinding.editTextName.text.toString()))
            {
                val bundle = bundleOf("user_input" to hBinding.editTextName.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)
            }else {
                Toast.makeText(activity,"Please insert name",Toast.LENGTH_LONG).show()
            }

        }


        return hBinding.root
    }


}