package com.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.databinding.FragmentFiveBinding

class FragmentFive : Fragment() {

    private var _binding: FragmentFiveBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFiveBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val one = Card(resources.getString(R.string.fragment_five_text_one), getAssetsImage(requireContext(), FIFTH))
        val two = Card(resources.getString(R.string.fragment_five_text_two), getAssetsImage(requireContext(), FIFTH, 1))
        val three = Card(resources.getString(R.string.fragment_five_text_three), getAssetsImage(requireContext(), FIFTH, 2))
        val four = Card(resources.getString(R.string.fragment_five_text_four), getAssetsImage(requireContext(), FIFTH, 3))
        val five = Card(resources.getString(R.string.fragment_five_text_five), getAssetsImage(requireContext(), FIFTH, 4))
        val six = Card(resources.getString(R.string.fragment_five_text_six), getAssetsImage(requireContext(), FIFTH, 5))
        val seven = Card(resources.getString(R.string.fragment_five_text_seven), getAssetsImage(requireContext(), FIFTH, 6))
        val eight = Card(resources.getString(R.string.fragment_five_text_eight), getAssetsImage(requireContext(), FIFTH, 7))
        with(binding) {
            cardOne.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(one)) }
            cardTwo.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(two)) }
            cardThree.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(three)) }
            cardFour.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(four)) }
            cardFive.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(five)) }
            cardSix.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(six)) }
            cardSeven.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(seven)) }
            cardEight.setOnClickListener { findNavController().navigate(FragmentFiveDirections.actionNavFifthToNavCard(eight)) }
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