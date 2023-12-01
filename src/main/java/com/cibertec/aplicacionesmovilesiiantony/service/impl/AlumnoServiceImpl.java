package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Alumno;
import com.cibertec.aplicacionesmovilesiiantony.repository.AlumnoRepository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno grabarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> listarTodo() {
        return alumnoRepository.findAll();
    }
}
