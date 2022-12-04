package com.example.androidprojecthome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ThirdFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onStart() {
        super.onStart()
        third_btn_back.setOnClicklistener {
            (activity as MainActivity).navController.navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }

}