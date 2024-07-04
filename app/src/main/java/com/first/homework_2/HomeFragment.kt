package com.first.homework_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.first.homework_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding?.apply {
            sendTextBtn.setOnClickListener {
                val inputText = action.text.toString().trim()
                if (inputText.isEmpty()) {
                    Snackbar.make(view, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT).show()
                } else {
                    findNavController().navigate(
                        resId = R.id.action_homeFragment_to_actionFragment,
                        args = ActionFragment.bundle(
                            action = inputText
                        )
                    )
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}