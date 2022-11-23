package com.example.onlineshoppayment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class OnlineShopPaymentApplication

fun main(args: Array<String>) {
	runApplication<OnlineShopPaymentApplication>(*args)
}
