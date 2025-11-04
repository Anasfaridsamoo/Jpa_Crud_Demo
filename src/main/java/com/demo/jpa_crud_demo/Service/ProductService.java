package com.demo.jpa_crud_demo.Service;

import com.demo.jpa_crud_demo.payload.Product_Dto;

import java.util.List;

public interface ProductService {
    Product_Dto createProduct(Product_Dto productDto);
    Product_Dto updateProduct(Product_Dto productDto, int id);
    Product_Dto findProductById(int id);
    List<Product_Dto> findAllProducts();
    void deleteProduct(int id);

}
