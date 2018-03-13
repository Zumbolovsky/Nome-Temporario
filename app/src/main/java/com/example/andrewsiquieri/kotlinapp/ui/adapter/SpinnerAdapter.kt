package com.example.andrewsiquieri.kotlinapp.ui.adapter

import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.andrewsiquieri.kotlinapp.R

class SpinnerAdapter(context: Context, textViewResourceId: Int)
    : ArrayAdapter<String>(context, textViewResourceId) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val v = super.getView(position, convertView, parent)
        val font = Typeface.create(context.getString(R.string.fontName), Typeface.NORMAL)

        (v as TextView).typeface = font
        v.textSize = 18f

        if (position == count) {
            (v.findViewById<View>(android.R.id.text1) as TextView).text = ""
            (v.findViewById<View>(android.R.id.text1) as TextView).hint = getItem(count) //"Hint to be displayed"
        }

        return v
    }

    override fun getCount(): Int {
        return super.getCount() - 1 // you dont display last item. It is used as hint.
    }

}