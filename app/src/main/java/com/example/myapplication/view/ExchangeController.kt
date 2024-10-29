package com.example.myapplication.view

class ExchangeController(private val repository: ExchangeRepository) {

    fun convertAmount(
        fromCurrency: String,
        toCurrency: String,
        amount: Double,
        callback: (Double) -> Unit
    ) {
        repository.getConversionRate(fromCurrency, toCurrency) { rate ->
            callback(amount * rate)
        }
    }
}
