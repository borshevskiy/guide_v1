package com.template

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
            sectionOne.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_first) }
            sectionTwo.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_second) }
            sectionThree.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_third) }
            sectionFour.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_fourth) }
            sectionFive.setOnClickListener { findNavController().navigate(R.id.action_nav_menu_to_nav_fifth) }
            firstSectionImage.setImageDrawable(getAssetsImage(requireContext(), FIRST))
            secondSectionImage.setImageDrawable(getAssetsImage(requireContext(), SECOND))
            thirdSectionImage.setImageDrawable(getAssetsImage(requireContext(), THIRD))
            fourthSectionImage.setImageDrawable(getAssetsImage(requireContext(), FOURTH))
            fifthSectionImage.setImageDrawable(getAssetsImage(requireContext(), FIFTH))
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}