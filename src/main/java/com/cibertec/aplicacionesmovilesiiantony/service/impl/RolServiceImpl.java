package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Rol;
import com.cibertec.aplicacionesmovilesiiantony.repository.RolRepository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> listAll() {
        return rolRepository.findAll();
    }
}
