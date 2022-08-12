package com.example.basicfrontend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.button_mainActivity_start)

        fullNameMessage()
    }

    fun fullNameMessage(){
        btnStart.setOnClickListener{
            Toast.makeText(this, getString(R.string.text_name), Toast.LENGTH_LONG).show()
        }
    }
}