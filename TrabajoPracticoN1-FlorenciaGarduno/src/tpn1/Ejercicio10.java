package tpn1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizá un programa que resuelva el siguiente problema: Nos piden
		 * desarrollar un programa que informe si un estacionamiento se encuentra o no
		 * abierto según la hora ingresada por el usuario. Nosotros sabemos que el
		 * estacionamiento se encuentra abierto entre las 10 y las 18hs. (Crear
		 * constante HORA_APERTURA = 10, y HORA_CIERRE = 18). Al iniciar el programa, se
		 * le pedirá al usuario que ingrese la hora, y deberemos setear una variable
		 * booleana llamada estaAbierto en true o false, según corresponda, e informar
		 * por pantalla mediante la misma si el estacionamiento se encuentra abierto o
		 * no. Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a
		 * 24, mostrar el mensaje: “Ha ingresado una hora incorrecta”
		 */
		Scanner scan = new Scanner(System.in);
		final int HORA_APERTURA = 10;
		final int HORA_CIERRE = 18;
		int horaIngresada;
		boolean estaAbierto;

		System.out.println("Ingrese hora");
		horaIngresada = scan.nextInt();

		if (horaIngresada < 0 || horaIngresada > 24) {
			System.out.println("Ha ingresado hora incorrecta");

		} else {
			if (horaIngresada >= HORA_APERTURA && horaIngresada <= HORA_CIERRE) {
				estaAbierto=true;

			} else { 
				estaAbierto=false;

			}
			
			System.out.println("esta abierto:" + estaAbierto);
		}
		
		scan.close();

	} 


}
