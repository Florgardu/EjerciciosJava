package tpn1;

import java.util.Scanner;

public class Ejercicio15otraforma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numIngresado;
		boolean estaEnA;
		boolean estaEnB;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;

		System.out.println("Ingrese un numero");
		numIngresado = scan.nextInt();

		estaEnA = (numIngresado >= 0 && numIngresado <= 9);
		estaEnB = !(numIngresado%2==0);
		estaEnAmbos = (estaEnA && estaEnB );
		noEstaEnNinguno = (!estaEnA && !estaEnB);
		
		System.out.println("Esta en grupo A: " + estaEnA);
		System.out.println("Es esta grupo B: " + estaEnB);
		System.out.println("Esta en ambos: " +  estaEnAmbos);
		System.out.println("No esta en ninguno: " + noEstaEnNinguno);
		
		scan.close();
	}

}
