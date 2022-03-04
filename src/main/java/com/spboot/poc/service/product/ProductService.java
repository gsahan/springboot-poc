package com.spboot.poc.service.product;

import com.spboot.poc.model.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findProduct(String id);
    List<ProductDto> findAllProducts();
    String saveProduct(ProductDto productDto);

}
