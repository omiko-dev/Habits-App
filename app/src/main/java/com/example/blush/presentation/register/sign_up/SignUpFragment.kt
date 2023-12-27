package com.example.blush.presentation.register.sign_up

import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding>(FragmentSignUpBinding::inflate) {
    override fun bind() {

    }

    override fun listener() {
        goToLogin()
    }

    private fun goToLogin(){
        binding.btnSignIn.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}