package com.example.actuator.sample.exception;

import com.example.actuator.sample.exception.ProductException;
import com.example.actuator.sample.model.ProductError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {
  @ExceptionHandler(ProductException.class)
  public ResponseEntity<ProductError> mapExcpetion(ProductException e, WebRequest request) {
    ProductError error =
        new ProductError(
            LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), request.getDescription(false));
    return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
