package com.example.onlineshoppayment.service

import com.example.onlineshoppayment.dto.PaymentDto


interface PaymentService {
    fun makePayment(paymentDto: PaymentDto): Double
}