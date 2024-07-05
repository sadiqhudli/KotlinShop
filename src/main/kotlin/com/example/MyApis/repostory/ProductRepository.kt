package com.example.MyApis.repostory

import com.example.MyApis.model.product.entity.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepository : CrudRepository<Product, Long> {
}
