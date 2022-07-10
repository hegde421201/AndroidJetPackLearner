package com.learning.learningapp2022.ganeshhegde.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.FragmentWelcomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {

    private lateinit var welcomeBinding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        welcomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome,container,false)

        val email= arguments?.getString("email_text")
        val name = arguments?.getString("name_text")

        welcomeBinding.textViewEmail.text = email
        welcomeBinding.textViewName.text = name

        welcomeBinding.buttonTerms2.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
        }

        return welcomeBinding.root
    }

   
}