package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Localidad;
import com.utn.tpAPI.repositories.BaseRepository;
import com.utn.tpAPI.repositories.LocalidadRepository;
import com.utn.tpAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Localidad> findAll() throws Exception {
        return null;
    }

    @Override
    public Localidad findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Localidad save(Localidad entity) throws Exception {
        return null;
    }

    @Override
    public Localidad update(Long aLong, Localidad entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
