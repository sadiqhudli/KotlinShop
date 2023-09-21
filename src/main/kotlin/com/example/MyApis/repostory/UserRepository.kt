package com.example.MyApis.repostory

import com.example.MyApis.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import java.util.Optional


interface UserRepository : MongoRepository<User,String>{



    @Query("{'name':?0}")
    fun findByName(name:String): Optional<User>




}

