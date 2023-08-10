package com.example.githelloworld

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "Button is pressed", Toast.LENGTH_SHORT).show()
        }
    }
}