package com.example.MyApis.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.annotation.Collation
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import javax.annotation.processing.Generated

@Document()
data class User(
    @Id
    var id:String,
    @Field(name="name")
    @Indexed(unique = true)
    var name:String,
    var age:String

)


