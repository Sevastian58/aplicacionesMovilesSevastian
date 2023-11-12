package com.cibertec.aplicacionesmovilesiiantony.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "editorial")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private String direccion;
    private int cantidad;
    private int numero;
    private String pais;
}
