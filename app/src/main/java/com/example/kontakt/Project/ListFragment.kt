package com.example.kontakt.Project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kontakt.Adapter.AdapterRv
import com.example.kontakt.Data.User
import com.example.kontakt.R
import com.example.kontakt.databinding.FragmentListBinding
import com.example.kontakt.db.DataBaseHelper
import com.example.kontakt.utils.Data

class ListFragment : Fragment() {
    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }
    private lateinit var adapter: AdapterRv
    private lateinit var myDbHalper: DataBaseHelper
    private lateinit var list: ArrayList<User>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        list = ArrayList()
        myDbHalper = DataBaseHelper(binding.root.context)
        list.addAll(myDbHalper.getAllFood())
        adapter = AdapterRv(list)
        binding.rv.adapter = adapter

        return binding.root
    }
}