package com.example.recyclerreview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.daftar.view.*

class Adapter (private val daftar:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.daftar,parent, false))
    }

    override fun getItemCount(): Int = daftar.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.textAlarm.text = daftar.get(position) .name
        holder.view.textTime.text = daftar.get(position) .alarm
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,daftar.get(position).alarm+" "+ daftar.get(position).name,
            Toast.LENGTH_SHORT).show()
        }
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}