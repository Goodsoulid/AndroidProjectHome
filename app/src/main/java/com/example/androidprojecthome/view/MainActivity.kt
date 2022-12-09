package com.example.androidprojecthome.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidprojecthome.R
import com.example.androidprojecthome.adapter.RecyclerAdapter
import com.example.androidprojecthome.databinding.ActivityMainBinding
import com.example.androidprojecthome.viewmodel.RecyclerViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerViewModel:RecyclerViewModel
    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerViewModel = RecyclerViewModel()
    }

    private fun setupRecyclerData() {
        recyclerAdapter = RecyclerAdapter(recyclerViewModel.getData())
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = recyclerAdapter
        }
    }

    override fun onResume() {
        super.onResume()
        recyclerViewModel.setData()
        setupRecyclerData()
    }
}