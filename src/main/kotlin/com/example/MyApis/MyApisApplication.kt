package com.example.MyApis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc


@SpringBootApplication

@EnableWebMvc
class MyApisApplication

fun main(args: Array<String>) {
	runApplication<MyApisApplication>(*args)
}
