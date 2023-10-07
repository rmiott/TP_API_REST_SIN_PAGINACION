package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Persona;
import com.utn.tpAPI.repositories.BaseRepository;
import com.utn.tpAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }

    @Override
    public Persona findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    public Persona update(Long aLong, Persona entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
