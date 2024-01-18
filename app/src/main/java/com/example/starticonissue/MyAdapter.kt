package com.example.starticonissue

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Irene Khramova on 18.01.2024.
 */
class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    val items = mutableListOf(
        "Test text 0",
        "Test text 1",
        "Test text 2",
        "Test text 3",
        "Test text 4",
        "Test text 5",
        "Test text 6",
        "Test text 7",
        "Test text 8",
        "Test text 9",
        "Test text 10",
        "Test text 11",
        "Test text 12",
        "Test text 13",
        "Test text 14",
        "Test text 15",
        "Test text 16",
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }
}