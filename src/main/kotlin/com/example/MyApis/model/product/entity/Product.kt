package com.example.MyApis.model.product.entity

import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "Product table")
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var ProdutId:Long,
    @Column(nullable = false)
    var name:String,
  //  @Column(nullable = false)
    var price:Double,
    @Column(nullable = false)
    var description:String,
    @Column(nullable = false, unique = true)
    val urlSlug: String,


)
