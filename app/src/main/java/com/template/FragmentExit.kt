package com.template

import android.os.Bundle
import androidx.fragment.app.Fragment

class FragmentExit : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().finish()
    }
}