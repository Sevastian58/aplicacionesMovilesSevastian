package com.cibertec.aplicacionesmovilesiiantony.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private String  nombre;
    private String apellido;
    private int telefono;
    private String dni;
    private int librosCreados;
    private String direccion;
    private String sexo;
    private String nacionalidad;
}
