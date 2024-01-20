package com.pageproductinformation.repository;

import com.pageproductinformation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM products WHERE id = :productId", nativeQuery = true)
    Product getProductById(long productId);
}
