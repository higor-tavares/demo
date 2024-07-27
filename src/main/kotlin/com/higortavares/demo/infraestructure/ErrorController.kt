package com.higortavares.demo.infraestructure

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ErrorController {

    @ExceptionHandler
    fun handleRandomicError(ex:RuntimeException) = ResponseEntity.internalServerError().body("Random error")
}