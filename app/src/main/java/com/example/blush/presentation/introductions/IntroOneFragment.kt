package com.example.blush.presentation.introductions

import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentIntroOneBinding


class IntroOneFragment : BaseFragment<FragmentIntroOneBinding>(FragmentIntroOneBinding::inflate) {
    override fun bind() {

    }

    override fun listener() {
        binding.acbNext.setOnClickListener {
            findNavController().navigate(IntroOneFragmentDirections.actionIntroOneFragmentToIntroTwoFragment())
        }
    }

}