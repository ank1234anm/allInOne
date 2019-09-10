package com.example.ankit.allione

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goTosplash()
    }
    fun goTosplash()
    {
        intent = Intent(this,SplashActivityActivity:: class.java)
        startActivity(intent)
    }

}
