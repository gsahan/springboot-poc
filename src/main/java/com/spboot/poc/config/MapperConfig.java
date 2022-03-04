package com.spboot.poc.config;

import com.spboot.poc.model.mapper.ProductMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MapperConfig {

    @Bean
    @Lazy
    @Scope("prototype")
    ProductMapper getProductMapper(){
        return Mappers.getMapper(ProductMapper.class);
    }

}
