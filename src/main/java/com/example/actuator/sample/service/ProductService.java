package com.example.actuator.sample.service;

import com.example.actuator.sample.dao.ProductDao;
import com.example.actuator.sample.exception.ProductException;
import com.example.actuator.sample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
  @Autowired ProductDao productDao;

  @PostConstruct
  public void addProductToDB() {
    List<Product> products = new ArrayList<Product>();
    products.add(new Product(1, "laptop", 5000));
    products.add(new Product(2, "charger", 100));
    productDao.saveAll(products);
  }

  public double findPrice(String name) throws ProductException {
    double amount;
    try {
      Product product = productDao.findByName(name);
      amount = product.getPrice();
    } catch (Exception e) {
      throw new ProductException("Poduct price not found for :" + name);
    }
    return amount;
  }
}
