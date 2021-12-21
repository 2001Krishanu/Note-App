package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    lateinit var tv2:TextView
    lateinit var tv3:TextView
    lateinit var tv4:TextView
    lateinit var animation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tv4 = findViewById(R.id.tv4)
        animation = AnimationUtils.loadAnimation(applicationContext,R.anim.sample_animation)


        tv4.startAnimation(animation)
        Handler().postDelayed({
            val startAct = Intent(this,MainActivity::class.java)
            finish()
            startActivity(startAct)
        },5000)
    }
}