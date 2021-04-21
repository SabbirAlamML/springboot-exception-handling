package com.example.actuator.sample.controller;

import com.example.actuator.sample.exception.ProductException;
import com.example.actuator.sample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

  @Autowired ProductService service;

  @GetMapping("/{name}")
  public double getProductName(@PathVariable String name) throws ProductException {
    return service.findPrice(name);
  }
}
