package com.moeez.bottomsheetfragmant

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class BottomSheetAdapter(val mList: ArrayList<DataItemModel>) :
    RecyclerView.Adapter<BottomSheetAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.bottom_item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = mList[position]
        holder.apply {
            countryName.text = item.countryName
            flagImage.setImageResource(item.flag)
        }
    }
    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val countryName: TextView = itemView.findViewById(R.id.countryName)
        val flagImage: ImageView = itemView.findViewById(R.id.flagIv)

    }

}