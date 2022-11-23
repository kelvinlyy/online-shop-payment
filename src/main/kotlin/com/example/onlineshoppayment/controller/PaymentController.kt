package com.example.onlineshoppayment.controller

import com.example.onlineshoppayment.dto.PaymentDto
import org.springframework.http.ResponseEntity


interface PaymentController {
    fun makePayment(paymentDto: PaymentDto): ResponseEntity<Double>
}