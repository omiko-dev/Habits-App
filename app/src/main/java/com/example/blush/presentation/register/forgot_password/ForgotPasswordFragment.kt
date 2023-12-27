package com.example.blush.presentation.register.forgot_password

import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentForgotPasswordBinding


class ForgotPasswordFragment : BaseFragment<FragmentForgotPasswordBinding>(FragmentForgotPasswordBinding::inflate) {
    override fun bind() {

    }

    override fun listener() {
        goToLogin()
    }

    private fun goToLogin(){
        binding.ibGoBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}