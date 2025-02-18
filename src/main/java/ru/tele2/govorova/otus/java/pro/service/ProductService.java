package ru.tele2.govorova.otus.java.pro.service;

import org.springframework.stereotype.Service;
import ru.tele2.govorova.otus.java.pro.model.Product;
import ru.tele2.govorova.otus.java.pro.repository.InMemoryProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final InMemoryProductRepository repository;

    public ProductService(InMemoryProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.getAllProducts();
    }

    public Optional<Product> getProductById(Long id) {
        return repository.getProductById(id);
    }

    public Product createProduct(Product product) {
        return repository.createProduct(product);
    }
}
