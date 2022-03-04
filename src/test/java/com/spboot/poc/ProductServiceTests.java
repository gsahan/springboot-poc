package com.spboot.poc;

import com.spboot.poc.model.dto.ProductDto;
import com.spboot.poc.model.entity.ProductEntity;
import com.spboot.poc.model.mapper.ProductMapper;
import com.spboot.poc.repository.ProductRepo;
import com.spboot.poc.service.product.ProductServiceImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;

//@SpringBootTest
public class ProductServiceTests {

    @InjectMocks
    ProductServiceImp underTest;

    @Mock
    ProductRepo productRepo;

    @Spy
    ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findById_gets_and_maps_to_dto() {

        ProductEntity ent = ProductEntity.builder()
                .id("1")
                .url("url")
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        Mockito.when(productRepo.findById("1")).thenReturn(Optional.of(ent));

        List<ProductDto> listProductFound = underTest.findProduct("1");

        Assertions.assertEquals(listProductFound.size(), 1);
        Assertions.assertNotNull(listProductFound.get(0));
        Assertions.assertEquals(listProductFound.get(0).getId(), "1");
        Assertions.assertEquals(listProductFound.get(0).getCreatedDate(),ent.getCreatedDate());
        Assertions.assertEquals(listProductFound.get(0).getUpdatedDate(),ent.getUpdatedDate());


    }


}
