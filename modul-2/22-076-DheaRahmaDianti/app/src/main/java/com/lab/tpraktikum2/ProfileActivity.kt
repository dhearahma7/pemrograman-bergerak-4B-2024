package com.lab.tpraktikum2

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.profile)

        val back_button: ImageView = findViewById<ImageButton>(R.id.logo)
        back_button.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }
}