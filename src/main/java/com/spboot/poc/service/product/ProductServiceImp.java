package com.spboot.poc.service.product;

import com.spboot.poc.model.dto.ProductDto;
import com.spboot.poc.model.entity.ProductEntity;
import com.spboot.poc.model.mapper.ProductMapper;
import com.spboot.poc.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductServiceImp implements ProductService{

    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImp(ProductRepo productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDto> findProduct(String id) {
        return productRepo.findById(id).stream()
                .map(productMapper::convertToProductDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findAllProducts() {
        return productRepo.findAll().stream()
                .map(productMapper::convertToProductDto).collect(Collectors.toList());
    }

    @Override
    public String saveProduct(ProductDto productDto) {
        ProductEntity productEntity = productMapper.convertToProductEntity(productDto);
        ProductEntity saved = this.productRepo.save(productEntity);
        return "saved";
    }
}
