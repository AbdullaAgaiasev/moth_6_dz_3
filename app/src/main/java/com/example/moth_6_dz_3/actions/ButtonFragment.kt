package com.example.moth_6_dz_3.actions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.moth_6_dz_3.SharedViewModel
import com.example.moth_6_dz_3.databinding.FragmentButtonBinding


class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonBinding.inflate(layoutInflater )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[(SharedViewModel::class.java)]

        binding.increment.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.decrement.setOnClickListener {
            viewModel.onDecrementClick()

        }
//        viewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]
    }
}