package com.example.MyApis.repostory

import com.example.MyApis.model.Product
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepo : MongoRepository<Product,String> {
}