package com.example.myrecycleview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textViewTask: TextView = itemView.findViewById(R.id.textViewTask)
}
