package com.example.myapplication.view

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call

interface ExchangeService {
    @GET("pair/{from}/{to}")
    fun getConversionRate(
        @Path("from") from: String,
        @Path("to") to: String
    ): Call<ExchangeResponse>
}
