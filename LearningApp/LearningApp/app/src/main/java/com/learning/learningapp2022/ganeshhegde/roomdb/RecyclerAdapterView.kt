package com.learning.learningapp2022.ganeshhegde.roomdb

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.RoomListItemBinding

class RecyclerAdapterView(private val subscriberList:List<Subscriber>,private val clickListener:(Subscriber)->Unit) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : RoomListItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.room_list_item,parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(subscriberList[position],clickListener)
    }

    override fun getItemCount(): Int {
            return subscriberList.size
    }
}

class MyViewHolder(val binding:RoomListItemBinding) : RecyclerView.ViewHolder(binding.root){

    fun bind(subscriber: Subscriber, clickListener:(Subscriber)->Unit){
        binding.nameTextView.text = subscriber.name
        binding.emailTextView.text = subscriber.email
        binding.linearLayout.setOnClickListener {
            clickListener(subscriber)
        }
    }
}