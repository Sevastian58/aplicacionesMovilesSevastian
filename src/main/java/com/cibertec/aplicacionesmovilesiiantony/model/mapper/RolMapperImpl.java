package com.cibertec.aplicacionesmovilesiiantony.model.mapper;

import com.cibertec.aplicacionesmovilesiiantony.model.Rol;
import java.util.stream.Collectors;

public class RolMapperImpl implements RolMapper{


    UserMapperImpl userMapper = new UserMapperImpl();
    @Override
    public Rol toEntityRol(DTORol dtoRol) {
        return Rol.builder()
                .id(dtoRol.id())
                .description(dtoRol.description())
                .listUser(dtoRol.listUser().stream()
                        .map(p->userMapper.toEntityUser(p))
                        .collect(Collectors.toList()))
                .build();
    }

    @Override
    public DTORol toDTORol(Rol rol) {
        return DTORol.builder()
                .id(rol.getId())
                .description(rol.getDescription())
                .listUser(rol.getListUser().stream()
                        .map(user -> userMapper.toDTOUser(user))
                        .collect(Collectors.toList()))
                .build();
    }
}
