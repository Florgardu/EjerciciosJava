package ejercicio4;

import java.util.Scanner;

public class LectorDeEnteros {

	private Scanner scanner;

	// constructor: Este scanner no puede ser null; si lo es, el constructor debe
	// devolver una excepción del tipo
	// IllegalArgumentException.

	public LectorDeEnteros(Scanner scanner) {
		try {
			setScanner(scanner);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	// int pedir(String mensaje) , que recibe como parámetro el mensaje a mostrar y
	// pide la carga de cualquier número entero, sin validarlo pero asegurándose de
	// que la carga no interrumpa la normal ejecución del programa.

	public int pedir(String mensaje) {

		boolean hayError;
		int numero = -1;

		System.out.println(mensaje);
		do {
			try {
				numero = scanner.nextInt();
				hayError = false;
			} catch (Exception e) {
				// TODO: handle exception
				String caracterError = scanner.next();
				System.out.println("Error, ingreso el valor no numerico " + caracterError
						+ "por favor reingrese un valor numerico");
				hayError = true;
			}

		} while (hayError);
		return numero;

	}

	/*
	 * int pedir(String mensaje, RangoDeEnteros rangoValido) que recibe en mensaje
	 * que se quiere cargar (por ejemplo “Ingrese la nota del alumno”) y luego el
	 * rango numérico con el cual el número ingresado será validado. Debe controlar
	 * que ninguno de los parámetros recibidos sea null (si lo es debe devolver una
	 * excepción) y, en caso de que el mensaje esté vacío, utilizar el mensaje por
	 * defecto. validando que esté dentro de un rango determinado
	 */
	public int pedir(String mensaje, RangoDeEnteros rangoValido) {
		String mensajeDefecto = "Ingrese nota de alumno";
		boolean hayError;
		int numero = -1;

		if (rangoValido == null) {
			throw new IllegalArgumentException("No se puede ingresar valores null");
		}
		if (mensaje == null) {
			System.out.println(mensajeDefecto);
		} else {
			System.out.println(mensaje);
		}
		do {
			try {
				numero = scanner.nextInt();
				hayError = false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, ingreso un valor no numerico ");
				scanner.next();
				hayError = true;
			}
			if (!hayError) {
				if (!rangoValido.incluye(numero)) {
					System.out.println("Error, rango no valido reintente");
					hayError = true;
				}

			}

		} while (hayError);
		return numero;

	} 
	
	
	//int pedir(String mensaje, int limiteA, int limiteB) que recibe un mensaje que
	//indica qué se quiere cargar (por ejemplo “Ingrese la nota de un alumno”) y el
	//rango numérico dentro del cual el número será validado, incluyendo los límites
	//(en este caso 0 y 10). El método debe complementar el mensaje recibido
	//indicando el rango (“ entre A y B” ), donde A es limiteA y B es limiteB.

	
	public int pedir (String mensaje, int limiteA, int limiteB) {
		
		int numero = -1;
		boolean huboError;

		System.out.println(mensaje);
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
				if (numero < limiteA || numero > limiteB) {
					System.out.println("Error, Ingrese un valor numerico entre " + limiteA + " y " + limiteB);
				}
			}

		} while (huboError || (numero < limiteA || numero > limiteB));
		return numero;

	}
		
		

	
	
	
	

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		if (scanner == null) {
			throw new IllegalArgumentException("El scanner no puede ser null");
		}
		this.scanner = scanner;

	}

}
