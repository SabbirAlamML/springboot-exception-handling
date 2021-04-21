package com.example.actuator.sample.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  @Id private int id;
  private String name;
  private double price;
}
