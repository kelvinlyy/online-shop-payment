package com.example.onlineshoppayment.controller

import com.example.onlineshoppayment.controller.PaymentControllerImpl.Companion.BASE_PAYMENT_URL
import com.example.onlineshoppayment.dto.PaymentDto
import com.example.onlineshoppayment.service.PaymentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = [BASE_PAYMENT_URL])
class PaymentControllerImpl(private val paymentService: PaymentService) : PaymentController {
    @PostMapping
    override fun makePayment(@RequestBody paymentDto: PaymentDto): ResponseEntity<Double> {
        return ResponseEntity<Double>(paymentService.makePayment(paymentDto), HttpStatus.OK)
    }

    companion object {
        const val BASE_PAYMENT_URL = "/api/payment"
    }
}