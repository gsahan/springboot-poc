package com.spboot.poc.model.mapper;

import com.spboot.poc.model.dto.ProductDto;
import com.spboot.poc.model.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductMapper {
    ProductDto convertToProductDto(ProductEntity productEntity);
    ProductEntity convertToProductEntity(ProductDto productDto);
}
