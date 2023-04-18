package com.csgm.armas;

public class Huevo {
	
	private int proyectilColumna;
	private int proyectilFila;
	private int puntaje;
	
	public Huevo(int proyectilColumna, int proyectilFila, int puntaje) {
		super();
		this.proyectilColumna = proyectilColumna;
		this.proyectilFila = proyectilFila;
		this.puntaje = puntaje;
	}
	public int getProyectilColumna() {
		return proyectilColumna;
	}
	public void setProyectilColumna(int proyectilColumna) {
		this.proyectilColumna = proyectilColumna;
	}
	public int getProyectilFila() {
		return proyectilFila;
	}
	public void setProyectilFila(int proyectilFila) {
		this.proyectilFila = proyectilFila;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	@Override
	public String toString() {
		return "Huevo [proyectilColumna=" + proyectilColumna + ", proyectilFila=" + proyectilFila + ", puntaje="
				+ puntaje + "]";
	}

	
}
