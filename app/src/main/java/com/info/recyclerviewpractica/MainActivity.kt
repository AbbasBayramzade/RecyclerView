package com.info.recyclerviewpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.info.recyclerviewpractica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerview
        recyclerView.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)

        val adapter = ItemListAdapter(MockList.getMockedItemList() as ArrayList<ItemModel> /* = java.util.ArrayList<com.info.recyclerviewpractica.ItemModel> */)

        recyclerView.adapter = adapter



    }
}