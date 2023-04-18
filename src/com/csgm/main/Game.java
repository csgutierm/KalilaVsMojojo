package com.csgm.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.csgm.elementos.Tablero;
import com.csgm.vehiculos.Caguano;
import com.csgm.vehiculos.Carro;
import com.csgm.vehiculos.Kromi;
import com.csgm.vehiculos.Trupalla;

//the game 
public class Game {

	static Tablero tablero = new Tablero();
	 // Create 2-dimensional array.
	static String[][] matriz = new String[15][15];
	static int upperbound = 15;
	
	public static void main(String[] args) {

		// Instance of random class
		Random rand = new Random();

		// Generating random values from 0 - 14
		// using nextInt()
//	      int int_random = rand.nextInt(upperbound); 

		inicializarMatriz(matriz);
		
		int fila = 0;
		int columna = 0;
		boolean exitosoPosicionamiento = false;
		
		List<Carro> carro = new ArrayList<Carro>();
		
		// 3 Kromis
		for (int i = 0; i < 3; i++) {

			
			do {
				
				fila = rand.nextInt(upperbound);
				columna = rand.nextInt(upperbound);	
				
				exitosoPosicionamiento = validar("kromi", fila, columna);
				
			} while (!exitosoPosicionamiento);
			
			//(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso, int anioFabricacion, String marca)
			Kromi kromi = new Kromi();
			kromi.setAnioFabricacion(2000 + i);
			kromi.setCantidadOcupantes(i*3);
			kromi.setColumna(columna);
			//(int year, int month, int dayOfMonth, int hour, int minute)
			kromi.setFechaIngreso(LocalDateTime.of(2023-i, 12-i, 1, 12, 55));
			kromi.setFila(fila);
			kromi.setInstitucion("Matadero Palma");
			kromi.setMarca("Reyes del asfalto");
			
			carro.add(kromi);

//			System.out.println(carro.size());
//			System.out.println(carro);
//			tablero.crearCarro(kromi,fila,columna);			
//			System.out.println("Kromi en posición: " + fila + "," + columna);
		}
		
		// 5 Caguanos
		for (int i = 0; i < 5; i++) {

			
			do {
				
				fila = rand.nextInt(upperbound);
				columna = rand.nextInt(upperbound);
				exitosoPosicionamiento = validar("caguano", fila, columna);
				
			} while (!exitosoPosicionamiento);
			

			
			
			//(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso, int alcanceTiro, String colorConfeti)
			Caguano caguano = new Caguano();
			caguano.setAlcanceTiro(i+3);
			caguano.setCantidadOcupantes(i*2);
			caguano.setColumna(columna);
			//(int year, int month, int dayOfMonth, int hour, int minute)
			caguano.setFechaIngreso(LocalDateTime.of(2023-i, 12-i, 1, 12, 55));
			caguano.setFila(fila);
			caguano.setInstitucion("Matadero Palma");
			caguano.setColorConfeti("Rojo");
			
			carro.add(caguano);

//			System.out.println(carro.size());
//			System.out.println(carro);
//			tablero.crearCarro(kromi,fila,columna);			
//			System.out.println("Caguano en posición: " + fila + "," + columna);
		}
		
		// 10 Trupallas
		for (int i = 0; i < 10; i++) {

			
			do {
				
				fila = rand.nextInt(upperbound);
				columna = rand.nextInt(upperbound);
				
				exitosoPosicionamiento = validar("trupalla", fila, columna);
				
			} while (!exitosoPosicionamiento);
			
			
			//(int fila, int columna, int cantidadOcupantes, LocalDateTime fechaIngreso, int nivelArmadura, String conductor)
			Trupalla trupalla = new Trupalla();
			trupalla.setNivelArmadura(1 + rand.nextInt(4));
			trupalla.setCantidadOcupantes(i*2);
			trupalla.setColumna(columna);
			//(int year, int month, int dayOfMonth, int hour, int minute)
			trupalla.setFechaIngreso(LocalDateTime.of(2023-i, 12-i, 1, 12, 55));
			trupalla.setFila(fila);
			trupalla.setInstitucion("Matadero Palma");
			trupalla.setConductor("Teniente " + i + "°");
			
			carro.add(trupalla);

//			System.out.println(carro.size());
//			System.out.println(carro);
//			tablero.crearCarro(kromi,fila,columna);			
//			System.out.println("Trupalla en posición: " + fila + "," + columna);
		}

		for (int i = 0; i < upperbound; i++) {
			for (int j = 0; j < upperbound; j++) {

				System.out.print(matriz[i][j]);

			}
			System.out.println("");

		}

	}

	private static void inicializarMatriz(String[][] matriz2) {
		for (int i = 0; i < upperbound; i++) {
			for (int j = 0; j < upperbound; j++) {
				matriz[i][j] = " * ";
			}
		}
		
	}

	//retorno true si el proceso es exitoso, si no lo es retorna false
	private static boolean validar(String string, int fila, int columna) {
		
		if(string == "trupalla" && matriz[fila][columna] == " * ") {
		matriz[fila][columna] = " T ";
		return true;
		}
		
		if(string == "caguano" && columna < 14 && matriz[fila][columna] == " * " && matriz[fila][columna+1] == " * ") {
		matriz[fila][columna] = " C ";
		matriz[fila][columna+1] = " C ";
		return true;
		}
		
		if(string == "kromi" && fila < 13 && matriz[fila][columna] == " * " && matriz[fila+1][columna] == " * " && matriz[fila+2][columna] == " * ") {
		matriz[fila][columna] = " K ";
		matriz[fila+1][columna] = " K ";
		matriz[fila+2][columna] = " K ";
		return true;
		}
		
		//T trupalla
		//C caguano
		//K kromi
		return false;
	}

	

}
