package com.example.prkt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView3)
        val textView2 = findViewById<TextView>(R.id.textView4)


        button.setOnClickListener {
            val random = Random.nextInt(10, 99) + 1
            val random2 = Random.nextInt(100, 999) + 1
            textView.text = random.toString()
            textView2.text = random2.toString()
        }
    }
}