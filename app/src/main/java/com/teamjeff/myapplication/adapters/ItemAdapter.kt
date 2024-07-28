package com.teamjeff.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.teamjeff.myapplication.R
import com.teamjeff.myapplication.data.data_offers

class ItemAdapter(private val itemList:ArrayList<data_offers>):RecyclerView.Adapter<ItemAdapter.ItemHolder>()
{
    class ItemHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        val imageView:ImageView=itemView.findViewById(R.id.image_drone)
        val textView:TextView=itemView.findViewById(R.id.offer_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_offers, parent, false)
        return ItemHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.imageResource)
        holder.textView.text = item.text
    }
}
