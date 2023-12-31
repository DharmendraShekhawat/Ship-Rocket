package com.dharmendra.myRocket.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(OrderNotFoundException.class)
     public ResponseEntity<String> orderNotFoundExceptionHandler(OrderNotFoundException ex){
     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
 }

}
