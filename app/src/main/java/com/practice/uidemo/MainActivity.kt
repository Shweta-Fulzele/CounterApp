package com.practice.uidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.practice.uidemo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val tvNumber = findViewById<TextView>(R.id.tvNumber)
        var count = 0

        btnClickMe.setOnClickListener {
            count += 1
            tvNumber.text = count.toString()
        }
    }
}