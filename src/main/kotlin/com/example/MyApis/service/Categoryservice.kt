package com.example.MyApis.service

import com.example.MyApis.extenstionFunctions.toEntity
import com.example.MyApis.model.categories.entity.Categories
import com.example.MyApis.model.userInfo.response.CategoryResponse
import com.example.MyApis.repostory.CategoryRep
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class Categoryservice(val cateRepo: CategoryRep) {
    fun saveCategory(categoryRequest: Categories): Categories {
        return cateRepo.save(categoryRequest.toEntity())
    }
    fun getAllCategories(): MutableIterable<Categories> {
        return cateRepo.findAll()
    }
    fun getCategoriesById(id: Int): Categories {
        return cateRepo.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "category not found")
        }
    }
    fun deleteById(id: Int) :String {
        val response = cateRepo.deleteById(id)

        return response.toString()

    }


    fun getAllCategory(): MutableIterable<Categories> {
        return cateRepo.findAll()
    }


    fun addCaterory(categories: Categories): Categories {

        return cateRepo.save(categories)
    }


}