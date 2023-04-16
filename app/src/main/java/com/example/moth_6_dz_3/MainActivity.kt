package com.example.moth_6_dz_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moth_6_dz_3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        adapter = ViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter
    }
}