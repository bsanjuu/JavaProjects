package com.bsanju.simplewebapp.controller;

import com.bsanju.simplewebapp.model.Product;
import com.bsanju.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductService service;

   @RequestMapping("/products")
   public List<Product> getProducts() {
        return service.getProduts();
    }
    @RequestMapping("/products/{pid}")
    public Product getProduct(@PathVariable int pid) {
       return service.getProductById(pid);
    }
}
