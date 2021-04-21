package com.example.actuator.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ProductError {
  private LocalDateTime dateTime;
  private int errorcCode;
  private String errorMessage;
  private String url;
}
