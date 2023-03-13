package com.example.viewpagertwoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagertwoapp.R
import com.example.viewpagertwoapp.adapter.FruitsAdapter
import com.example.viewpagertwoapp.databinding.FragmentFruitsBinding
import com.example.viewpagertwoapp.model.Fruits

class FruitsFragment : Fragment() {

    lateinit var binding: FragmentFruitsBinding
    val fruits = ArrayList<Fruits>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFruitsBinding.inflate(layoutInflater,container,false)

        for (i in 0..20){
            fruits.add(Fruits(R.drawable.banana_icon_icons_com_68789,"Banana"))
            fruits.add(Fruits(R.drawable.apple_fruit_food_icon_218349,"Apple"))
        }

        binding.recyclerView.adapter = FruitsAdapter(requireContext(),fruits)

        return binding.root
    }

}