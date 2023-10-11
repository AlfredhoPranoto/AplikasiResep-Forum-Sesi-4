package com.example.aplikasiresep

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    private lateinit var backBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.detail_activity)

        backBtn = findViewById(R.id.backBtn)

        backBtn.setOnClickListener{
            val intent = Intent(this@DetailActivity, MainActivity::class.java )
            startActivity(intent)
        }
    }
}