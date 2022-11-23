package com.example.onlineshoppayment.entity

data class Wallet(
    val id: Long,
    val walletId: String,
    val password: String,
    val balance: Double
)
