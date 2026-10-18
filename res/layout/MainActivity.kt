package com.example.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // XML UI Element-গুলোর সাথে কানেক্ট করা
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val etName = findViewById<EditText>(R.id.etName)
        val btnGreet = findViewById<Button>(R.id.btnGreet)
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnCount = findViewById<Button>(R.id.btnCount)

        // ১. গ্রিটিং বাটনের কাজ
        btnGreet.setOnClickListener {
            val name = etName.text.toString().trim()
            if (name.isNotEmpty()) {
                tvTitle.text = "Hello, $name!"
                Toast.makeText(this, "Welcome, $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter your name first", Toast.LENGTH_SHORT).show()
            }
        }

        // ২. কাউন্টার বাটনের কাজ
        btnCount.setOnClickListener {
            count++
            tvCounter.text = "Count: $count"
        }
    }
}
