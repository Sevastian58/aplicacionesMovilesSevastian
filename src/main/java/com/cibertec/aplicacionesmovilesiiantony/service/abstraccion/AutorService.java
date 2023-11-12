package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.Autor;
import com.cibertec.aplicacionesmovilesiiantony.model.Editorial;

import java.util.List;

public interface AutorService {
    List<Autor> listarTodo();
    Autor findByInd(Integer id);

    Autor update(Autor autor);
    Autor save(Autor autor);
    void delete(Integer id);
}
