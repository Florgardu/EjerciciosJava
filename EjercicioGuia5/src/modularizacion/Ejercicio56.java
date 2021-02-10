package modularizacion;

import java.util.Scanner;

public class Ejercicio56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir la función esVocal, que devuelva true o false según si un caracter
		 * recibido como parámetro es vocal (contemplar mayúsculas y minúsculas).
		 * Ejemplo:SeinvocaesVocal('a')→devuelvetrue.
		 */
    
	String letraIngresadaPorUsuario;
	letraIngresadaPorUsuario=ingresoCaracter ("Ingrese una letra");
	
	System.out.println(esVocal(letraIngresadaPorUsuario));
	
	
    boolean esVocal=true; 
    esVocal=esVocal(letraIngresadaPorUsuario);

	if (esVocal) {
		System.out.println("Es vocal");
	}
	else {
		System.out.println("no es vocal");
	}
	
	
	}
		
		
	

	public static boolean esVocal(String letraIngresada) {
		boolean esVocal = true;
		
			
		switch (letraIngresada.toUpperCase()){ 
		case "A":
			esVocal=true;
			break;
			
		case "E":
			esVocal=true;
			break;
			
		case "I":
			esVocal=true;
			break;
		case "O":
			esVocal=true;
			break;
		case "U":
			esVocal=true;
			break;
		
		default: 
			esVocal=false;
			break; 
		

		
	}
		return esVocal;
}
	
	public static String ingresoCaracter (String texto) {
		String caracter;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		caracter=scan.next();
		return caracter; 
		
	}
	
	
	
	
}
