package com.cibertec.aplicacionesmovilesiiantony.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "prestamo_tiene_libro")
public class PrestamoHasLibro {

	
	@EmbeddedId
	private PrestamoHasLibroPK prestamoHasLibroPK;

	@ManyToOne
	@JoinColumn(name = "idPrestamo", nullable = false, insertable = false, updatable = false)
	private Prestamo prestamo;
	
	@ManyToOne
	@JoinColumn(name = "idLibro", nullable = false, insertable = false, updatable = false)
	private Libro libro;



	public PrestamoHasLibroPK getPrestamoHasLibroPK() {
		return prestamoHasLibroPK;
	}

	public void setPrestamoHasLibroPK(PrestamoHasLibroPK prestamoHasLibroPK) {
		this.prestamoHasLibroPK = prestamoHasLibroPK;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}
