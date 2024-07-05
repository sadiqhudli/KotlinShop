package com.example.MyApis.model.shippingAddress.entity

import com.example.MyApis.model.userInfo.entity.UserInfo
import jakarta.persistence.*


@Entity
data class ShippingAddress(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val userInfo: UserInfo,

    @Column(nullable = false)
    val fullAddress: String,

    @Column(nullable = false)
    val state: String,

    @Column(nullable = false)
    val city: String,

    @Column(nullable = false)
    val zipCode: String
)
