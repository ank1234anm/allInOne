package com.example.ankit.allione

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.*

class SplashActivityActivity : AppCompatActivity() {


    private var imgSplashImage: ImageView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activity)
        findViews()
        setImage()
    }
    private fun findViews() {
        imgSplashImage = findViewById<View>(R.id.imgSplashImage) as ImageView
    }
    private fun setImage()
    {
        Timer().schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    imgSplashImage?.visibility = View.GONE;


                 }
            }
        }, 2000)

    }

}
