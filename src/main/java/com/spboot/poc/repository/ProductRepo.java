package com.spboot.poc.repository;

import com.spboot.poc.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,String> {
    Optional<ProductEntity> findById(String Id);

}
