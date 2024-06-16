package com.dev.sunny.springbootdemo.services.impl;

import com.dev.sunny.springbootdemo.dtos.ProductDto;
import com.dev.sunny.springbootdemo.entities.Product;
import com.dev.sunny.springbootdemo.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductServiceImpl implements ProductService {
    private final Map<Long, Product> productMap;

    public ProductServiceImpl() {
        this.productMap = Stream.of(new Product(
                1L,
                "Product 1",
                "Product 1 Description",
                100.0
        ), new Product(
                2L,
                "Product 2",
                "Product 2 Description",
                200.0
        ), new Product(
                3L,
                "Product 3",
                "Product 3 Description",
                300.0
        )).collect(Collectors.toMap(Product::getProductId, product -> product));
    }

    @Override
    public ProductDto addProduct(Product product) {
        productMap.put(product.getProductId(), product);
        Product savedProduct = productMap.get(product.getProductId());
        return ProductDto.productToProductDto(savedProduct);
    }
}
