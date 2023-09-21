package com.example.MyApis.controller

import com.example.MyApis.model.User
import com.example.MyApis.repostory.UserRepository
import com.example.MyApis.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/api/user")
class UserController(@Autowired private val userService: UserService) {


    @GetMapping("/test")
    fun getTestApi(): String {
        return "hello api"
    }

    // localhost:8080/api/user:: this end point get all user
    // localhost:8088/api/user:: this end point get all user
    @GetMapping
    fun getAllUsers():ResponseEntity<List<User>> = ResponseEntity.ok(userService.getAllUsers())

    // localhost:8080/api/user  this end point u add user in db
    @PostMapping
    fun addUser(@RequestBody user: User):ResponseEntity<String>{
        userService.addUser(user)
        return  ResponseEntity.ok().build()
    }

    // localhost:8080/api/user  this end point u get user by id
    @GetMapping("/id/{id}")
    fun userbyId(@PathVariable id: String):ResponseEntity<User> = ResponseEntity.ok(userService.userbyId(id))


    // localhost:8080/api/user  this end point u delect user by id in db
    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id:String):ResponseEntity<String> {
        userService.delectUser(id)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }

    // localhost:8080/api/user  this end point u delect all user in db
    @DeleteMapping("/all")
    fun delectAll() {
        ResponseEntity.ok(userService.delectAll())

    }

    @PatchMapping
    fun upDateUser(@RequestBody user: User):ResponseEntity<User>{
        userService.updateuser(user)
        return ResponseEntity.ok().build()
    }


    // localhost:8080/api/user
    @GetMapping("/{id}")
    fun getUserByName(@PathVariable id:String):ResponseEntity<User> =
        ResponseEntity.ok(userService.userbyId(id))

    /*

    @PatchMapping
    fun updateExpense(@RequestBody expense:Expense): ResponseEntity<String>{
        expenseService.updateExpense(expense)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun deleteExpense(@PathVariable id:String):ResponseEntity<String> {
        expenseService.deleteExpense(id)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }
     */


    }