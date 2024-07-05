package com.example.MyApis.model.OrderShippingAddress.entity

import com.example.MyApis.model.shippingAddress.entity.ShippingAddress
import com.example.MyApis.model.order.entity.Order
import jakarta.persistence.*


@Entity
data class OrderShippingAddress(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    val order: Order,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipping_address_id", nullable = false)
    val shippingAddress: ShippingAddress,

    @Column(nullable = false)
    val fullAddress: String,

    @Column(nullable = false)
    val state: String,

    @Column(nullable = false)
    val city: String,

    @Column(nullable = false)
    val zipCode: String
)
