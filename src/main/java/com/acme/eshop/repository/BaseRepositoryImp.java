package com.acme.eshop.repository;

import com.acme.eshop.domain.BaseModel;

public class BaseRepositoryImp<T extends BaseModel> {

    public void delete(T entity) {
        //getStorage().put(entity.getId(), null);
    }
}
