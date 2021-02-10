package ejercicio3;

import java.util.Scanner;

public class MainMejorado {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		numero = pedirNumeroEntero("Por favor ingrese un número", 0, 100);
		System.out.println("El numero ingresado es " + numero);

	}

	private static int pedirNumeroEntero(String texto, int min, int max) {
		int numero = -1;
		boolean huboError;

		System.out.println(texto);
		do {
			huboError=false;
			try {
				numero = scanner.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, ingrese un valor numerico");
				scanner.next();
				huboError = true;
			}

			if (!huboError) {
				if (numero < min || numero > max) {
					System.out.println("Error, Ingrese un valor numerico entre " + min + " y " + max);
				}
			}

		} while (huboError || (numero < min || numero > max));
		return numero;

	}

}
