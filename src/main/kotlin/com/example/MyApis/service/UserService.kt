package com.example.MyApis.service

import com.example.MyApis.model.User
import com.example.MyApis.repostory.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class UserService(@Autowired  val userRepository: UserRepository) {

    // single user add
    fun addUser(user: User):User =userRepository.insert(user)

    fun delectUser(id: String)=userRepository.deleteById(id)


    fun getAllUsers():List<User> = userRepository.findAll()


    fun updateuser(user: User) {
        val savedUser: User = userRepository
            .findById(user.id).get()
        savedUser.name = user.name
        savedUser.age = user.age
        savedUser.id = user.id
        userRepository.save(savedUser)
    }

    fun userbyId(id: String): User {
        return userRepository.findById(id).get()
    }

    fun delectAll() = userRepository.deleteAll()

    fun Au():ResponseEntity<List<User>>{

        return ResponseEntity.ok(userRepository.findAll())
    }

 ///   fun userbyId(id:  String):User = userRepository.findById(id).orElseThrow{throw RuntimeException("not found id for my code")}

}