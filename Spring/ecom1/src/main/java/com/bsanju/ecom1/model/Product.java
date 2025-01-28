package com.bsanju.ecom1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private BigDecimal price;
    private String description;
    private String brand;
    private String category;
    private boolean available;
    private Date releaseDate;
    private int quantity;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", available=" + available +
                ", releaseDate=" + releaseDate +
                ", quantity=" + quantity +
                '}';
    }


}
