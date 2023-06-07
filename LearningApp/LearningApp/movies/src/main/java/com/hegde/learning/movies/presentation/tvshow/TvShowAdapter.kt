package com.hegde.learning.movies.presentation.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hegde.learning.movies.R
import com.hegde.learning.movies.data.model.tvshow.TVShow
import com.hegde.learning.movies.databinding.ListItemBinding

class TvShowAdapter():RecyclerView.Adapter<MyViewHolder>() {

    private val tvshowList = ArrayList<TVShow>()

    fun setList(tvshow: List<TVShow>){
        tvshowList.clear()
        tvshowList.addAll(tvshow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item,parent,false)
        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(tvshowList[position])
    }

    override fun getItemCount(): Int {

        return tvshowList.size
    }
}

class MyViewHolder(val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(tvshow:TVShow){
        binding.titleTextView.text = tvshow.name
        binding.descTextView.text = tvshow.overview
        val posterPath = "https://image.tmdb.org/t/p/w500"+tvshow.posterPath
        Glide.with(binding.imgView.context).load(posterPath).into(binding.imgView)
    }

}