package com.example.MyApis.service.userInfoService


import com.example.MyApis.model.categories.entity.Categories
import com.example.MyApis.model.userInfo.entity.Role
import com.example.MyApis.model.userInfo.entity.UserInfo
import com.example.MyApis.repostory.CategoryRep
import com.example.MyApis.repostory.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class UserService(val userRepository: UserRepository) {

    fun getRole(role: Role): Role {
        return role // In a real application, you might fetch this from a RoleRepository or similar
    }
    fun saveUser(userInfo: UserInfo): UserInfo {
        return userRepository.save(userInfo)
    }
    fun getAllUsers(): MutableIterable<UserInfo> {
        return userRepository.findAll()
    }
    fun getUserById(id: Int): UserInfo {
        return userRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
        }
    }


    fun deleteById(id: Int): String {
        val response = userRepository.deleteById(id)
        return "successfully deleted user $id $response"
    }

}







///   fun userbyId(id:  String):User = userRepository.findById(id).orElseThrow{throw RuntimeException("not found id for my code")}

