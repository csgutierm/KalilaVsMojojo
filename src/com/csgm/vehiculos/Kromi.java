package com.csgm.vehiculos;

import java.time.LocalDateTime;

public class Kromi  extends Carro {
	

	private int anioFabricacion;
	private String marca;

	public Kromi(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso, int anioFabricacion,
			String marca) {
		super(fila, columna, cantidadOcupantes, fechaIngreso);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}

	public Kromi() {
		super();
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}
	
	

}
