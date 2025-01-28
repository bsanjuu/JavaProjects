package com.bsanju.ecom1.service;

import com.bsanju.ecom1.model.Product;
import com.bsanju.ecom1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{

    @Autowired
    ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

}
