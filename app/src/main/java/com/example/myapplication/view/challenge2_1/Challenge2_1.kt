package com.example.myapplication.view.challenge2_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import java.text.DecimalFormat


class Challenge2_1 : AppCompatActivity() {

    private lateinit var productAdapter: ProductAdapter
    private lateinit var products: List<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge21)

        val backButton: ImageButton = findViewById(R.id.imageViewBack)
        backButton.setOnClickListener { finish() }

        // Dữ liệu sản phẩm mẫu
        products = listOf(
            Product("Laptop", 999.99, 5),
            Product("Smartphone", 499.99, 10),
            Product("Tablet", 299.99, 0),
            Product("Smartwatch", 199.99, 3)
        )

        // Thiết lập RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        productAdapter = ProductAdapter(products)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productAdapter

        // Hiển thị thông tin tổng giá trị và sản phẩm đắt nhất
        val textMostExpensive: TextView = findViewById(R.id.textMostExpensive)
        val textTotalValue: TextView = findViewById(R.id.textTotalValue)
        updateInventorySummary(textMostExpensive, textTotalValue)

        // Tìm kiếm sản phẩm
        val editTextSearch: EditText = findViewById(R.id.editTextSearch)
        findViewById<Button>(R.id.buttonSearch).setOnClickListener {
            val query = editTextSearch.text.toString().trim()
            val filteredProducts = products.filter { it.name.contains(query, ignoreCase = true) }
            productAdapter.updateProducts(filteredProducts)
        }

        // Sắp xếp sản phẩm theo giá
        findViewById<Button>(R.id.buttonSort).setOnClickListener {
            val sortedProducts = products.sortedBy { it.price }
            productAdapter.updateProducts(sortedProducts)
        }
    }

    private fun updateInventorySummary(textMostExpensive: TextView, textTotalValue: TextView) {
        val totalValue = products.sumOf { it.price * it.quantity }
        val mostExpensiveProduct = products.maxByOrNull { it.price }?.name ?: "Không có sản phẩm"

        // Định dạng số thành dạng tiền tệ
        val formatter = DecimalFormat("#,###")
        val formattedTotalValue = formatter.format(totalValue)

        textMostExpensive.text = "Sản phẩm đắt nhất: $mostExpensiveProduct"
        textTotalValue.text = "Tổng giá trị kho: $formattedTotalValue"
    }
}