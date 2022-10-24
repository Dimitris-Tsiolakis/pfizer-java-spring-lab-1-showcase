package com.acme.eshop.repository;

import com.acme.eshop.domain.Product;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public void delete(Product p) {
        // getStorage().put(p.getId(), null);
    }
}
