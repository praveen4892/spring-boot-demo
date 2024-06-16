package com.dev.sunny.springbootdemo.controllers;

import com.dev.sunny.springbootdemo.dtos.ProductDto;
import com.dev.sunny.springbootdemo.entities.Product;
import com.dev.sunny.springbootdemo.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping({"/product", "/addProduct"})
    public ProductDto addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}
