package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.Prestamo;
import com.cibertec.aplicacionesmovilesiiantony.model.PrestamoHasLibroPK;

public interface PrestamoService {

    public abstract Prestamo guardarPrestamo(Prestamo prestamo);
}
