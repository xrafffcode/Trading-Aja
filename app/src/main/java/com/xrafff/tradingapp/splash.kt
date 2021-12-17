package com.xrafff.tradingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView

class splash : AppCompatActivity() {

    private lateinit var midView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.stb)

        midView =findViewById(R.id.splash)

        midView.startAnimation(fadeAnimation)

        val splashTo = 3000
        val homeIntent = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        }, splashTo.toLong())
    }
}