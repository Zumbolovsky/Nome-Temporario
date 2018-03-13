package com.example.andrewsiquieri.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.andrewsiquieri.kotlinapp.ui.adapter.SpinnerAdapter
import kotlinx.android.synthetic.main.activity_cadastrar.*

class CadastrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        val spinner: Spinner = estadoSpinner

        val listaEstados = resources.getStringArray(R.array.cadastroPessoalEstados).toMutableList()

        val spinnerAdapter = SpinnerAdapter(this, android.R.layout.simple_spinner_dropdown_item)

        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerAdapter.addAll(listaEstados)
        spinnerAdapter.add(getString(R.string.cadastroPessoalEstado))

        spinner.adapter = spinnerAdapter
        spinner.setSelection(spinnerAdapter.count) //display hint

        spinner.setOnTouchListener({ _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                if (spinner.selectedItem.toString() == listaEstados[0]) {
                    spinner.setSelection(spinnerAdapter.count)
                }
                if (spinner.selectedItem.toString() == getString(R.string.cadastroPessoalEstado)) {
                    spinner.setSelection(0)
                }
            }
            false
        })

        val botaoConfirmar: Button = cadastrarButton

        botaoConfirmar.setOnClickListener({
            val main = Intent(this, LoginActivity::class.java)
            startActivity(main)

            Toast.makeText(this, "Usuário adicionado!", Toast.LENGTH_LONG).show()
        })

    }
}