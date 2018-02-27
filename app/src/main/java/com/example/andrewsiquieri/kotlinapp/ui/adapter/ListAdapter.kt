package com.example.andrewsiquieri.kotlinapp.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.andrewsiquieri.kotlinapp.R
import com.example.andrewsiquieri.kotlinapp.model.dto.EstagiarioDTO
import kotlinx.android.synthetic.main.estag_list.view.*

class ListAdapter(private val items: List<EstagiarioDTO>,
                  private val context: Context) : RecyclerView.Adapter<ListAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        val item = items[position]
        holder?.let {
            it.bindView(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.estag_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindView(estagiario: EstagiarioDTO) {
            val logo = itemView.item_logo
            val nome = itemView.item_nome

            logo.setImageResource(R.drawable.loading)
            nome.text = estagiario.nome
        }
    }

}