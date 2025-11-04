package com.demo.jpa_crud_demo.payload;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Product_Dto {
    @NotEmpty(message = "Product name should not be empty")
    private String name;
    @NotNull(message = "Price should not be empty")
    private double price;
}
