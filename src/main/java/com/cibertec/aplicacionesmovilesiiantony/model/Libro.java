package com.cibertec.aplicacionesmovilesiiantony.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precio;
    private String fecha;
    private String genero;
}
