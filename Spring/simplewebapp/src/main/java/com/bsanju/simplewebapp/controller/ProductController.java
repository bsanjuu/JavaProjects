package com.bsanju.simplewebapp.controller;

import com.bsanju.simplewebapp.model.Product;
import com.bsanju.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductService service;

   @GetMapping("/products")
   public List<Product> getProducts() {
        return service.getProduts();
    }
    @GetMapping("/products/{pid}")
    public Product getProduct(@PathVariable int pid) {
       return service.getProductById(pid);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        System.out.println(product);
       service.addProduct(product);
    }

    @PutMapping("/products")
    public  void updateProduct(@RequestBody Product product) {
       System.out.println(product);
       service.updateProduct(product);
    }
    @DeleteMapping("/products/{pid}")
    public void deleteProduct(@PathVariable int pid) {
       service.deleteProduct(pid);
    }
}
