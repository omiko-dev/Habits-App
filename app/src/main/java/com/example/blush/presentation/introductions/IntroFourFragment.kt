package com.example.blush.presentation.introductions

import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentIntroFourBinding

class IntroFourFragment : BaseFragment<FragmentIntroFourBinding>(FragmentIntroFourBinding::inflate) {
    override fun bind() {

    }

    override fun listener() {
        binding.acpStart.setOnClickListener {
            findNavController().navigate(IntroFourFragmentDirections.actionIntroFourFragmentToLoginFragment())
        }
    }
}