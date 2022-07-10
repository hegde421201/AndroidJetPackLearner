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
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentEmailBinding


/**
 * A simple [Fragment] subclass.
 * Use the [EmailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EmailFragment : Fragment() {

    private lateinit var eBinding: FragmentEmailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        eBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_email, container, false)

        val stringName = arguments?.getString("name_text")

        eBinding.button.setOnClickListener {
            if(!TextUtils.isEmpty(eBinding.textEmailAddress.text.toString()))
            {
                val bundle = bundleOf("email_text" to eBinding.textEmailAddress.text.toString(),"name_text" to stringName)
                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment,bundle)
            }else
                Toast.makeText(activity,"Enter email",Toast.LENGTH_SHORT).show()
        }

        return eBinding.root
    }


}