package com.example.MyApis.model.order.entity

import com.example.MyApis.model.userInfo.entity.UserInfo
import jakarta.persistence.*
import org.springframework.boot.autoconfigure.security.SecurityProperties


enum class OrderStatus {
    PLACED, PROCESSING, SHIPPING, DELIVERED
}

enum class PaymentStatus {
    PAID, NOT_PAID
}

enum class PaymentType {
    NETBANKING, UPI, COD
}

@Entity
data class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, unique = true)
    val orderNumber: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val userInfo: UserInfo,

    @Column(nullable = false)
    val totalAmount: Double,

    val discountAmount: Double,

    @Column(nullable = false)
    val grossAmount: Double,

    @Column(nullable = false)
    val shippingAmount: Double,

    @Column(nullable = false)
    val netAmount: Double,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val status: OrderStatus,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val paymentStatus: PaymentStatus,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val paymentType: PaymentType,

    @Column(nullable = false)
    val paymentTransactionId: String
)
