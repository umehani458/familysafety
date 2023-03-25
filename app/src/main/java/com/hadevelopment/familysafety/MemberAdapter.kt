package com.hadevelopment.familysafety

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MemberAdapter(private val listMembers: List<MemberModel>) :RecyclerView.Adapter<MemberAdapter.ViewHolder>() {
    class ViewHolder(private val item:View):RecyclerView.ViewHolder(item) {
        val name=item.findViewById<TextView>(R.id.username)
        val image=item.findViewById<ImageView>(R.id.userImage)
        val location=item.findViewById<TextView>(R.id.userlocation)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val item=inflater.inflate(R.layout.item_rv_member,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val it=listMembers[position]
        holder.name.text=it.name
    }

    override fun getItemCount(): Int {
       return listMembers.size
    }

}