package com.example.viewpagertwoapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagertwoapp.fragments.FruitsFragment
import com.example.viewpagertwoapp.fragments.VegetablesFragment

class PagerAdapterApp(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 2 // количество табов(страниц)

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FruitsFragment()
            1 -> VegetablesFragment()

            else->{
                FruitsFragment()
            }
        }
    }


}