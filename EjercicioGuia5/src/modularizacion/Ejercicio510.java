package modularizacion;

import java.util.Scanner;

public class Ejercicio510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrollar un algoritmo que, dado un número entero de entre 2 y 4 dígitos,
		 * la computadora indique si es capicúa. Ayuda: Recibir como parámetro un
		 * entero, averiguar cuántas cifras tiene, luego extraer cada cifra usando
		 * descomposición matemática y hacer las respectivas comparaciones. Ejemplo:
		 * Ingresa 1881, debe imprimir "Es capicúa".
		 */

		int numeroIngresado;
		int cantidadDeDigitos;
		boolean esCapicua;
		boolean numeroEsValido;

		numeroIngresado = obtenerNumeroIngresado("Ingrese un numero de 2 a 4 digitos");
		numeroEsValido = validarNumero(numeroIngresado);

		while (!numeroEsValido) {
			numeroIngresado = obtenerNumeroIngresado("Error, ingrese un numero de 2 a 4 digitos");
			numeroEsValido = validarNumero(numeroIngresado);
		}

		cantidadDeDigitos = cantidadDeDigitos(numeroIngresado);

		esCapicua = esCapicua(numeroIngresado, cantidadDeDigitos);

		if (esCapicua) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

	}

	private static boolean esCapicua(int numeroIngresado, int cantidadDeDigitos) {
		boolean esCapicua = false;
		if (cantidadDeDigitos == 2) {
			if (getValueAtPosition(numeroIngresado, 1) == getValueAtPosition(numeroIngresado, 2)) {
				esCapicua = true;
			}
		} else if (cantidadDeDigitos == 3) {
			if (getValueAtPosition(numeroIngresado, 1) == getValueAtPosition(numeroIngresado, 3)) {
				esCapicua = true;
			}
		} else if (cantidadDeDigitos == 4) {
			if (getValueAtPosition(numeroIngresado, 1) == getValueAtPosition(numeroIngresado, 4)
					&& getValueAtPosition(numeroIngresado, 2) == getValueAtPosition(numeroIngresado, 3)) {
				esCapicua = true;
			}
		} else {
			System.out.println("Error");
		}
		

		return esCapicua;

	}

	public static int obtenerNumeroIngresado(String texto) {
		int valor;
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		valor = scan.nextInt();
		scan.close();
		return valor;
	}

	public static boolean validarNumero(int numero) {
		boolean esValido = false;
		if (numero > 10 && numero < 10000) {
			esValido = true;
		}
		return esValido;
	}

	public static int getValueAtPosition(int number, int position) {
		String numberAsString = String.valueOf(number);
		String[] digits = numberAsString.split("(?<=.)");
		return Integer.valueOf(digits[position - 1]);
	}

	public static int cantidadDeDigitos(int numeroIngresado) {

		String numberAsString = String.valueOf(numeroIngresado);
		return numberAsString.length();

	}
	
	
}
