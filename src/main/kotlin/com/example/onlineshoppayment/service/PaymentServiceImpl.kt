package com.example.onlineshoppayment.service

import com.example.onlineshoppayment.dto.PaymentDto
import org.springframework.stereotype.Service


@Service
class PaymentServiceImpl : PaymentService {
    override fun makePayment(paymentDto: PaymentDto): Double {
        return 0.0
    }
}