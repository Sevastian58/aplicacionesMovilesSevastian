package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Prestamo;
import com.cibertec.aplicacionesmovilesiiantony.repository.PrestamoRepository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public Prestamo guardarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }
}
