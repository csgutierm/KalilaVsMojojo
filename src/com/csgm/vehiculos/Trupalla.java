package com.csgm.vehiculos;

import java.time.LocalDateTime;

public class Trupalla  extends Carro {

	//entre 1 y 5
	private int nivelArmadura;
	private String conductor;
	
	public Trupalla(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso, int nivelArmadura,
			String conductor) {
		super(fila, columna, cantidadOcupantes, fechaIngreso);
		this.nivelArmadura = nivelArmadura;
		this.conductor = conductor;
	}
	public Trupalla() {
		super();
	}
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", conductor=" + conductor + "]";
	}
	
	
}
