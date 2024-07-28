package com.higortavares.demo.models

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="audit")
data class Audit(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val username: String,
    @Column(name="user_action")
    @Enumerated(EnumType.STRING)
    val userAction: UserAction,
    @Column(name="created_at")
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val description: String,
    val ip: String
)