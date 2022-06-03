package com.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val one = Card(resources.getString(R.string.fragment_two_text_one), getAssetsImage(requireContext(), SECOND))
        val two = Card(resources.getString(R.string.fragment_two_text_two), getAssetsImage(requireContext(), SECOND, 1))
        val three = Card(resources.getString(R.string.fragment_two_text_three), getAssetsImage(requireContext(), SECOND, 2))
        val four = Card(resources.getString(R.string.fragment_two_text_four), getAssetsImage(requireContext(), SECOND, 3))
        val five = Card(resources.getString(R.string.fragment_two_text_five), getAssetsImage(requireContext(), SECOND, 4))
        val six = Card(resources.getString(R.string.fragment_two_text_six), getAssetsImage(requireContext(), SECOND, 5))
        val seven = Card(resources.getString(R.string.fragment_two_text_seven), getAssetsImage(requireContext(), SECOND, 6))
        val eight = Card(resources.getString(R.string.fragment_two_text_eight), getAssetsImage(requireContext(), SECOND, 7))
        with(binding) {
            cardOne.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(one)) }
            cardTwo.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(two)) }
            cardThree.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(three)) }
            cardFour.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(four)) }
            cardFive.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(five)) }
            cardSix.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(six)) }
            cardSeven.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(seven)) }
            cardEight.setOnClickListener { findNavController().navigate(FragmentTwoDirections.actionNavSecondToNavCard(eight)) }
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