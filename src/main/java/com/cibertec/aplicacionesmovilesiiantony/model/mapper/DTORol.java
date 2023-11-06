package com.cibertec.aplicacionesmovilesiiantony.model.mapper;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

import java.util.List;

@Builder
public record DTORol(
        @NotBlank Long id,
        @NotBlank String description,
        @NotBlank List<DTOUser> listUser
) {
}
