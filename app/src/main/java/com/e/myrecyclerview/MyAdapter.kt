package com.e.myrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.list_row.view.*


class MyAdapter(list: List<Int>, context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val list = list
    val context = context

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)

        val viewHolder = CustomViewHolder(view)
        return viewHolder
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val text: TextView = view.text_view
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is CustomViewHolder){
            holder.text.text = list.get(position).toString()
        }
    }

}
