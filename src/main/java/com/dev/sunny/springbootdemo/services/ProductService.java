package com.dev.sunny.springbootdemo.services;

import com.dev.sunny.springbootdemo.dtos.ProductDto;
import com.dev.sunny.springbootdemo.entities.Product;

public interface ProductService {
    ProductDto addProduct(Product product);
//    Product getProduct(Long productId);
//    Product updateProduct(Product product);
//    Product modifyProduct(Product product);
//    Boolean deleteProduct(Long productId);
//    List<Product> getProducts();
}
