package com.demo.jpa_crud_demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "product_name", nullable = false, length = 150)
    private String name;
    @Column(name = "product_price", nullable = false)
    private double price;
}
