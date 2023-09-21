package com.example.MyApis.controller

import com.example.MyApis.model.Product
import com.example.MyApis.model.User
import com.example.MyApis.service.ProductServer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/product")
class ProductController(@Autowired val productServer: ProductServer) {


    // localhost:8080/api/product this end point get all user
    // localhost:8088/api/user:: this end point get all user
    @GetMapping
    fun getAllUsers(): ResponseEntity<List<Product>> = ResponseEntity.ok(productServer.getAllUsers())

    // localhost:8080/api/user  this end point u add user in db
    @PostMapping
    fun addUser(@RequestBody product: Product): ResponseEntity<String> {
        productServer.addUser(product)
        return  ResponseEntity.ok().build()
    }

    // localhost:8080/api/user  this end point u get user by id
    @GetMapping("/id/{id}")
    fun userbyId(@PathVariable id: String): ResponseEntity<Product> = ResponseEntity.ok(productServer.userbyId(id))

}