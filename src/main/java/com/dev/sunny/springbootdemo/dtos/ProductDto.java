package com.dev.sunny.springbootdemo.dtos;

import com.dev.sunny.springbootdemo.entities.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDto {
    private String productName;
    private String productDescription;
    private Double productPrice;

    public static ProductDto productToProductDto(Product product) {
        return ProductDto.builder()
                .productName(product.getProductName())
                .productDescription(product.getDescription())
                .productPrice(product.getPrice())
                .build();
    }
}
