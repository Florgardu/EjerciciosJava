package tpn1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Suponiendo que el primer día de la semana es el Domingo, pedir un número
		 * entre 1 y 7 (inclusive) y mostrar el nombre del día correspondiente. Si el
		 * día no está en el rango permitido debe emitir por pantalla el mensaje de
		 * error "El día ingresado no es válido".
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		final int domingo = 1;
		final int lunes = 2;
		final int martes = 3;
		final int miercoles = 4;
		final int jueves = 5;
		final int viernes = 6;
		final int sabado = 7;
		int numeroIngresado;
		System.out.println("Ingrese un numero y le dire que día de la semana es");
		numeroIngresado = scan.nextInt();

		if (numeroIngresado > 7 || numeroIngresado < 1) {
			System.out.println("El día ingresado no es valido");

		} else {
			if (numeroIngresado == domingo) {
				System.out.println("Es domingo");

			} else {
				if (numeroIngresado == lunes) {
					System.out.println("Es lunes");

				} else {
					if (numeroIngresado == martes) {
						System.out.println("Es martes");

					} else {
						if (numeroIngresado == miercoles) {
							System.out.println("Es miercoles");

						} else {
							if (numeroIngresado == jueves) {
								System.out.println("Es jueves");

							}else {
								if (numeroIngresado==viernes) {
									System.out.println("Es viernes");
									
								} else {
									if (numeroIngresado==sabado) {
										System.out.println("Es sabado");
										
									}

								}

							}
							
						}
					}
				}
			}

		}
		scan.close();


	}

}
