package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Autor;
import com.cibertec.aplicacionesmovilesiiantony.repository.AutorRespository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRespository autorRespository;

    @Override
    public List<Autor> listarTodo() {
        return autorRespository.findAll();
    }

    @Override
    public Autor findByInd(Integer id) {
        return autorRespository.findById(id).orElse(null);
    }

    @Override
    public Autor update(Autor autor) {
        return autorRespository.save(autor);
    }

    @Override
    public Autor save(Autor autor) {
        return autorRespository.save(autor);
    }

    @Override
    public void delete(Integer id) {
        autorRespository.deleteById(id);
    }
}
