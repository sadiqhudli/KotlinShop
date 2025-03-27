package com.example.MyApis.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController()
@RequestMapping("/category")
class CategoryController {

    //localhost:7788/category/test
    @GetMapping("/test")
    fun categoryText():String{
        return  "checking for end point "
    }


}