package com.teamjeff.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.teamjeff.myapplication.R
import com.teamjeff.myapplication.data.data_notification

class notification_adapter(private val notification_list:ArrayList<data_notification>): RecyclerView.Adapter<notification_adapter.ItemHolder>()
{
    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val imageView: ImageView =itemView.findViewById(R.id.image_notification)
        val textView: TextView =itemView.findViewById(R.id.notification_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false)
        return notification_adapter.ItemHolder(view)
    }

    override fun getItemCount(): Int {
        return notification_list.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = notification_list[position]
        holder.imageView.setImageResource(item.image_notification)
        holder.textView.text = item.text_notification
    }

}