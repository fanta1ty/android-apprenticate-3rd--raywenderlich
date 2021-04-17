package com.example.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSelectionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val listPosition = itemView.findViewById<TextView>(R.id.itemNumber)
    val listTitle = itemView.findViewById<TextView>(R.id.itemString)
}