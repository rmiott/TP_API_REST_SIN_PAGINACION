package com.utn.tpAPI.repositories;

import com.utn.tpAPI.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
