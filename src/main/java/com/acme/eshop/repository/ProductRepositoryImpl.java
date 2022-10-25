package com.acme.eshop.repository;

import com.acme.eshop.domain.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class ProductRepositoryImpl extends BaseRepositoryImp<Product> implements ProductRepository {

    private final Map<Long, Product> storage = new LinkedHashMap<>();
    private final AtomicLong sequence = new AtomicLong(1);

    @Override
    public Map<Long, Product> getStorage() {
        return storage;
    }

    @Override
    public AtomicLong getSequence() {
        return sequence;
    }
}
