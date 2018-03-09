package com.example.andrewsiquieri.kotlinapp

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main_menu.*
import android.widget.TextView
import android.view.ViewGroup
import android.widget.Toast
import android.widget.AdapterView






class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        var spinner: Spinner = estadoSpinner

        val listaEstados: List<String> = resources.getStringArray(R.array.cadastroPessoalEstados).toList()
//        Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(this,
                R.array.cadastroPessoalEstados, android.R.layout.simple_spinner_item)
//        val adapter = object : ArrayAdapter<String>(this, R.array.cadastroPessoalEstados) {
//            override fun getDropDownView(position: Int, convertView: View,
//                                         parent: ViewGroup): View {
//                val view = super.getDropDownView(position, convertView, parent)
//                val tv = view as TextView
//                if (position == 0) {
//                    tv.setTextColor(Color.GRAY)
//                } else {
//                    tv.setTextColor(Color.BLACK)
//                }
//                return view
//            }
//        }

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.setSelection(0, false)

        spinner.adapter = adapter


    }
}
