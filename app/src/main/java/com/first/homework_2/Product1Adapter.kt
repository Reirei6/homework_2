package com.first.homework_2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.first.homework_2.databinding.ItemProduct1Binding

class Product1Adapter(
    private val glide: RequestManager,
    private val list: List<Product1>,
    private val onClick: (Product1) -> Unit
) : RecyclerView.Adapter<Product1Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Product1Holder {
        return Product1Holder(
            binding = ItemProduct1Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onClick = onClick
        )

    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Product1Holder, position: Int) {
        val currentItem = list[position]
        holder.onBind(currentItem)
        holder.itemView.setOnClickListener {
            val context = it.context
            val intent = Intent(context, CabaggeActivity::class.java)
            intent.putExtra("ITEM_ID", currentItem.id)
            context.startActivity(intent)
        }

    }

}