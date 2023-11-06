package com.cibertec.aplicacionesmovilesiiantony.model.mapper;

import com.cibertec.aplicacionesmovilesiiantony.model.User;

import java.util.stream.Collectors;

public class UserMapperImpl implements UserMapper{
    @Override
    public User toEntityUser(DTOUser dtoUser) {
        return User.builder()
                .id(dtoUser.id())
                .name(dtoUser.name())
                .last_name(dtoUser.last_name())
                .email(dtoUser.email())
                .password(dtoUser.password())
                .build();
    }

    @Override
    public DTOUser toDTOUser(User user) {
        return DTOUser.builder()
                .id(user.getId())
                .name(user.getName())
                .last_name(user.getLast_name())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
