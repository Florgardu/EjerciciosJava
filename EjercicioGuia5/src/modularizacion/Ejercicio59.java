package modularizacion;

import java.util.Scanner;

public class Ejercicio59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5.9 Una casa de artículos para el hogar ofrece a sus clientes diferentes
		 * planes de pago. Desarrollar un algoritmo que permita ingresar un valor y que
		 * se visualice de manera clara cómo queda el pago según las condiciones de
		 * cada plan: o Plan 1: 100% al contado. Se hace el 10% de descuento sobre el
		 * precio publicado. 11 o Plan 2: 50% al contado y el resto en 2 cuotas iguales.
		 * El precio publicado se incrementa en un 10%. o Plan 3: 25% al contado y el
		 * resto en 5 cuotas iguales. El precio publicado se incrementa en un 15%. o
		 * Plan 4: Totalmente financiado en 8 cuotas. El precio publicado se incrementa
		 * en un 25%.
		 */
		double precio = obtenerPrecioProducto("Ingrese precio producto");
		boolean esValido = validarPrecio(precio);
		
		while (!esValido) {
			 precio = obtenerPrecioProducto("Ingrese precio producto");
		     esValido = validarPrecio(precio);
			
		}
			System.out.println(mostrarPlan1(precio));
			System.out.println(mostrarPlan2(precio)); 
		}
			

		

	

	public static String mostrarPlan1(double valorProducto) {
		/*
		 * 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
		 */
		double precio;
		precio = valorProducto - (valorProducto * 0.10);
		return "Pagando 100% al contado el precio es " + precio;
	}

	public static String mostrarPlan2(double valorProducto) {
		/*
		 * 50% al contado y el resto en 2 cuotas iguales. El precio publicado se
		 * incrementa en un 10%.
		 */
		double precio;
		precio = valorProducto + (valorProducto * 0.10);
		String msg = "Pagando 50% al contado y el resto en 2 cuotas de " + precio / 2 + " el precio final es " + precio;
		return msg;
	}
	
	public static int obtenerPrecioProducto(String texto) {
		int precio; 
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		precio= scan.nextInt();
		return precio;
	}
	
	
	public static boolean validarPrecio(double precio) {
		boolean esValido=false;
		if (precio>0) {
			esValido=true;
		}
		else {
			esValido=false;
		}
		return esValido; 
	
	}
	
	
	}
	
