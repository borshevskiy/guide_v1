package com.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val one = Card(resources.getString(R.string.fragment_first_text_one), getAssetsImage(requireContext(), FIRST))
        val two = Card(resources.getString(R.string.fragment_first_text_two), getAssetsImage(requireContext(), FIRST, 1))
        val three = Card(resources.getString(R.string.fragment_first_text_three), getAssetsImage(requireContext(), FIRST, 2))
        val four = Card(resources.getString(R.string.fragment_first_text_four), getAssetsImage(requireContext(), FIRST, 3))
        val five = Card(resources.getString(R.string.fragment_first_text_five), getAssetsImage(requireContext(), FIRST, 4))
        val six = Card(resources.getString(R.string.fragment_first_text_six), getAssetsImage(requireContext(), FIRST, 5))
        val seven = Card(resources.getString(R.string.fragment_first_text_seven), getAssetsImage(requireContext(), FIRST, 6))
        val eight = Card(resources.getString(R.string.fragment_first_text_eight), getAssetsImage(requireContext(), FIRST, 7))
        with(binding) {
            cardOne.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(one)) }
            cardTwo.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(two)) }
            cardThree.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(three)) }
            cardFour.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(four)) }
            cardFive.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(five)) }
            cardSix.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(six)) }
            cardSeven.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(seven)) }
            cardEight.setOnClickListener { findNavController().navigate(FragmentOneDirections.actionNavFirstToNavCard(eight)) }
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