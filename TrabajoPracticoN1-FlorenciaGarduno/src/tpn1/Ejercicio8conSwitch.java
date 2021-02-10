package tpn1;

import java.util.Scanner;

public class Ejercicio8conSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final int DOMINGO = 1;
		final int LUNES = 2;
		final int MARTES = 3;
		final int MIERCOLES = 4;
		final int JUEVES = 5;
		final int VIERNES = 6;
		final int SABADO = 7;
		int numeroIngresado;
		System.out.println("Ingrese un numero y le dire que día de la semana es");
		numeroIngresado = scan.nextInt();

		if (numeroIngresado > 7 || numeroIngresado < 1) {
			System.out.println("El día ingresado no es valido");
		} else {

			switch (numeroIngresado) {
			case DOMINGO:
				System.out.println("Domingo");
				break;

			case LUNES:
				System.out.println("Lunes");
				break;

			case MARTES:
				System.out.println("Martes");
				break;

			case MIERCOLES:
				System.out.println("Miercoles");
				break;

			case JUEVES:
				System.out.println("Jueves");
				break;

			case VIERNES:
				System.out.println("Viernes");
				break;

			case SABADO:
				System.out.println("Sabado");
				break;

			}

		}
		scan.close();

	}

}
