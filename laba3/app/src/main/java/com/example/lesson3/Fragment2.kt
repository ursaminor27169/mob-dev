package com.example.lesson3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson3.databinding.Fragment1Binding
import com.example.lesson3.databinding.Fragment2Binding

class Fragment2 : Fragment(){
    private lateinit var binding: Fragment2Binding
    private var x :Int = 2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(layoutInflater)
        val view = binding.root
        nextButtonClick()
        backButtonClick()
        return view
    }

    private fun nextButtonClick(){
        binding.next.setOnClickListener{
            val activityCallback = requireActivity() as ActivityCallback
            Calculator.num2 = binding.editText1.text.toString().toInt()
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