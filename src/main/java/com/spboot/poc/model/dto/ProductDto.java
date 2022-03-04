package com.spboot.poc.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ProductDto {
    private String id;
    private String productType;
    private String url;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
