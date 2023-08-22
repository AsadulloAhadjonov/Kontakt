package com.example.kontakt.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kontakt.Data.User
import com.example.kontakt.databinding.ItemRvBinding

class AdapterRv(var list:ArrayList<User>):RecyclerView.Adapter<AdapterRv.Vh>() {
    inner class Vh(var item: ItemRvBinding):ViewHolder(item.root){
        fun onBind(user: User){
            item.txtName.text = user.name
            item.txtNumber.text = user.raqam
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}