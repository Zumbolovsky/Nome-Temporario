package com.example.andrewsiquieri.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById < Button >(R.id.ola)
        botao.setOnClickListener {
            val main = Intent(this, MainMenu::class.java)
            startActivity(main)
        }

    }
}
