package com.csgm.elementos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.csgm.armas.Huevo;
import com.csgm.vehiculos.Carro;

//tablero 15x15
public class Tablero {
	
	//limite de 18 para carros
	private List<Carro> carro;
	private List<Huevo> huevo;
	private String[][] matriz;
	
	public Tablero(List<Carro> carro, List<Huevo> huevo) {
		super();
		this.carro = carro;
		this.huevo = huevo;
	}

	public Tablero() {
		super();
	}

	public List<Carro> getCarro() {
		return carro;
	}


	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}


	public List<Huevo> getHuevo() {
		return huevo;
	}


	public void setHuevo(List<Huevo> huevo) {
		this.huevo = huevo;
	}

	

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

	public boolean crearCarro (Carro carro, int fila, int columna ) {
		//check si es posible crear el carro en ese lugar
		carro.setFila(fila);
		carro.setColumna(columna);
		carro.setFechaIngreso(LocalDateTime.now());
		carro.setInstitucion("Test");
		carro.setCantidadOcupantes(5);
		
		System.out.println("Creando en tiempo: " + carro.getFechaIngreso().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS")));
		
		return true;
	}
	
	public void lanzarHuevo () {
		
	}
	
	public void mostrarMatriz () {

	}
	
//	private void calcularPuntaje () {
//		
//	}
}
