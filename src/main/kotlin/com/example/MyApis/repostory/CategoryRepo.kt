package com.example.MyApis.repostory

import com.example.MyApis.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepo :JpaRepository<Category,Int> {

}