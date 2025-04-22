package com.isha.BootPracticeProject.controller;


import com.isha.BootPracticeProject.model.Product;
import com.isha.BootPracticeProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/products")
    public List<Product> getProductsList(){
        return service.getProduct();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        Product productBy = service.getProductBy(productId);
        return productBy;
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product p){
        service.updateProduct(p);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
    }

}
