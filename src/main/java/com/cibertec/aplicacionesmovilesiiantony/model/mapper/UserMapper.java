package com.cibertec.aplicacionesmovilesiiantony.model.mapper;

import com.cibertec.aplicacionesmovilesiiantony.model.Rol;
import com.cibertec.aplicacionesmovilesiiantony.model.User;

public interface UserMapper {
    User toEntityUser(DTOUser dtoUser);
    DTOUser toDTOUser(User user);
}
