package com.microservices.productservices.service;

import com.microservices.productservices.enums.Language;
import com.microservices.productservices.repository.entity.Product;
import com.microservices.productservices.request.ProductCreateRequest;
import com.microservices.productservices.request.ProductUpdateRequest;

import java.util.List;

public interface IProductRepositoryService {
    Product createProduct(Language language, ProductCreateRequest productCreateRequest);

    Product getProduct(Language language, Long productId);

    List<Product> getProducts(Language language);

    Product updateProduct(Language language, Long productId, ProductUpdateRequest productUpdateRequest);

    Product deleteProduct(Language language, Long productId);
}
