package com.example.MyApis.controller

import com.example.MyApis.extenstionFunctions.toEntity
import com.example.MyApis.extenstionFunctions.toResponse
import com.example.MyApis.model.categories.entity.Categories
import com.example.MyApis.model.userInfo.response.CategoryRequest
import com.example.MyApis.model.userInfo.response.CategoryResponse
import com.example.MyApis.service.Categoryservice
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/category")
class CategoryController( private val categoryservice: Categoryservice) {

   @GetMapping
    fun getAllCategories(): MutableIterable<Categories> {
        return categoryservice.getAllCategory()
    }

    @PostMapping("/add")
    fun saveCategory(@Valid @RequestBody categoryRequest: CategoryRequest): CategoryResponse {
       val category= categoryservice.saveCategory(categoryRequest.toEntity())
        return category.toResponse("added  successfully")
    }

    @DeleteMapping("/{id}")
    fun deleteCategory(@PathVariable id: Int) :CategoryResponse {
      val response = categoryservice.deleteById(id)

       return CategoryResponse(
            id = id,
            message = HttpStatus.OK.toString()
        )
    }

    @PutMapping("/{id}")
    fun updatecategoty(@RequestBody id: Int):CategoryResponse{
        val update = categoryservice.deleteById(id)
        return CategoryResponse(
            id = id,
            message = "$update"
        )
    }

}
