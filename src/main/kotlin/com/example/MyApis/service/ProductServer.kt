package com.example.MyApis.service

import com.example.MyApis.model.Product
import com.example.MyApis.model.User
import com.example.MyApis.repostory.ProductRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class ProductServer (@Autowired val productRepo: ProductRepo){



    // single user add
    fun addUser(product: Product): Product =productRepo.insert(product)

    fun delectUser(id: String)=productRepo.deleteById(id)


    fun getAllUsers():List<Product> = productRepo.findAll()



    fun updateProduct(product: Product){
        val saved:Product = productRepo.findById(product.ProdutId).get()
        saved.ProdutId = product.ProdutId
        saved.description = product.description
        saved.image=product.image
        saved.price=product.price
        productRepo.save(product)

    }

    /*

      fun updateuser(user: User) {
        val savedUser: User = userRepository
            .findById(user.id).get()
        savedUser.name = user.name
        savedUser.age = user.age
        savedUser.id = user.id
        userRepository.save(savedUser)
    }

         */


    fun userbyId(id: String): Product{
        return productRepo.findById(id).get()
    }

    fun delectAll() = productRepo.deleteAll()

    fun Au(): ResponseEntity<List<Product>> {

        return ResponseEntity.ok(productRepo.findAll())
    }


}