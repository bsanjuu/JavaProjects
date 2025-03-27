package com.bsanju.springsecurity.repo;

import com.bsanju.springsecurity.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
