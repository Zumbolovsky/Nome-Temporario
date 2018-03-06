package com.example.andrewsiquieri.kotlinapp

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main_menu.*


class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        var spinner = estadosSpinner

        val listaEstados: List<String> = ArrayList(R.array.estados)
        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = object : ArrayAdapter<String>(this, R.layout.activity_main_menu, R.id.estadosSpinner, listaEstados) {
            override fun isEnabled(position: Int): Boolean {
                return position != 0
            }

            override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getDropDownView(position, convertView, parent)
                val textview = view as TextView
                if (position == 0) {
                    textview.setTextColor(Color.GREEN)
                } else {
                    textview.setTextColor(Color.BLACK)
                }
                return view
            }
        }

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        spinner.adapter = adapter

        spinner.setSelection(adapter.getPosition("Estado"))
    }
}
