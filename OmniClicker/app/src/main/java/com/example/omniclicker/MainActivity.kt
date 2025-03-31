package com.example.omniclicker

import android.os.Bundle
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var clickCount = 0
    private lateinit var clickCountText: TextView
    private lateinit var omniManImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickCountText = findViewById(R.id.clickCountText)
        omniManImage = findViewById(R.id.omniManImage)

        omniManImage.setOnClickListener {
            clickCount++
            clickCountText.text = "Clicks: $clickCount"
        }
    }
} 