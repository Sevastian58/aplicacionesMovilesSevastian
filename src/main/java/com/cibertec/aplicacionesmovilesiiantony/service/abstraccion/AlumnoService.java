package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.Alumno;

import java.util.List;

public interface AlumnoService {
    public abstract Alumno grabarAlumno(Alumno alumno);
    public abstract List<Alumno> listarTodo();
}
