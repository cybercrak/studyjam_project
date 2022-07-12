package com.sarran.gdg

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var movieImage: ImageView
    var movieName: TextView
    var movieGenre: TextView

    init {
        movieImage = itemView.findViewById(R.id.moviePoster)
        movieName = itemView.findViewById(R.id.movieName)
        movieGenre = itemView.findViewById(R.id.movieGenre)

    }
}