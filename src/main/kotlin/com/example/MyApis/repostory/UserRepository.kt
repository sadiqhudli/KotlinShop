package com.example.MyApis.repostory



import com.example.MyApis.model.userInfo.entity.UserInfo
import com.example.MyApis.model.userInfo.response.UserResponse
import org.springframework.data.repository.CrudRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository




@Repository
interface UserRepository :CrudRepository<UserInfo,Int> {


}







