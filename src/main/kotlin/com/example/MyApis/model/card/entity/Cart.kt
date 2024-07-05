package com.example.MyApis.model.card.entity

import com.example.MyApis.model.product.entity.Product
import jakarta.persistence.*


/*


@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User

@OneToMany(mappedBy = "author", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val books: List<Book> = mutableListOf()

            @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")

      @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = [JoinColumn(name = "student_id")],
        inverseJoinColumns = [JoinColumn(name = "course_id")]
    )
    val courses: List<Course> = mutableListOf()


)
 */
@Entity
@Table(name = "cart_tables")
data class Cart(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val cart_id:Int,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    val product: Product? = null,

    @Column(nullable = false)
    val quantity: Int
)

