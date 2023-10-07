package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Domicilio;
import com.utn.tpAPI.repositories.BaseRepository;
import com.utn.tpAPI.repositories.DomicilioRepository;
import com.utn.tpAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Domicilio> findAll() throws Exception {
        return null;
    }

    @Override
    public Domicilio findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Domicilio save(Domicilio entity) throws Exception {
        return null;
    }

    @Override
    public Domicilio update(Long aLong, Domicilio entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
