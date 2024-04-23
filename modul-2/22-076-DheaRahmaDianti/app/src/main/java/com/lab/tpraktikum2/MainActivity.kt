package com.lab.tpraktikum2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val relativeView: Button = findViewById<Button>(R.id.button_relative)
        relativeView.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_relative -> {
                val intent = Intent(this, ConstrainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    }
