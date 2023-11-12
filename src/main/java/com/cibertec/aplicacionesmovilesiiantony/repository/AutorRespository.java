package com.cibertec.aplicacionesmovilesiiantony.repository;

import com.cibertec.aplicacionesmovilesiiantony.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRespository extends JpaRepository<Autor, Integer> {
}
