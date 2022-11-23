package com.example.onlineshoppayment.controller

import com.example.onlineshoppayment.controller.PaymentControllerImpl.Companion.BASE_PAYMENT_URL
import com.example.onlineshoppayment.dto.PaymentDto
import com.example.onlineshoppayment.dto.WalletDto
import com.example.onlineshoppayment.service.PaymentService
import com.fasterxml.jackson.databind.ObjectMapper
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

/*
Author      :   Kelvin Lai
Language    :   Kotlin
Purpose     :   
Description :   

*/

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class PaymentControllerImplTest @Autowired constructor(
    private val mockMvc: MockMvc,
    private val objectMapper: ObjectMapper
) {

    @RelaxedMockK
    lateinit var paymentService: PaymentService

    @Test
    fun `should make a payment`() {
        // given
        val newPayment = PaymentDto(
            1,
            WalletDto(
                "wallet-id",
                "wallet-password"
            )
        )


        // when/then
        mockMvc.post(BASE_PAYMENT_URL) {
            contentType = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(newPayment)
        }
            .andDo { print() }
            .andExpect {
                status { isOk() }
            }
            .andReturn()

    }
}