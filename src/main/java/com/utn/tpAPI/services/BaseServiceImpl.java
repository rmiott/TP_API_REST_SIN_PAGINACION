package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Base;
import com.utn.tpAPI.repositories.BaseRepository;

import java.io.Serializable;

public abstract class BaseServiceImpl <E extends Base, ID extends Serializable> implements BaseService<E,ID> {
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
}
