package com.example.MyApis.dto

import kotlin.random.Random

data class CategoryDto(
    val id:Int = Random.nextInt(),
    val name:String,
    val url:String
)


data class CategoryResponse(
    val id:Int,
    val name:String,
    val url:String,
    val message:String
)
