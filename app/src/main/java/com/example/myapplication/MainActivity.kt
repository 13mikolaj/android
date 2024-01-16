package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var simpleTV = findViewById<TextView>(R.id.simpleTV)
        simpleTC.text = "Nie zostałem jeszcze kliknięty"

        var simpleBtn = findViewById<Button>(R.id.simpleBtn)
        simpleBtn.setOnClickListener {
            simpleTV.text = "Kliknąłeś button"
        }
    }
}