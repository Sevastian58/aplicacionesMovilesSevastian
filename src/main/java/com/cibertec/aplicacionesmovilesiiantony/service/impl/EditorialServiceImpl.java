package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Editorial;
import com.cibertec.aplicacionesmovilesiiantony.repository.EditorialRepository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImpl implements EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public List<Editorial> listarTodo() {
        return editorialRepository.findAll();
    }

    @Override
    public Editorial findByInd(Integer id) {
        return editorialRepository.findById(id).orElse(null);
    }

    @Override
    public Editorial update(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(Integer id) {
    editorialRepository.deleteById(id);
    }
}
