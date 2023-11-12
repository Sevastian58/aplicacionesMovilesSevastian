package com.cibertec.aplicacionesmovilesiiantony.repository;

import com.cibertec.aplicacionesmovilesiiantony.model.Autor;
import com.cibertec.aplicacionesmovilesiiantony.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
