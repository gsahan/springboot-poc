package com.spboot.poc.model.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProductSearchResponse {
    private List<ProductDto> listOfProducts;
}
