package com.example.MyApis.extenstionFunctions

import com.example.MyApis.model.categories.entity.Categories
import com.example.MyApis.model.userInfo.response.CategoryRequest
import com.example.MyApis.model.userInfo.response.CategoryResponse
import kotlin.random.Random


fun Categories.toEntity(): Categories {
    return Categories(
        id_categories = this.id_categories,
        category_name = this.category_name,
        urlSlug = "${this.category_name}-${Random.nextInt()}"
    )
}

fun CategoryRequest.toEntity():Categories{
    return Categories(
        id_categories = this.id,
        category_name = this.name,
        urlSlug = this.url
    )
}

val ran = Random.nextInt()



fun Categories.toResponse(message: String): CategoryResponse {
    return CategoryResponse(
        id = this.id_categories,
        message = message
    )
}

