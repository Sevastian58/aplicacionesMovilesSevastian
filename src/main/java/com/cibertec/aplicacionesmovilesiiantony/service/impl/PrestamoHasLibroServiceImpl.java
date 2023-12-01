package com.cibertec.aplicacionesmovilesiiantony.service.impl;

import com.cibertec.aplicacionesmovilesiiantony.model.Alumno;
import com.cibertec.aplicacionesmovilesiiantony.model.Libro;
import com.cibertec.aplicacionesmovilesiiantony.model.PrestamoHasLibro;
import com.cibertec.aplicacionesmovilesiiantony.model.PrestamoHasLibroPK;
import com.cibertec.aplicacionesmovilesiiantony.repository.AlumnoRepository;
import com.cibertec.aplicacionesmovilesiiantony.repository.LibroRepository;
import com.cibertec.aplicacionesmovilesiiantony.repository.PrestamoHasLibroRepository;
import com.cibertec.aplicacionesmovilesiiantony.repository.UserRepository;
import com.cibertec.aplicacionesmovilesiiantony.service.abstraccion.PrestamoHasLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoHasLibroServiceImpl implements PrestamoHasLibroService {

    @Autowired
    private PrestamoHasLibroRepository prestamoHasLibroRepository;

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<PrestamoHasLibro> listarTodo() {
        return prestamoHasLibroRepository.findAll();
    }

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public PrestamoHasLibro registrarPrestamoHasLibro(PrestamoHasLibro prestamoHasLibro) {
        return prestamoHasLibroRepository.save(prestamoHasLibro);
    }

    @Override
    public void eliminarPrestamoHasLibro(int idPrestamo, int idLibro) {

        PrestamoHasLibroPK id = new PrestamoHasLibroPK();
        id.setIdPrestamo(idPrestamo);
        id.setIdLibro(idLibro);

        prestamoHasLibroRepository.deleteById(id);

    }



}
