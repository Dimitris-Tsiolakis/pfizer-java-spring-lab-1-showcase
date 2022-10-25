package com.acme.eshop.repository;

import com.acme.eshop.domain.BaseModel;

import java.util.List;

public class BaseRepositoryImp<T extends BaseModel> implements BaseRepository<T>{

    @Override
    public T create(T entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(T entity) {
        throw new UnsupportedOperationException();
    }

    public void delete(T entity) {
        //getStorage().put(entity.getId(), null);
    }

    @Override
    public T get(Long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> findAll() {
        throw new UnsupportedOperationException();
    }
}
