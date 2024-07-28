package com.higortavares.demo.services

import com.higortavares.demo.models.User
import com.higortavares.demo.repository.UserRepository
import org.springframework.stereotype.Service

typealias Email = String

@Service
class UserService(private val repository: UserRepository) {

    fun save(user: User): User {
        return repository.save(user)
    }

    fun findAll(): List<User> {
        return repository.findAll()
    }
}