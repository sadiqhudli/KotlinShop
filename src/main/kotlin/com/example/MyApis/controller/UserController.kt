package com.example.MyApis.controller

import com.example.MyApis.extenstionFunctions.toEntity
import com.example.MyApis.extenstionFunctions.toResponse
import com.example.MyApis.model.userInfo.request.UserRequest
import com.example.MyApis.model.userInfo.response.UserResponse
import com.example.MyApis.service.userInfoService.UserService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/user")
class UserController( private val userService: UserService) {



    // localhost:8888/api/user
    // :: this end point get all user
    // localhost:8088/api/user:: this end point get all user

    @PostMapping("/create")
    fun createUser(@RequestBody userRequest: UserRequest): UserResponse {
        val role = userService.getRole(userRequest.role) // Fetch role based on the Role enum
        val userInfo = userRequest.toEntity(role)
        val savedUser = userService.saveUser(userInfo)
        return savedUser.toResponse("User created successfully")
    }

    @GetMapping()
    fun getAllUser():List<UserResponse>{
        val users = userService.getAllUsers()

        return users.map { it.toResponse("User fetched successfully") }
    }


    //localhost:8888/api/user/id
    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int): UserResponse {
        val userInfo = userService.getUserById(id)
        return userInfo.toResponse("User fetched successfully")
    }

    }