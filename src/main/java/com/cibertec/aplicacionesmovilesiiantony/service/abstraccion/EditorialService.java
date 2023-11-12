package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.Editorial;
import com.cibertec.aplicacionesmovilesiiantony.model.Libro;

import java.util.List;

public interface EditorialService {
    List<Editorial> listarTodo();
    Editorial findByInd(Integer id);

    Editorial update(Editorial editorial);
    Editorial save(Editorial editorial);
    void delete(Integer id);
}
