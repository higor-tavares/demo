package com.higortavares.demo.controller

import com.higortavares.demo.models.User
import com.higortavares.demo.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

typealias Users = List<User>
@RestController
@RequestMapping("/users")
class UserController(private val service: UserService) {

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody user: User) : ResponseEntity<User> =
        ResponseEntity.status(HttpStatus.CREATED).body(service.save(user))

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAll(@RequestHeader("ip") ip: String, @RequestHeader("username") username: String): ResponseEntity<Users> =
        ResponseEntity.status(HttpStatus.CREATED).body(service.findAll(Request(username,ip)))

}