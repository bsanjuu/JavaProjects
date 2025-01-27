package com.bsanju.simplewebapp.service;

import com.bsanju.simplewebapp.model.Product;
import com.bsanju.simplewebapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101,"Iphone",1200),
//            new Product(102,"Pixel",800),
//            new Product(103,"Samsung",900)));


    @Autowired
    ProductRepo repo;

    public List<Product> getProduts()
    {
        return repo.findAll();
    }

    public Product getProductById(int pid) {
         return repo.findById(pid).orElse(new Product());

    }

    public  void addProduct(Product product) {
       repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }


    public void deleteProduct(int pid) {
        repo.deleteById(pid);

    }
}
