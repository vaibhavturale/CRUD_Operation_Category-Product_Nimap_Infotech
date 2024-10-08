package org.nimapinfotech.service;

import org.nimapinfotech.entity.Category;
import org.nimapinfotech.entity.Product;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ProductService {

    Page<Product> getAllProducts(int page, int size);

    Product createProduct(Product product);

    Optional<Product> getProductById(Long id);

    Product updateProduct(Long id, Product product);

    Boolean deleteProduct(Long id);
}
