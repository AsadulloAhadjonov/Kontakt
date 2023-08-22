package com.example.kontakt.Project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kontakt.R
import com.example.kontakt.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.btnMenyu.setOnClickListener {
            findNavController().navigate(R.id.listFragment)

        }
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.addFragment)
        }

        return binding.root
    }

}