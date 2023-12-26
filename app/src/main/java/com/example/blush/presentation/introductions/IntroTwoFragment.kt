package com.example.blush.presentation.introductions

import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentIntroTwoBinding

class IntroTwoFragment : BaseFragment<FragmentIntroTwoBinding>(FragmentIntroTwoBinding::inflate) {
    override fun bind() {
    }

    override fun listener() {
        navigate()
    }

    private fun navigate(){
        with(binding){
            acpNext.setOnClickListener {
                findNavController().navigate(IntroTwoFragmentDirections.actionIntroTwoFragmentToIntroThreeFragment())
            }
            acpSkip.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

}