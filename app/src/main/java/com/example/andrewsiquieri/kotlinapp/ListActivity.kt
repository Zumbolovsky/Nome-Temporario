package com.example.andrewsiquieri.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.andrewsiquieri.kotlinapp.model.dto.EstagiarioDTO
import com.example.andrewsiquieri.kotlinapp.ui.adapter.ListAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val recycleView = list
        recycleView.adapter = ListAdapter(lista(), this)

        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recycleView.layoutManager = layoutManager

        //var uri = "https://pbs.twimg.com/profile_images/955211651371995137/3iIrG83t_400x400.jpg"
        //Glide.with(this).load(uri).placeholder(R.drawable.loading).into(imgLogo)
    }

    private fun lista(): List<EstagiarioDTO> {
        return listOf(
                EstagiarioDTO("aaa", "Danilo"),
                EstagiarioDTO("bbb", "Andrew")
        )
    }
}
