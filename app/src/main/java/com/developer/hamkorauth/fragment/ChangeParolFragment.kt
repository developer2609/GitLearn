package com.developer.hamkorauth.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.developer.hamkorauth.R
import com.developer.hamkorauth.databinding.FragmentChangeParolBinding
import com.developer.hamkorauth.databinding.FragmentForgotBinding

class ChangeParolFragment : Fragment() {
    private lateinit var binding: FragmentChangeParolBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentChangeParolBinding.inflate(layoutInflater)


        binding.btnRegisterChangeP.setOnClickListener {
            findNavController().navigate(R.id.registrationFragment2 )
        }



        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.successfullyFragment)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}