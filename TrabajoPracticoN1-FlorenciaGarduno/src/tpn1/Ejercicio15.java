package tpn1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Existen dos reglas que identifican dos conjuntos de valores: - El número es
		 * de un solo dígito. - El número es impar. A partir de estas reglas, creá un
		 * algoritmo que asigne a las variables booleanas estaEnA, estaEnB, estaEnAmbos
		 * y noEstaEnNinguno el valor verdadero o falso, según corresponda, para
		 * indicar si el valor ingresado pertenece al primer conjunto, al segundo, a
		 * ambos o a ninguno, respectivamente. Definí un lote de prueba de varios
		 * números y probá el algoritmo, escribiendo los resultados.
		 */

		Scanner scan = new Scanner(System.in);
		int numIngresado;
		boolean estaEnA;
		boolean estaEnB;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;

		System.out.println("Ingrese un numero");
		numIngresado = scan.nextInt();

		if (numIngresado >= 0 && numIngresado <= 9) {
			estaEnA = true;

		} else {
			estaEnA = false;

		}
		
		if (numIngresado%2==0) {
			estaEnB=false;
		} else {
			estaEnB=true;
			
		}
		
		if (estaEnA && estaEnB ) {
			estaEnAmbos=true;
			
		} else { 
			estaEnAmbos=false;
			
		}
		
		if (!estaEnA && !estaEnB) {
			noEstaEnNinguno=true;
		}else { 
			noEstaEnNinguno=false; 
			
		}
		
		System.out.println("El valor ingresado "+ " Esta en grupo A: " + estaEnA + " Es esta grupo B: " + estaEnB + " Esta en ambos: " +  estaEnAmbos + " No esta en ninguno: " + noEstaEnNinguno);
		scan.close();
	}

}
