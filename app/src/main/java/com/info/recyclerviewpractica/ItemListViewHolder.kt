package com.info.recyclerviewpractica

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_image_with_text.view.*

class ItemListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    fun bindItems(itemModel: ItemModel){

        val description:TextView = itemView.item_textName

        val image:ImageView = itemView.image

        description.text = itemModel.description
        image.setImageResource(itemModel.image)

    }

}