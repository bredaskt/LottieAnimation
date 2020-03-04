package com.bbreda.lottie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setLottie()
    }

    private fun setLottie() {
        val animation = findViewById<LottieAnimationView>(R.id.progressBar)
        animation.speed = 2.0F // How fast does the animation play
        animation.progress = 50F // Starts the animation from 50% of the beginning
        animation.addAnimatorUpdateListener {
            // Called everytime the frame of the animation changes
        }
        animation.repeatMode = LottieDrawable.RESTART // Restarts the animation (you can choose to reverse it as well)
        animation.cancelAnimation() // Cancels the animation
    }


}
