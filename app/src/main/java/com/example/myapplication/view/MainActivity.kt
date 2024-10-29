package com.example.myapplication.view
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private val repository = ExchangeRepository()
    private val controller = ExchangeController(repository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerFrom: Spinner = findViewById(R.id.spinner_from)
        val spinnerTo: Spinner = findViewById(R.id.spinner_to)
        val amountInput: EditText = findViewById(R.id.amount_input)
        val resultText: TextView = findViewById(R.id.result_text)
        val convertButton: Button = findViewById(R.id.convert_button)

        val currencies = listOf(
            Currency("United States Dollar", "USD"),
            Currency("Euro", "EUR"),
            Currency("Vietnamese Dong", "VND"),
            // Thêm các loại tiền khác ở đây
        )

        spinnerFrom.adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, currencies.map { it.name }
        )

        spinnerTo.adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, currencies.map { it.name }
        )

        convertButton.setOnClickListener {
            val from = currencies[spinnerFrom.selectedItemPosition].code
            val to = currencies[spinnerTo.selectedItemPosition].code
            val amount = amountInput.text.toString().toDoubleOrNull() ?: 0.0

            controller.convertAmount(from, to, amount) { result ->
                // Định dạng kết quả với 2 chữ số thập phân
                val decimalFormat = DecimalFormat("#,##0.00")
                val formattedResult = decimalFormat.format(result)
                resultText.text = "Converted: $formattedResult $to"
            }
        }
    }
}

