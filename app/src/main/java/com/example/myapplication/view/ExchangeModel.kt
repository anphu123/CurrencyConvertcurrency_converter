package com.example.myapplication.view

// Dữ liệu mô hình cho API
data class ExchangeResponse(
    val conversion_rate: Double
)

data class Currency(val name: String, val code: String)
