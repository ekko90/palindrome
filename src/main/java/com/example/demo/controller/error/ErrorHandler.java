package com.example.demo.controller.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.types.error.MalformedRequestError;

@ControllerAdvice
public class ErrorHandler {

  @ExceptionHandler(HttpMessageNotReadableException.class)
  @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
  protected ResponseEntity<MalformedRequestError> malformedRequest() {

    return new ResponseEntity<MalformedRequestError>(MalformedRequestError.builder()
        .statusCode("PL-1001").message("Malformed request.").build(),
        HttpStatus.UNPROCESSABLE_ENTITY);
  }
}
