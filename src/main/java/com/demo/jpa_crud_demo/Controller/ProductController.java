package com.demo.jpa_crud_demo.Controller;

import com.demo.jpa_crud_demo.Service.impl.ProductServiceImpl;
import com.demo.jpa_crud_demo.payload.ApiResponse;
import com.demo.jpa_crud_demo.payload.Product_Dto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/products")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl productService;
    //Post
    @PostMapping("/")
    ResponseEntity<Product_Dto> createProduct(@Valid @RequestBody Product_Dto productDto){
        Product_Dto createdProduct = this.productService.createProduct(productDto);
        return ResponseEntity.ok(createdProduct);
    }
    //Get
    @GetMapping("/{id}")
    ResponseEntity<Product_Dto> GetproductById(@PathVariable int id){
        Product_Dto productDto = this.productService.findProductById(id);
        return ResponseEntity.ok(productDto);
    }
    //GetAll
    @GetMapping("/")
    ResponseEntity<List<Product_Dto>> GetAllproducts(){
        return ResponseEntity.ok(this.productService.findAllProducts());
    }
    //Put
    @PutMapping("/{id}")
    ResponseEntity<Product_Dto> updateproduct(@Valid @RequestBody Product_Dto productDto,@PathVariable int id){
        Product_Dto updateProduct = this.productService.updateProduct(productDto, id);
        return ResponseEntity.ok(updateProduct);
    }
    //Delete
    @DeleteMapping("/{id}")
    ResponseEntity<ApiResponse> deleteProduct(@PathVariable int id){
       this.productService.deleteProduct(id);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Product Deleted Successfully",true), HttpStatus.OK);
    }
}
