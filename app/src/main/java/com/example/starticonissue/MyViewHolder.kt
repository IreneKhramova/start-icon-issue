package com.example.starticonissue

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText

class MyViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_text_input, parent, false)
) {

    fun bind(item: String) {
        val editText = itemView.findViewById<TextInputEditText>(R.id.editText)
        editText.setText(item)
    }
}