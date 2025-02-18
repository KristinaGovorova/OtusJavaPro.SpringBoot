package ru.tele2.govorova.otus.java.pro.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.tele2.govorova.otus.java.pro.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Component
public class InMemoryProductRepository {

    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    public Product createProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}
