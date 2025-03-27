package com.bsanju.springsecurity.controller;
import com.bsanju.springsecurity.model.Product;
import com.bsanju.springsecurity.service.ProductService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/{id}/like")
    public Product likeProduct(@PathVariable Long id) {
        return productService.likeProduct(id);
    }
}
