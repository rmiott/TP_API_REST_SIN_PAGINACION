package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Autor;
import com.utn.tpAPI.repositories.AutorRepository;
import com.utn.tpAPI.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }

    @Override
    public Autor findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Autor save(Autor entity) throws Exception {
        return null;
    }

    @Override
    public Autor update(Long aLong, Autor entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
