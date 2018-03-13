package com.example.andrewsiquieri.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btCadastrar = cadastrarButton
        btCadastrar.setOnClickListener {
            val main = Intent(this, CadastrarActivity::class.java)
            startActivity(main)
        }

        val btLogin = loginButton
        btLogin.setOnClickListener {
            val usuario = userField.text.toString()
            val senha = senhaField.text.toString()
            if (usuario == "admin" && senha == "admin") {
                val main = Intent(this, ListActivity::class.java)
                startActivity(main)
            } else {
                Toast.makeText(this, "Usuário e/ou senha inválido(s)!", Toast.LENGTH_LONG).show()
            }
        }

    }
}