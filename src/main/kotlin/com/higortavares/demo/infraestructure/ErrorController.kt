package com.higortavares.demo.infraestructure

import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageConversionException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ErrorController {

    @ExceptionHandler
    fun handleInvalidMessage(ex: HttpMessageConversionException) = ResponseEntity.badRequest().body(ex.message)
}