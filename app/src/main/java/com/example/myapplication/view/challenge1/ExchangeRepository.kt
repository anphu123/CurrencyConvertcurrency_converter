package com.example.myapplication.view.challenge1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ExchangeRepository {
    private val apiKey = "186573dc70fb253cca00933d"
    private val baseUrl = "https://v6.exchangerate-api.com/v6/$apiKey/"

    private val exchangeService: ExchangeService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        exchangeService = retrofit.create(ExchangeService::class.java)
    }

    fun getConversionRate(from: String, to: String, callback: (Double) -> Unit) {
        val call = exchangeService.getConversionRate(from, to)
        call.enqueue(object : retrofit2.Callback<ExchangeResponse> {
            override fun onResponse(
                call: retrofit2.Call<ExchangeResponse>,
                response: retrofit2.Response<ExchangeResponse>
            ) {
                if (response.isSuccessful) {
                    val conversionRate = response.body()?.conversion_rate ?: 1.0
                    callback(conversionRate)
                }
            }

            override fun onFailure(call: retrofit2.Call<ExchangeResponse>, t: Throwable) {
                callback(1.0) // Trả về tỷ lệ mặc định nếu xảy ra lỗi
            }
        })
    }
}
