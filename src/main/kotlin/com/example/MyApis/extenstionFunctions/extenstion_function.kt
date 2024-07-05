package com.example.MyApis.extenstionFunctions

import com.example.MyApis.model.userInfo.entity.Role
import com.example.MyApis.model.userInfo.entity.UserInfo
import com.example.MyApis.model.userInfo.request.UserRequest
import com.example.MyApis.model.userInfo.response.UserResponse


fun UserRequest.toEntity(role: Role): UserInfo {
    return UserInfo(
        id_users = this.id,
        full_name = this.full_name,
        email = this.email,
        password = this.password,
        phone_number = this.phone_number,
        role = role
    )
}


fun UserInfo.toResponse(message: String): UserResponse {
    return UserResponse(
        id = this.id_users,
        full_name = this.full_name,
        email = this.email,
        phone_number = this.phone_number,
        mesage = message
    )
}

