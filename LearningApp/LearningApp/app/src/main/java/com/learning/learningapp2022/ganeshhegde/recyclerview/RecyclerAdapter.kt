package com.learning.learningapp2022.ganeshhegde.recyclerview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.learning.learningapp2022.ganeshhegde.R



class RecyclerAdapter(
                private val planetsList: List<Planets>,
                private val clickListener: (Planets) -> Unit) : RecyclerView.Adapter<RViewHolder>() {

    //to create list item template we use this method --- onCreateViewHolder
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RViewHolder {

         val layoutInflater = LayoutInflater.from(parent.context)
         val listItem = layoutInflater.inflate(R.layout.list_items_demo,parent,false)

         return RViewHolder(listItem)
     }

    //this method onBindViewHolder -- to display data on the list item above
     override fun onBindViewHolder(holder: RViewHolder, position: Int) {
            val planet = planetsList[position]
            holder.bind(planet,clickListener)
     }

    //total number of rows returned with list items populated
     override fun getItemCount(): Int {
          return planetsList.size
     }
 }

class RViewHolder(val view: View) : RecyclerView.ViewHolder(view){

    fun bind(planet: Planets,clickListener: (Planets) -> Unit){
        val myTextView = view.findViewById<TextView>(R.id.tvNames)
        val name = planet.name
        val radius = planet.radius_km
        myTextView.text = "$name $radius"

        view.setOnClickListener{
            clickListener(planet)
        }
    }

}