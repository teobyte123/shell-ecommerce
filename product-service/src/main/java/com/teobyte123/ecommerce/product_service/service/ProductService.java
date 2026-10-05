package com.teobyte123.ecommerce.product_service.service;

import com.teobyte123.ecommerce.product_service.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = List.of(
        new Product(1L, "Laptop", 999.99),
        new Product(2L, "Headphones", 149.99)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}