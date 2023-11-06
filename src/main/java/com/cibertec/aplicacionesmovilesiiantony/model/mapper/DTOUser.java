package com.cibertec.aplicacionesmovilesiiantony.model.mapper;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

import java.util.List;

@Builder
public record DTOUser(
        @NotBlank Long id,
        @NotBlank String name,
        @NotBlank String last_name,
        @NotBlank String email,
        @NotBlank String password
       // @NotBlank List<DTORegisterProperty> property
        ) {

}
