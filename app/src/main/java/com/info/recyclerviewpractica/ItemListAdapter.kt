package com.info.recyclerviewpractica

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemListAdapter(val itemList:ArrayList<ItemModel>):RecyclerView.Adapter<ItemListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListViewHolder {

        return ItemListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image_with_text,parent,false))

    }

    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {
        holder.bindItems(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}