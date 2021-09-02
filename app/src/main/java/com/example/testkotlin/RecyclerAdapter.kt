package com.example.testkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testkotlin.databinding.ItemCardBinding

class RecyclerAdapter(private var list: List<String>):
    RecyclerView.Adapter<RecyclerAdapter.MyHolder>(){
    inner class MyHolder(val binding: ItemCardBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context))
        return MyHolder(binding)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binding.tetView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}