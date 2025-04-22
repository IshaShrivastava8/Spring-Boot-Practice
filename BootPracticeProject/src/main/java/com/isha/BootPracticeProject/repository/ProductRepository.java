package com.isha.BootPracticeProject.repository;

import com.isha.BootPracticeProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends JpaRepository<Product,Integer>{
}
