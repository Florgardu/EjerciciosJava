package ejercicioclase3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int numeroIngresado;
		System.out.println("Ingrese un numero, le dire que día de la semana es");
		numeroIngresado = scan.nextInt();
		final int DOMINGO=1;
		final int LUNES=2;
		final int MARTES=2;
		final int MIERCOLES=3;
		final int JUEVES=4;
		final int VIERNES=5;
		final int SABADO=6;
		

		if (numeroIngresado == DOMINGO) {
			System.out.println("Es domingo");

			//tambien se puede escribir así
		} else if (numeroIngresado == LUNES)
          {System.out.println("Es lunes");

				
			}

			else {

				if (numeroIngresado == MARTES) {
					System.out.println("Es martes");

				}

				else {

					if (numeroIngresado == MIERCOLES) {
						System.out.println("Es miercoles");

					}

					else {
						if (numeroIngresado == JUEVES) {
							System.out.println("Es jueves");

						} else {
							if (numeroIngresado == VIERNES) {
								System.out.println("Sos viernes");

							} else {
								if (numeroIngresado == SABADO) {
									System.out.println("Es sabado");
									
									// se puede usar elfe if

								}

							}

						}
					}

				}
			}

		}

	}

