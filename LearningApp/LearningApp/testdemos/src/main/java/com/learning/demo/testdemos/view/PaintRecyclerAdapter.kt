package com.learning.demo.testdemos.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.model.Paint
import javax.inject.Inject

class PaintRecyclerAdapter @Inject constructor(val glide:RequestManager): RecyclerView.Adapter<PaintRecyclerAdapter.PaintViewHolder>() {

    class PaintViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val diffUtil = object : DiffUtil.ItemCallback<Paint>() {
        override fun areItemsTheSame(oldItem: Paint, newItem: Paint): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Paint, newItem: Paint): Boolean {
            return oldItem == newItem
        }
    }

    private val recyclerListDiffer = AsyncListDiffer(this, diffUtil)

    var paints: List<Paint>
        get() = recyclerListDiffer.currentList
        set(value) = recyclerListDiffer.submitList(value)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaintViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.paint_row, parent, false)
        return PaintViewHolder(view)
    }


    override fun onBindViewHolder(holder: PaintViewHolder, position: Int) {
        val imageView = holder.itemView.findViewById<ImageView>(R.id.paint_row_image)
        val nameText = holder.itemView.findViewById<TextView>(R.id.paint_row_text)
        val artistNameText = holder.itemView.findViewById<TextView>(R.id.painter_row_text)
        val yearText = holder.itemView.findViewById<TextView>(R.id.year_text)
        val paint = paints[position]
        holder.itemView.apply {
            glide.load(paint.imageUrl).into(imageView)
            nameText.text = "Name: ${paint.name}"
            artistNameText.text = "Painter Name: ${paint.painterName}"
            yearText.text = "Year: ${paint.year}"
        }
    }


    override fun getItemCount(): Int = paints.size

}