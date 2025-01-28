package com.bsanju.ecom1.controller;


import com.bsanju.ecom1.model.Product;
import com.bsanju.ecom1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private  ProductService service;


    @RequestMapping("/")
    public String greeting() {
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {

        List<Product> products = service.getAllProducts();
        System.out.println("Products fetched: " + products.toString());
        return products;


    }


}
