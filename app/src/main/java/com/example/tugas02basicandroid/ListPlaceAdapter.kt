package com.example.tugas02basicandroid

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlaceAdapter(private val listPlace: ArrayList<Place>): RecyclerView.Adapter<ListPlaceAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_place, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val placeArray = listPlace[position]
        Glide.with(holder.itemView.context)
            .load(placeArray.photo)
            .apply(RequestOptions().override(70, 100))
            .into(holder.imgPhoto)
        holder.tvName.text = placeArray.name
        holder.tvDescription.text = placeArray.description
        val context= holder.itemView.context
        holder.itemView.setOnClickListener{
            val intentDetail = Intent(context, PlaceDetailActivity::class.java)
            intentDetail.putExtra(PlaceDetailActivity.extraTitle, placeArray.name )
            intentDetail.putExtra(PlaceDetailActivity.extraDescription, placeArray.description )
            intentDetail.putExtra(PlaceDetailActivity.extraPhoto, placeArray. photo )
            intentDetail.putExtra(PlaceDetailActivity.extraBenefit, placeArray.benefit)

            context.startActivity(intentDetail)
        }

    }

    override fun getItemCount(): Int = listPlace.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)

    }
}