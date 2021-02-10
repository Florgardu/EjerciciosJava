package modularizacion;

import java.util.Scanner;

public class Esprimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIngresado = leerNumero("Ingrese un número y le dire si es primo o no");
		boolean esValido = validarNumero(numeroIngresado);
		while (!esValido) {
			numeroIngresado = leerNumero("Numero incorrecto. Ingrese un número y le dire si es primo o no");
			esValido = validarNumero(numeroIngresado);
		}

		boolean esPrimo=true;
		esPrimo= calcularPrimo(numeroIngresado);
		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("no es primo");
		}

	}

	public static int leerNumero(String texto) {
		int valor;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		valor = scan.nextInt();
		return valor;
	}

	public static boolean validarNumero(int numeroIngresado) {
		return numeroIngresado > 1;
	}

	public static boolean calcularPrimo(int numeroIngresado) {
		boolean esPrimo = true;
		int contador = 2;
		while (contador < numeroIngresado && esPrimo) {
			if (numeroIngresado % contador == 0) {
				esPrimo = false;
			}
			contador++;
		}
		return esPrimo;

	}

}
