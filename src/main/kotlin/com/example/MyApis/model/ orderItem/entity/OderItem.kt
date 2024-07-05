package com.example.MyApis.model.` orderItem`.entity

import com.example.MyApis.model.order.entity.Order
import com.example.MyApis.model.product.entity.Product
import jakarta.persistence.*


@Entity
data class OrderItem(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    val order: Order,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    val product: Product,

    @Column(nullable = false)
    val productName: String,

    val color: String? = null,
    val size: String? = null,

    @Column(nullable = false)
    val price: Double,

    @Column(nullable = false)
    val quantity: Int,

    @Column(nullable = false)
    val totalAmount: Double
)

//    entity
