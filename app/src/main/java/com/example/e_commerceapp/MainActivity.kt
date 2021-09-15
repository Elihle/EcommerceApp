package com.example.e_commerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var discountRecyclerView: RecyclerView
    private  val discountedProductAdaptor = DiscountedProductAdpater()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        discountRecyclerView = findViewById<RecyclerView>(R.id.discountedRecycler)

    }
}