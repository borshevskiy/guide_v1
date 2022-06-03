package com.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {

    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val one = Card(resources.getString(R.string.fragment_three_text_one), getAssetsImage(requireContext(), THIRD))
        val two = Card(resources.getString(R.string.fragment_three_text_two), getAssetsImage(requireContext(), THIRD, 1))
        val three = Card(resources.getString(R.string.fragment_three_text_three), getAssetsImage(requireContext(), THIRD, 2))
        val four = Card(resources.getString(R.string.fragment_three_text_four), getAssetsImage(requireContext(), THIRD, 3))
        val five = Card(resources.getString(R.string.fragment_three_text_five), getAssetsImage(requireContext(), THIRD, 4))
        val six = Card(resources.getString(R.string.fragment_three_text_six), getAssetsImage(requireContext(), THIRD, 5))
        val seven = Card(resources.getString(R.string.fragment_three_text_seven), getAssetsImage(requireContext(), THIRD, 6))
        val eight = Card(resources.getString(R.string.fragment_three_text_eight), getAssetsImage(requireContext(), THIRD, 7))
        with(binding) {
            cardOne.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(one)) }
            cardTwo.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(two)) }
            cardThree.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(three)) }
            cardFour.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(four)) }
            cardFive.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(five)) }
            cardSix.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(six)) }
            cardSeven.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(seven)) }
            cardEight.setOnClickListener { findNavController().navigate(FragmentThreeDirections.actionNavThirdToNavCard(eight)) }
            imageOne.setImageDrawable(one.image)
            textOne.text = one.text
            imageTwo.setImageDrawable(two.image)
            textTwo.text = two.text
            imageThree.setImageDrawable(three.image)
            textThree.text = three.text
            imageFour.setImageDrawable(four.image)
            textFour.text = four.text
            imageFive.setImageDrawable(five.image)
            textFive.text = five.text
            imageSix.setImageDrawable(six.image)
            textSix.text = six.text
            imageSeven.setImageDrawable(seven.image)
            textSeven.text = seven.text
            imageEight.setImageDrawable(eight.image)
            textEight.text = eight.text
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}