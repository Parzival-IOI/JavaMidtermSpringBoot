package com.java.midtermy3s2.services;

import com.java.midtermy3s2.api.models.Product;
import com.java.midtermy3s2.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> find(int id) {
        return productRepository.findById(id);
    }

    public void updateProduct(int id, Product product) {
        Optional<Product> product1 = productRepository.findById(id);
        product1.ifPresent(value -> productRepository.save(
                Product.builder()
                        .id(value.getId())
                        .name(product.getName())
                        .price(product.getPrice())
                        .active(product.isActive())
                        .build()
        ));
    }
}
