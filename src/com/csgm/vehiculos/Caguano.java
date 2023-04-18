package com.csgm.vehiculos;

import java.time.LocalDateTime;

public class Caguano extends Carro {
	
	private int alcanceTiro;
	private String colorConfeti;
	
	
	public Caguano() {
		super();
	}
	
	public Caguano(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso, int alcanceTiro,
			String colorConfeti) {
		super(fila, columna, cantidadOcupantes, fechaIngreso);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	public int getAlcanceTiro() {
		return alcanceTiro;
	}
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}
	public String getColorConfeti() {
		return colorConfeti;
	}
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	

}
