package com.example.viewpagertwoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagertwoapp.adapter.PagerAdapterApp
import com.example.viewpagertwoapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        /*binding.viewPager.setPageTransformer(PagerTransformer())*/

        binding.viewPager.adapter = PagerAdapterApp(this)
        val tabLayoutMediator = TabLayoutMediator(binding.tabs, binding.viewPager,true){
                tab , position ->
            tab.text = getItemTitle(position)
        }

        tabLayoutMediator.attach()
    }

    val nameOfTabs = arrayOf("Фрукты", "Овощи")

    fun getItemTitle(position: Int): String{
        return when(position){
            0 -> nameOfTabs[0]
            1 -> nameOfTabs[1]
            else -> { nameOfTabs[0]}
        }
    }
}