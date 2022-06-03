package com.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.databinding.FragmentFourBinding

class FragmentFour : Fragment() {

    private var _binding: FragmentFourBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val one = Card(resources.getString(R.string.fragment_four_text_one), getAssetsImage(requireContext(), FOURTH))
        val two = Card(resources.getString(R.string.fragment_four_text_two), getAssetsImage(requireContext(), FOURTH, 1))
        val three = Card(resources.getString(R.string.fragment_four_text_three), getAssetsImage(requireContext(), FOURTH, 2))
        val four = Card(resources.getString(R.string.fragment_four_text_four), getAssetsImage(requireContext(), FOURTH, 3))
        val five = Card(resources.getString(R.string.fragment_four_text_five), getAssetsImage(requireContext(), FOURTH, 4))
        val six = Card(resources.getString(R.string.fragment_four_text_six), getAssetsImage(requireContext(), FOURTH, 5))
        val seven = Card(resources.getString(R.string.fragment_four_text_seven), getAssetsImage(requireContext(), FOURTH, 6))
        val eight = Card(resources.getString(R.string.fragment_four_text_eight), getAssetsImage(requireContext(), FOURTH, 7))
        with(binding) {
            cardOne.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(one)) }
            cardTwo.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(two)) }
            cardThree.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(three)) }
            cardFour.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(four)) }
            cardFive.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(five)) }
            cardSix.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(six)) }
            cardSeven.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(seven)) }
            cardEight.setOnClickListener { findNavController().navigate(FragmentFourDirections.actionNavFourthToNavCard(eight)) }
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