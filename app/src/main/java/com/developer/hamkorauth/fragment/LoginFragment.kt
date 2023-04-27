package com.developer.hamkorauth.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.developer.hamkorauth.R
import com.developer.hamkorauth.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentLoginBinding.inflate(layoutInflater)



        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.confirmationFragment)

        }


        binding.btnRegisterLog.setOnClickListener {
            findNavController().navigate(R.id.registrationFragment2)
        }

        binding.btnForgotPassword.setOnClickListener {
            Toast.makeText(requireContext(), " Forgot password !!", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

}

