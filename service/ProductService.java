package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        for (Product p : products) {
            if (p.getProductId().equals(id)) {
                p.setProductName(updatedProduct.getProductName());
                p.setPrice(updatedProduct.getPrice());
                return p;
            }
        }
        return null;
    }

    public boolean deleteProduct(Long id) {
        return products.removeIf(p -> p.getProductId().equals(id));
    }
}
