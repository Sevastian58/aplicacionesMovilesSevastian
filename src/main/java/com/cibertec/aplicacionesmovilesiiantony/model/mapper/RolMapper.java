package com.cibertec.aplicacionesmovilesiiantony.model.mapper;

import com.cibertec.aplicacionesmovilesiiantony.model.Rol;

public interface RolMapper {
    Rol toEntityRol(DTORol dtoRol);
    DTORol toDTORol(Rol rol);
}
