package com.sarran.gdg

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList = arrayListOf<Movies>()
        movieList.add(Movies(R.drawable.batman,"The Batman","Action"))
        movieList.add(Movies(R.drawable.alaipayuthey,"Alaipayuthey","Romance"))
        movieList.add(Movies(R.drawable.nanban,"Nanban","General"))
        movieList.add(Movies(R.drawable.kgf2,"KGF 2","Action"))
        movieList.add(Movies(R.drawable.english_romance,"English","Romance"))
        movieList.add(Movies(R.drawable.m_chips,"Murungaikai chips","General"))

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val adapter = Movieadapter(movieList)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

}