package com.higortavares.demo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

typealias Username = String

@RestController
class Hello {

    @Value("\${server.name}")
    var serverName: String?=null;

    @GetMapping("/{username}")
    fun hello(@PathVariable("username") username: Username): ResponseEntity<String> {
        println("A user $username called hello method on $serverName...")
        val randomFailure = Random.nextInt(1, 10)
        if (randomFailure == 5) {
            throw RuntimeException("Randomig error ocurred!")
        }
        return ResponseEntity.ok("Olá $username! Seja bem vindo ao servidor $serverName!")
    }
}

