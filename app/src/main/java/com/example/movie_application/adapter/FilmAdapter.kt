package com.example.movie_application.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.movie_application.Film
import com.example.movie_application.R

class FilmAdapter(var filmList: List<Film>) :
    RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    private var onAddButtonClickListener: OnAddButtonClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val film = filmList[position]
        holder.bind(film)
        holder.addButton.setOnClickListener {
            onAddButtonClickListener?.onAddButtonClick(position)
        }
    }

    fun setData(newList: List<Film>) {
        val diffCallback = FilmDiffCallback(filmList, newList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        filmList = newList
        diffResult.dispatchUpdatesTo(this)
    }

    fun setOnAddButtonClickListener(listener: OnAddButtonClickListener) {
        onAddButtonClickListener = listener
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val addButton: Button = itemView.findViewById(R.id.adding_button)
        val filmTitle: TextView = itemView.findViewById(R.id.film_title)
        val filmDescription: TextView = itemView.findViewById(R.id.film_description)
        val filmRating: TextView = itemView.findViewById(R.id.film_rating)
        val filmCategory: TextView = itemView.findViewById(R.id.film_category)

        fun bind(film: Film) {
            filmTitle.text = film.title
            filmDescription.text = film.description
            filmRating.text = film.rating.toString()
            filmCategory.text = film.category
        }
    }

    interface OnAddButtonClickListener {
        fun onAddButtonClick(position: Int)
    }
}