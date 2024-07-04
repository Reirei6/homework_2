package com.first.homework_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.first.homework_2.databinding.FragmentRatingBinding

class RatingFragment : Fragment(R.layout.fragment_rating) {

    private var binding: FragmentRatingBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRatingBinding.bind(view)

        binding?.apply {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}