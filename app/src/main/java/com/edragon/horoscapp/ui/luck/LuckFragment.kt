package com.edragon.horoscapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edragon.horoscapp.R
import com.edragon.horoscapp.databinding.FragmentLuckBinding


class LuckFragment : Fragment() {

    private var _binding:FragmentLuckBinding? = null
    private val bindig get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return bindig.root

    }

}