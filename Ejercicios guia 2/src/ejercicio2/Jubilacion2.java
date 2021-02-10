package ejercicio2;

import java.util.Scanner;

public class Jubilacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edadIngresada;
		String generoIngresado;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese edad");
		edadIngresada = scan.nextInt();

		if (edadIngresada >= 1 && edadIngresada <= 120) {
			System.out.println("Ingrese genero");
			generoIngresado = scan.next();

			{
				if (("F".equalsIgnoreCase(generoIngresado) && edadIngresada >= 60)
						|| ("M".equalsIgnoreCase(generoIngresado) && edadIngresada >= 65)) {
					System.out.println("Se puede jubilar");

				} else if ("F".equalsIgnoreCase(generoIngresado) || "M".equalsIgnoreCase(generoIngresado)) {
					System.out.println("no se puede jubilar");

				} else {
					System.out.println("ingresoinvalido");
				}

			}

		} else {
			System.out.println("Rango edad no valido");

		}

	}
}
