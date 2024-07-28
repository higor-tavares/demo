package com.higortavares.demo.models

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    val email: String,
    @Column(nullable = false)
    val birthday: LocalDateTime,
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @Column(nullable = true, name = "deleted_at")
    val deletedAt: LocalDateTime?,
    @Column(name="is_deleted")
    val isDeleted: Boolean? = false
)