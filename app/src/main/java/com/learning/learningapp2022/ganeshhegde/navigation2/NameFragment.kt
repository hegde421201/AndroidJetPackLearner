package com.learning.learningapp2022.ganeshhegde.navigation2

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentHomeBinding
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentNameBinding


/**
 * A simple [Fragment] subclass.
 * Use the [NameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NameFragment : Fragment() {

    private lateinit var nBinding: FragmentNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        nBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_name,container,false)

        nBinding.buttonNext.setOnClickListener {
            if(TextUtils.isEmpty(nBinding.editTextName2.text.toString()))
                Toast.makeText(activity,"Enter name",Toast.LENGTH_SHORT).show()
            else
            {
                var bundle = bundleOf("name_text" to nBinding.editTextName2.text.toString())
                it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment,bundle)
            }
        }

        return nBinding.root
    }


}