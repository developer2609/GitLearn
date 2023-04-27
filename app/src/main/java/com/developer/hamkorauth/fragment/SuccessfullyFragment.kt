package com.developer.hamkorauth.fragment

import android.annotation.SuppressLint
import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.developer.hamkorauth.R
import com.developer.hamkorauth.databinding.FragmentSuccessfullyBinding

class SuccessfullyFragment : Fragment() {
    private lateinit var binding: FragmentSuccessfullyBinding

    @SuppressLint("CheckResult")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSuccessfullyBinding.inflate(layoutInflater)

        binding.btnSubmitSuccess.setOnClickListener {
            Toast.makeText(requireContext(), "successfully", Toast.LENGTH_SHORT).show()
        }



        return binding.root
    }


}