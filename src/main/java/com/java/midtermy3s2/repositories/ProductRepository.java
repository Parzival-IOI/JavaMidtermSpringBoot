package com.java.midtermy3s2.repositories;

import com.java.midtermy3s2.api.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
