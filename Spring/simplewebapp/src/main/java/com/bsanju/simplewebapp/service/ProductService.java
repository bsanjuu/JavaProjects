package com.bsanju.simplewebapp.service;

import com.bsanju.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",1200),
            new Product(102,"Pixel",800),
            new Product(103,"Samsung",900));

    public List<Product> getProduts()
    {
        return products;
    }

    public Product getProductById(int pid) {
        return products.stream()
                        .filter(p-> p.getProdId()==pid)
                        .findFirst().orElse(new Product(000,"Item Not Found",000));

    }
}
