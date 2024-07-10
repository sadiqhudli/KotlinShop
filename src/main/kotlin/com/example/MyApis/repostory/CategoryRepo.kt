package com.example.MyApis.repostory

import com.example.MyApis.model.categories.entity.Categories
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface CategoryRep :CrudRepository<Categories,Int> {


}
