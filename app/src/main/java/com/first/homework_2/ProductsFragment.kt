package com.first.homework_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.compose.material3.Snackbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.first.homework_2.databinding.FragmentProductsBinding

class ProductsFragment : Fragment(R.layout.fragment_products) {

    private var binding: FragmentProductsBinding? = null

    private var adapter: Product1Adapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProductsBinding.bind(view)

        initAdapter(

        )

        binding?.apply {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        binding?.run {
            adapter = Product1Adapter(glide = Glide.with(this@ProductsFragment),
                list = Product1Repository.products,
                onClick = { product ->
                    val intent = Intent(requireContext(), CabaggeActivity::class.java)
                    intent.putExtra("ITEM_ID", product.id)
                    startActivity(intent)
                })
            rvProducts.adapter = adapter
            rvProducts.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}