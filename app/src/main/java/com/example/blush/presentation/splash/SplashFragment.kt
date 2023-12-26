package com.example.blush.presentation.splash

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override fun bind() {
        viewLifecycleOwner.lifecycleScope.launch {
            delay(3000)
            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToIntroOneFragment())
        }
    }

    override fun listener() {

    }
}