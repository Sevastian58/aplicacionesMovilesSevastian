package com.cibertec.aplicacionesmovilesiiantony.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String dni;
    private String login;
    private String sexo;

    @ManyToOne
    @JoinColumn(name="rol_id")
    private Rol rol;

}