package com.example.MyApis.model.userInfo.entity


import jakarta.persistence.*

@Entity
@Table(name = "users_tables")
data class UserInfo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id_users: Int,
    @Column(nullable = false)
    var full_name: String,
    @Column(nullable = false)
    var email: String,
    @Column(nullable = false)
    var password:String,
    @Column(nullable = false)
    val phone_number: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)

    val role: Role
    )

enum class Role{
    ADMIN, USER,
}





