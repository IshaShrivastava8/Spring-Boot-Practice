package com.isha.BootPracticeProject.service;

import com.isha.BootPracticeProject.model.Product;
import com.isha.BootPracticeProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;


//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Phone", 50000),
//            new Product(102, "Camera", 70000),
//            new Product(103, "Mic", 10000)
//    ));

    public List<Product> getProduct(){
//        return products;
        return repo.findAll();
    }

    public Product getProductBy(int productId){
//        return products.stream().filter(p->p.getProductId()==productId).findFirst().orElse(new Product(100,"No Product Found",2000));

        return (Product) repo.findById(productId).orElse(new Product(100,"No Product Found",2000));
    }

    public void addProduct(Product p){
//        products.add(p);
        repo.save(p);
    }

    public void updateProduct(Product p) {
//        int ind = 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProductId() == p.getProductId()) {
//                ind = i;
//                break;
//            }
//        }
//
//        products.add(ind,p);
        System.out.println("Updating: " + p);

        repo.save(p);
    }

    public void deleteProduct(int productId) {
//        int ind = 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProductId() == productId) {
//                ind = i;
//                break;
//            }
//        }
//
//        products.remove(ind);

        repo.deleteById(productId);
    }
}
