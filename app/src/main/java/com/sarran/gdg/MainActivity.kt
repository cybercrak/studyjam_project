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
        movieList.add(Movies(R.drawable.ic_launcher_foreground,"Movie1","Action"))
        movieList.add(Movies(R.drawable.ic_launcher_foreground,"Movie2","Romance"))
        movieList.add(Movies(R.drawable.ic_launcher_foreground,"Movie3","General"))
        movieList.add(Movies(R.drawable.ic_launcher_foreground,"Movie4","Action"))
        movieList.add(Movies(R.drawable.ic_launcher_foreground,"Movie5","Romance"))
        movieList.add(Movies(R.drawable.ic_launcher_foreground,"Movie6","General"))

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val adapter = Movieadapter(movieList)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

}