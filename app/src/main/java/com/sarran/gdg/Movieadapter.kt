package com.sarran.gdg

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class Movieadapter(private val movies: List<Movies>) : Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.movieImage.setImageResource(movie.moviePoster)
        holder.movieGenre.text = movie.movieGenre
        holder.movieName.text = movie.movieName

    }

    override fun getItemCount(): Int {
        return movies.size
    }

}