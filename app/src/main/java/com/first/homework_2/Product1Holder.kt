package com.first.homework_2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.first.homework_2.databinding.ItemProduct1Binding

class Product1Holder(
    private val glide: RequestManager,
    private val binding: ItemProduct1Binding,
    private val onClick: (Product1) -> Unit
) : ViewHolder(binding.root) {
    fun onBind(product1: Product1) {
        binding.run {
            tvProduct.text = product1.name
            tvSection.text = product1.section

            glide
                .load(product1.url)
                .error(R.drawable.img)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(ivImage)

            root.setOnClickListener{
                onClick.invoke(product1)
            }
        }
    }
}