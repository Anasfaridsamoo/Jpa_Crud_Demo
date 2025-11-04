package com.demo.jpa_crud_demo.Mapper;

import com.demo.jpa_crud_demo.entities.Product;
import com.demo.jpa_crud_demo.payload.Product_Dto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Product_Mapper {
    Product_Dto productToDto(Product product);
    Product DtoToProduct(Product_Dto productDto);
}
