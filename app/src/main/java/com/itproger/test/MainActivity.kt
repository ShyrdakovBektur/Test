package com.itproger.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itproger.test.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        with(binding) {
            btnPlus.setOnClickListener {
                val firstValue = edt1.text.toString()
                val secondValue = edt2.text.toString()
                val result = Math().add(firstValue, secondValue)
                textView.text = result
            }

            btnDivide.setOnClickListener {
                val firstValue = edt1.text.toString()
                val secondValue = edt2.text.toString()
                val result = Math().divide(firstValue, secondValue)
                textView.text = result
            }
        }
    }
}