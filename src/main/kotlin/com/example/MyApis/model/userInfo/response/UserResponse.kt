package com.example.MyApis.model.userInfo.response

import kotlin.random.Random


data class UserResponse(
    val id:Int,
    val full_name:String,
    val email:String,
    val phone_number:String,
    val mesage:String
)



data class CategoryResponse(
    val id:Int,
    val message:String

)


data class CategoryRequest(
    val id: Int = Random.nextInt(),
    val name:String,
    val url:String
)


