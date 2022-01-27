package com.example.lesson3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.lesson3.databinding.Fragment1Binding
import com.example.lesson3.databinding.Fragment2Binding
import com.example.lesson3.databinding.Fragment3Binding

class Fragment3 : Fragment(){
    private lateinit var binding: Fragment3Binding
    private var x :Int = 3

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(layoutInflater)
        val view = binding.root
        nextButtonClick()
        backButtonClick()
        return view
    }

    private fun nextButtonClick(){
        binding.next.setOnClickListener{
            val activityCallback = requireActivity() as ActivityCallback
            Calculator.operation = binding.editText1.text.toString()
            activityCallback.showNextFragment(x)
        }
    }

    private fun backButtonClick(){
        binding.back.setOnClickListener {
            val activityCallback = requireActivity() as ActivityCallback
            activityCallback.showBackFragment(x)
        }
    }
}