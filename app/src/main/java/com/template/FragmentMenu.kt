package com.template

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.databinding.FragmentMenuBinding

class FragmentMenu : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            sectionOne.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_fifth) }
            sectionTwo.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_second) }
            sectionThree.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_third) }
            sectionFour.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_fourth) }
            sectionFive.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_fifth) }
            firstSectionImage.setImageDrawable(getAssetsImage(FIRST, requireActivity().assets.list(FIRST)!!))
            secondSectionImage.setImageDrawable(getAssetsImage(SECOND, requireActivity().assets.list(SECOND)!!))
            thirdSectionImage.setImageDrawable(getAssetsImage(THIRD, requireActivity().assets.list(THIRD)!!))
            fourthSectionImage.setImageDrawable(getAssetsImage(FOURTH, requireActivity().assets.list(FOURTH)!!))
            fifthSectionImage.setImageDrawable(getAssetsImage(FIFTH, requireActivity().assets.list(FIFTH)!!))
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getAssetsImage(path: String, asset: Array<String>) = Drawable.createFromStream(requireContext().assets.open(path + "/" + asset[0]), null)!!



    companion object {
        private const val FIRST = "first_section"
        private const val SECOND = "second_section"
        private const val THIRD = "third_section"
        private const val FOURTH = "fourth_section"
        private const val FIFTH = "fifth_section"
    }
}