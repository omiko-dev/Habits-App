package com.example.blush.presentation.introductions

import androidx.navigation.fragment.findNavController
import com.example.blush.BaseFragment
import com.example.blush.databinding.FragmentIntroThreeBinding

class IntroThreeFragment : BaseFragment<FragmentIntroThreeBinding>(FragmentIntroThreeBinding::inflate) {
    override fun bind() {

    }

    override fun listener() {
        navigate()
    }

    private fun navigate(){
        with(binding){
            acpNext.setOnClickListener {
                findNavController().navigate(IntroThreeFragmentDirections.actionIntroThreeFragmentToIntroFourFragment())
            }
            acpSkip.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }


}