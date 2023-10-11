package com.example.aplikasiresep

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var detailBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.main_activity)

        detailBtn = findViewById(R.id.detailBtn)

        detailBtn.setOnClickListener{
            val intent = Intent(this@MainActivity, DetailActivity::class.java )
            startActivity(intent)
        }
        }


    }