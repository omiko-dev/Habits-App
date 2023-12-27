package com.example.blush.presentation.register.login

import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {
    override fun bind() {

    }

    override fun listener() {
        fieldBind()
        goToSignUp()
        goToForgotPass()
    }



    private fun fieldBind(){
        with(binding){
            etEmail.addTextChangedListener {

            }

            etPassword.addTextChangedListener {

            }
        }
    }

    private fun goToSignUp(){
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignUpFragment())
        }
    }

    private fun goToForgotPass(){
        binding.forgotPass.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToForgotPasswordFragment())
        }
    }

}