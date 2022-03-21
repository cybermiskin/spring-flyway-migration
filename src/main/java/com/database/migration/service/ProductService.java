package com.database.migration.service;

import com.database.migration.entity.Product;
import com.database.migration.entity.dto.ListProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<ListProductDto> findAllProducts(Pageable pageable);
    Product findProductById(Long id);
    Product createNewProducts(Product payload);
    Product updateProduct(Long id, Product payload);
    void deleteProduct(Long id);
}
