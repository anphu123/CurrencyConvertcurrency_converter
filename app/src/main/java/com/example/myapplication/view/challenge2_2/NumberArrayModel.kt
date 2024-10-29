package com.example.myapplication.view.challenge2_2

class NumberArrayModel {

    // Hàm tìm số bị thiếu
    fun findMissingNumber(arr: List<Int>): Int {
        val n = arr.size
        val totalSum = (n + 1) * (n + 2) / 2
        val arraySum = arr.sum()
        return totalSum - arraySum
    }
}