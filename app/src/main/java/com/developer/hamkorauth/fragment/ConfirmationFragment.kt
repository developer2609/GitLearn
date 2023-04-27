package com.developer.hamkorauth.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.developer.hamkorauth.R
import com.developer.hamkorauth.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {
    private lateinit var binding: FragmentConfirmationBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding=FragmentConfirmationBinding.inflate(layoutInflater)





        binding.idResend.setOnClickListener {
            Toast.makeText(requireContext(), " Resend!!", Toast.LENGTH_SHORT).show()
        }

        binding.btnSubmit12.setOnClickListener {
        }


            binding.edtNumber1.addTextChangedListener(object :TextWatcher{
               override fun beforeTextChanged(
                   s: CharSequence?,
                   start: Int,
                   count: Int,
                   after: Int
               ) {
               }

               override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


                   if (binding.edtNumber1.text.toString().length==1  ){
                       binding.edtNumber2.requestFocus()


                   }



               }

               override fun afterTextChanged(s: Editable?) {
               }
           })

        binding.edtNumber2.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


                if (binding.edtNumber2.text.toString().length==1  ){
                    binding.edtNumber3.requestFocus()


                }



            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.edtNumber3.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


                if (binding.edtNumber3.text.toString().length==1  ){
                    binding.edtNumber4.requestFocus()


                }



            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.edtNumber4.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


                if (binding.edtNumber4.text.toString().length==1  ){
                    binding.edtNumber5.requestFocus()


                }



            }

            override fun afterTextChanged(s: Editable?) {
            }
        })






      binding.btnSubmit12.setOnClickListener {
          findNavController().navigate(R.id.forgotFragment3)
      }




        binding.btnRegisterConfrim.setOnClickListener {
            findNavController().navigate(R.id.registrationFragment2)
        }







        return binding.root
    }


}