package com.example.myapplication.view.challenge2_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class Challenge2_2 : AppCompatActivity() {
    private lateinit var inputArray: EditText
    private lateinit var resultText: TextView
    private lateinit var findMissingButton: Button
    private lateinit var backButton: ImageButton
    private val model = NumberArrayModel() // Khởi tạo model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_challenge22)
        // Ánh xạ View
        inputArray = findViewById(R.id.inputArray)
        resultText = findViewById(R.id.resultText)
        findMissingButton = findViewById(R.id.btnFindMissing)
        backButton = findViewById(R.id.imageViewBack)

        backButton.setOnClickListener { finish() }

        // Sự kiện khi bấm nút
        findMissingButton.setOnClickListener {
            val arrayInput = inputArray.text.toString()
            val numberList = parseInput(arrayInput)

            if (numberList.isNotEmpty()) {
                val missingNumber = model.findMissingNumber(numberList)
                resultText.text = "Số bị thiếu là: $missingNumber"
            } else {
                resultText.text = "Vui lòng nhập mảng hợp lệ!"
            }
        }
    }

    // Hàm chuyển đổi chuỗi nhập thành danh sách số nguyên
    private fun parseInput(input: String): List<Int> {
        return input.split(",")
            .mapNotNull { it.trim().toIntOrNull() }
    }
}