package com.example.tasksapp.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tasksapp.databinding.FragmentRecoverAccountBinding
import com.example.tasksapp.util.initToolbar

class RecoverAccountFragment : Fragment() {

    private var _binding: FragmentRecoverAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecoverAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolbar)

        initListeners()
    }

    private fun initListeners() {
        binding.btnRecover.setOnClickListener {
            validateData()
        }
    }

    private fun validateData() {
        val email = binding.edtEmail.text.toString().trim()

        if (email.isNotEmpty()) {
            Toast.makeText(requireContext(), "OK tudo certo!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "Preencha seu e-mail", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}