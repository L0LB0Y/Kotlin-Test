package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
    }

    private fun initRecycler() {
        binding.recycler.itemAnimator = DefaultItemAnimator()
        val list = listOf<String>("San Francisco", "Istanbul", "Bergen", "Cape Town", "Prague", "Petersburg", "Dubrovnik", "Kyoto")
        binding.recycler.adapter = RecyclerAdapter(list)
    }
}