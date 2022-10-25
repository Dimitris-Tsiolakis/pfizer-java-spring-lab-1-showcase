package com.acme.eshop.repository;

import com.acme.eshop.domain.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel> {
    T create(T entity);

    void update(T entity);

    void delete(T entity);

    T get(Long id);

    List<T> findAll();
}

