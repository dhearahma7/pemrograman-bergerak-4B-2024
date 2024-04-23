package com.lab.tpraktikum2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RelativeLayoutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.relative)

        // menyimpan id dari view ke variabel
//        val back: ImageView = findViewById<ImageButton>(R.id.logo)
        // memberikan listener ke variabel
        val relativeView: ImageView = findViewById<ImageView>(R.id.logo)
        relativeView.setOnClickListener(this)// ini bakal merah, tekan alt + enter dan pilih let... dan ok nanti class ini bakal ada extend tambahaan selain AppCompatActivity(), yaitu View.OnClickListener dan membuatkan function override fun onClick(v: View?) secara otomatis
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.logo -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}