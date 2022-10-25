package com.acme.eshop.repository;

import com.acme.eshop.domain.BaseModel;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public abstract class BaseRepositoryImp<T extends BaseModel> implements BaseRepository<T>{

    public abstract Map<Long, T> getStorage();
    public abstract AtomicLong getSequence();

    @Override
    public T create(T entity) {
        final long id = getSequence().getAndIncrement();
        getStorage().put(id, entity);
        entity.setId(id);
        return entity;
    }

    @Override
    public void update(T entity) {
        throw new UnsupportedOperationException();
    }

    public void delete(T entity) {
        getStorage().remove(entity.getId());
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
