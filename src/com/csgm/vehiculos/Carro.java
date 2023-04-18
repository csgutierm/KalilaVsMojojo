package com.csgm.vehiculos;

import java.time.LocalDateTime;

public class Carro {

	private int fila;
	private int columna;
	private int cantidadOcupantes;
	private LocalDateTime fechaIngreso;
	private String institucion;
	
	public Carro(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
	}
	
	
	public Carro() {
		super();
	}

	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}
	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	@Override
	public String toString() {
		return "Carro [fila=" + fila + ", columna=" + columna + ", cantidadOcupantes=" + cantidadOcupantes
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
}
