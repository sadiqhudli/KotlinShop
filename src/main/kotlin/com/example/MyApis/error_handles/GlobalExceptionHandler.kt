package com.example.MyApis.error_handles

import org.springframework.context.annotation.Bean
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

import org.springframework.web.context.request.WebRequest
import org.springframework.web.server.ResponseStatusException


@ControllerAdvice
class GlobalExceptionHandler{


    @ExceptionHandler(ResponseStatusException::class)
    @ResponseBody
    fun handleResponseStatusException(ex: ResponseStatusException, request: WebRequest): ResponseEntity<ErrorResponse> {
        val errorResponse =ErrorResponse(status = ex.statusCode.value(), message = "${ex.message}")
            //ErrorResponse(ex.status.value(), ex.reason ?: "Unexpected error")
       // return ResponseEntity(errorResponse, ex.status)
        return ResponseEntity(errorResponse,ex.statusCode)
    }

    @ExceptionHandler(Exception::class)
    fun handleGenericException(ex: Exception, request: WebRequest): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.message ?: "Unexpected error")
        return ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR)
    }
}

data class ErrorResponse(val status: Int, val message: String)

