package com.example.viewpagertwoapp.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.viewpagertwoapp.MainActivity
import com.example.viewpagertwoapp.R
import com.example.viewpagertwoapp.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splash_anim = AnimationUtils.loadAnimation(this, R.anim.splash_anim)
        binding.imageViewSplash.startAnimation(splash_anim)
        splash_anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                //code когда анимация начилась
            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                Toast.makeText(this@SplashActivity, "repeat", Toast.LENGTH_SHORT).show()
            }

        })

    }
}