package test;

import java.util.Scanner;

import clases.Gym;
import clases.Socio;

public class Test3 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Gym miGym = new Gym ("megatlon");
		
	 ingresoSocios (miGym); 

	}

	public static void ingresoSocios(Gym gim) {
		String dni = "";
		String nombre = "";
		String VALOR_CORTE = "0";
		Socio socio;

		dni = leerTexto("Ingrese un dni o cero para salir");

		while (!dni.equals(VALOR_CORTE)) {

			nombre = leerTexto("Ingrese nombre del socio");
			socio = gim.inscribirSocio(dni, nombre);
			dni = leerTexto("Ingrese un dni o cero para salir");
		}
		
	}
	
	
	public static String leerTexto (String texto) {
		String datoLeido; 
		
		System.out.println(texto);
		datoLeido=scan.next();
		return datoLeido;
		
	}
	
}
