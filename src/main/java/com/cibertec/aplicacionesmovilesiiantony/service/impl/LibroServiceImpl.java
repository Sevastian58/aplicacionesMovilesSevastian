package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Libro;
import com.cibertec.aplicacionesmovilesiiantony.repository.LibroRepository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> listarTodo() {
        return libroRepository.findAll();
    }

    @Override
    public Libro findByInd(Integer id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public Libro update(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void delete(Integer id) {
        libroRepository.deleteById(id);
    }
}
