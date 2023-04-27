package com.developer.hamkorauth.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.developer.hamkorauth.R
import com.developer.hamkorauth.databinding.FragmentForgotBinding

class ForgotFragment : Fragment() {
    private lateinit var binding: FragmentForgotBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentForgotBinding.inflate(layoutInflater)




        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.registrationFragment2)
        }



        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.changeParolFragment2)
        }

        return binding.root
    }


}