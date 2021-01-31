package com.example.splashscreendanrecyclerviewdanielap.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.splashscreendanrecyclerviewdanielap.R
import com.example.splashscreendanrecyclerviewdanielap.model.PictureModel
import kotlinx.android.synthetic.main.item_picture.view.*

class PictureAdapter(private  val context: Context, private val item:List<PictureModel>)
    :RecyclerView.Adapter<PictureAdapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bindItem(pictureModel: PictureModel) {
            itemView.namePicture.text = pictureModel.name
            Glide.with(itemView.context).load(pictureModel.image).into(itemView.imagePicture)

            Log.d("Test",pictureModel.toString())
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder (
        LayoutInflater.from(context).inflate(R.layout.item_picture, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(item[position])
    }

    override fun getItemCount(): Int = item.size


}