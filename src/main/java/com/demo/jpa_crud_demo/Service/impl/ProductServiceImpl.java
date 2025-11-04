package com.demo.jpa_crud_demo.Service.impl;

import com.demo.jpa_crud_demo.Exception.ResourceNotFoundException;
import com.demo.jpa_crud_demo.Mapper.Product_Mapper;
import com.demo.jpa_crud_demo.Repository.ProductRepo;
import com.demo.jpa_crud_demo.Service.ProductService;
import com.demo.jpa_crud_demo.entities.Product;
import com.demo.jpa_crud_demo.payload.Product_Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final Product_Mapper productMapper;
    @Override
    public Product_Dto createProduct(Product_Dto productDto) {
        Product product = this.productMapper.DtoToProduct(productDto);
        Product savedProduct = this.productRepo.save(product);
        return this.productMapper.productToDto(savedProduct);
    }

    @Override
    public Product_Dto updateProduct(Product_Dto productDto,int id) {
        Product product = this.productRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        return  this.productMapper.productToDto(productRepo.save(product));
    }

    @Override
    public Product_Dto findProductById(int id) {
        Product product = this.productRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
        return this.productMapper.productToDto(product);
    }

    @Override
    public List<Product_Dto> findAllProducts() {
        List<Product> products = this.productRepo.findAll();
        List<Product_Dto> productDtos = products.stream().map(product-> this.productMapper.productToDto(product)).collect(Collectors.toList());
        return productDtos;
    }

    @Override
    public void deleteProduct(int id) {
        Product product = this.productRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
        this.productRepo.delete(product);

    }
}
