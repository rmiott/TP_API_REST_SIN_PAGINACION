package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Libro;
import com.utn.tpAPI.repositories.BaseRepository;
import com.utn.tpAPI.repositories.LibroRepository;
import com.utn.tpAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Libro> findAll() throws Exception {
        return null;
    }

    @Override
    public Libro findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Libro save(Libro entity) throws Exception {
        return null;
    }

    @Override
    public Libro update(Long aLong, Libro entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
