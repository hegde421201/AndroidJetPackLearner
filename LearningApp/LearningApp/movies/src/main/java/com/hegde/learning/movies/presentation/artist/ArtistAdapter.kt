package com.hegde.learning.movies.presentation.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hegde.learning.movies.R
import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.databinding.ListItemBinding

class ArtistAdapter():RecyclerView.Adapter<MyViewHolder>() {

    private val artistList = ArrayList<Artist>()

    fun setList(artist:  List<Artist>){
        artistList.clear()
        artistList.addAll(artist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item,parent,false)
        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(artistList[position])
    }

    override fun getItemCount(): Int {

        return artistList.size
    }
}

class MyViewHolder(val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(artist: Artist){
        binding.titleTextView.text = artist.name
        binding.descTextView.text = artist.popularity.toString()
        val posterPath = "https://image.tmdb.org/t/p/w500"+artist.profilePath
        Glide.with(binding.imgView.context).load(posterPath).into(binding.imgView)
    }

}