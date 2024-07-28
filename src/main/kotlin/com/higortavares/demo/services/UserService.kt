package com.higortavares.demo.services

import com.higortavares.demo.controller.Request
import com.higortavares.demo.infraestructure.AuditServer
import com.higortavares.demo.models.Audit
import com.higortavares.demo.models.User
import com.higortavares.demo.models.UserAction
import com.higortavares.demo.repository.UserRepository
import org.springframework.stereotype.Service

typealias Email = String

@Service
class UserService(private val repository: UserRepository, private val auditServer: AuditServer) {

    companion object {
        private val SELECT_USERS = "Select * from users"
    }

    fun save(user: User): User {
        return repository.save(user)
    }

    fun findAll(request: Request): List<User> {
        auditServer.save(Audit(username = request.username, ip = request.ip, userAction = UserAction.READ, description = SELECT_USERS, id=null))
        return repository.findAll()
    }
}