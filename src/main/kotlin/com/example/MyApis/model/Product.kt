package com.example.MyApis.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document
data class Product(

    @Id
    var ProdutId:String,
    @Indexed(unique = true)
    var name:String,
    var price:Double,
    var image:String,
    var description:String

)
