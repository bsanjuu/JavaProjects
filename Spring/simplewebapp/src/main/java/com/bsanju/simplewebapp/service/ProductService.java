package com.bsanju.simplewebapp.service;

import com.bsanju.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101,"Iphone",1200),
            new Product(102,"Pixel",800),
            new Product(103,"Samsung",900)));

    public List<Product> getProduts()
    {
        return products;
    }

    public Product getProductById(int pid) {
        return products.stream()
                        .filter(p-> p.getProdId()==pid)
                        .findFirst().orElse(new Product(000,"Item Not Found",000));

    }

    public  void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index=0;
        for(int i=0; i<products.size(); i++)
            if(products.get(i).getProdId()==product.getProdId())
        products.set(index,product);
    }


    public void deleteProduct(int pid) {
        int index=0;
        for(int i=0; i<products.size(); i++)
            if(products.get(i).getProdId()==pid)
                index=i;

        products.remove(index);

    }
}
