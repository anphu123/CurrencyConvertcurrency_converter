package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.view.challenge1.Challenge1
import com.example.myapplication.view.challenge2_1.Challenge2_1
import com.example.myapplication.view.challenge2_2.Challenge2_2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val challenge1Button: Button = findViewById(R.id.challenge1)
        val challenge21Button: Button = findViewById(R.id.challenge2_1)
        val challenge22Button: Button = findViewById(R.id.challenge2_2)

        challenge1Button.setOnClickListener {
            val intent = Intent(this, Challenge1::class.java)
            startActivity(intent)
        }
        challenge21Button.setOnClickListener {
            val intent = Intent(this, Challenge2_1::class.java)
            startActivity(intent)
        }
        challenge22Button.setOnClickListener {
            val intent = Intent(this, Challenge2_2::class.java)
            startActivity(intent)
        }
    }
}