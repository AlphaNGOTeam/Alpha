package com.teamjeff.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.teamjeff.myapplication.R
import com.teamjeff.myapplication.data.data_offers
import com.teamjeff.myapplication.data.history_data

class history_adapter(private val history_itemList:ArrayList<history_data>):RecyclerView.Adapter<history_adapter.ItemHolder>() {

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val imageView: ImageView =itemView.findViewById(R.id.image_history)
        val textView: TextView =itemView.findViewById(R.id.history_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.history_item, parent, false)
        return history_adapter.ItemHolder(view)
    }

    override fun getItemCount(): Int {
        return history_itemList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = history_itemList[position]
        holder.imageView.setImageResource(item.image_history)
        holder.textView.text = item.text_history
    }
}