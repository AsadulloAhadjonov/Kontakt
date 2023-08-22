package com.example.kontakt.Project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kontakt.Data.User
import com.example.kontakt.R
import com.example.kontakt.databinding.FragmentAddBinding
import com.example.kontakt.db.DataBaseHelper

class AddFragment : Fragment() {
    private val binding by lazy { FragmentAddBinding.inflate(layoutInflater) }
    private lateinit var mydbhelper:DataBaseHelper
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mydbhelper = DataBaseHelper(binding.root.context)
        binding.btnSave.setOnClickListener {
            val user = User(name = binding.edtName.text.toString(), raqam = binding.edtNumber.text.toString())
            mydbhelper.addFood(user)
            findNavController().popBackStack()
        }

        return binding.root
    }
}