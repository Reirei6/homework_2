package com.first.homework_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.first.homework_2.databinding.FragmentActionBinding

class ActionFragment : Fragment(R.layout.fragment_action) {

    private var binding: FragmentActionBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentActionBinding.bind(view)

        val action = arguments?.getString(ACTION) ?: "ERROR"

        binding?.run {
            actionscreen.text = "${actionscreen.text} : \n $action"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ACTION = "ACTION"

        fun bundle(action: String): Bundle = Bundle().apply {
            putString(ACTION, action)
        }
    }

}