package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.Libro;

import java.util.List;

public interface LibroService {
    List<Libro> listarTodo();
    Libro findByInd(Integer id);

    Libro update(Libro libro);
    Libro save(Libro libro);
    void delete(Integer id);

}
