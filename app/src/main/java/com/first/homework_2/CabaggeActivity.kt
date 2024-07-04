package com.first.homework_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.first.homework_2.databinding.ActivityCabaggeBinding

class CabaggeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCabaggeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCabaggeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemId = intent.getIntExtra("ITEM_ID", -1)
        val item = Product1Repository.findById(itemId)

        item?.let {
            Glide.with(this).load(it.url).into(binding.ivImage)
            binding.titleTextView.text = it.name
            binding.shortDescriptionTextView.text = it.section
            binding.longDescriptionTextView.text = "This is a detailed description of ${it.name}. It belongs to the ${it.section} section."
        }

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}
