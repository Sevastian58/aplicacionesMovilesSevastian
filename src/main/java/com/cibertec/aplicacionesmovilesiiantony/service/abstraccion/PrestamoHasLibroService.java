package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.Alumno;
import com.cibertec.aplicacionesmovilesiiantony.model.Libro;
import com.cibertec.aplicacionesmovilesiiantony.model.PrestamoHasLibro;
import com.cibertec.aplicacionesmovilesiiantony.model.PrestamoHasLibroPK;

import java.util.List;

public interface PrestamoHasLibroService {

    public abstract List<PrestamoHasLibro> listarTodo();
    public abstract List<Libro> listarLibros();
    public abstract List<Alumno> listarAlumnos();
    public abstract PrestamoHasLibro registrarPrestamoHasLibro(PrestamoHasLibro prestamoHasLibro);
    public abstract void eliminarPrestamoHasLibro(int idPrestamo, int idLibro);
}
