package com.example.MyApis.model.userInfo.request

import com.example.MyApis.model.userInfo.entity.Role

data class UserRequest(
    val id:Int,
    val full_name:String,
    val email:String,
    val password:String,
    val phone_number:String,
    val role: Role
)