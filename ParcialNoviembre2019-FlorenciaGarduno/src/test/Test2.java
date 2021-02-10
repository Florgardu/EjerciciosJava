package test;

import java.util.Scanner;
import clases.Instalador;
import clases.InstaladorPremium;

public class Test2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Instalador miInstalador= new InstaladorPremium(150);
		
		String datoIngresado= menuIngreso();
		
		while (!datoIngresado.equalsIgnoreCase("S")) {
			
			switch (datoIngresado.toUpperCase()) {
			case "A":
				instalar(miInstalador);
				datoIngresado= menuIngreso();
				break;
				
			case "I":
				pedirMemoria(miInstalador);
				datoIngresado= menuIngreso();
				break;

			default:
				System.out.println("Ingreso incorrecto");
				datoIngresado= menuIngreso();
				break;
			}
			
		}
	}
	

	public static void instalar(Instalador miInstalador) {
		String nombre;
		int tamanioMb;
		String fecha;
		
		// esto es para que tambien me tome el espacio en blanco en la fecha
		scan.useDelimiter(System.lineSeparator());
		
		nombre = leerTexto("Ingrese nombre de la app");

		tamanioMb = leerInt("Ingrese tamaño de la app");

		System.out.println("Por favor ingrese fecha");
		fecha = scan.next();

		miInstalador.instalar(nombre, tamanioMb, fecha);

	}
			
		
		
	public static void pedirMemoria (Instalador miInstaldor) {
		System.out.println("La memoria disponible es " + miInstaldor.getMemoriaDisponible());
		
	}


	public static String menuIngreso (){
		String dato;
		dato= leerTexto("Ingrese a para actualizar o instalar app, I para imprimir memoria o S para salir");
		return dato;
	}

	
	public static String leerTexto (String texto) {
		String dato; 
		System.out.println(texto);
		dato=scan.next();
		return dato;
		
	}
	
public static int leerInt (String texto) {
		int dato; 
		System.out.println(texto);
		dato=scan.nextInt();
		return dato; 
	}
	
	
}