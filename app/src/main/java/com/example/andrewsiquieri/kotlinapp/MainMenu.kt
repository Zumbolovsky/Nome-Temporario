package com.example.andrewsiquieri.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.widget.Spinner
import com.example.andrewsiquieri.kotlinapp.ui.adapter.SpinnerAdapter
import kotlinx.android.synthetic.main.activity_main_menu.*


class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val spinner: Spinner = estadoSpinner

        val listaEstados  = resources.getStringArray(R.array.cadastroPessoalEstados).toMutableList()

        val adapter = SpinnerAdapter(this, android.R.layout.simple_spinner_dropdown_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter.addAll(listaEstados)
        adapter.add(getString(R.string.cadastroPessoalEstado))

        spinner.adapter = adapter
        spinner.setSelection(adapter.count) //display hint

        spinner.setOnTouchListener({ _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                if (spinner.selectedItem.toString() == listaEstados[0]) {
                    spinner.setSelection(adapter.count)
                }
                if (spinner.selectedItem.toString() == getString(R.string.cadastroPessoalEstado)) {
                    spinner.setSelection(0)
                }
            }
            false
        })

    }
}
