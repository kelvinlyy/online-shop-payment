package com.example.onlineshoppayment.dto


data class PaymentDto(
    val orderId: Long,
    val walletDto: WalletDto
)