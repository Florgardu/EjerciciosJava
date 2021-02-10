package ejercicio5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		LectorDeEnteros lector = new LectorDeEnteros(input);
		Alumno alu = null;
		int dni, anioNacimiento = 0;
		String nombreCompleto;

		while (alu==null) {
			// Pido DNI
			int nrodni= lector.pedir("Ingrese el dni que sera el legajo del alumno");
			
			// nombre completo
			
			nombreCompleto= "Florencia Garduño";
			
			// Pido año de nacimiento
			
			int nacimiento= lector.pedir("Ingrese anio nacimiento");

			try {
			alu= new Alumno(nombreCompleto, nacimiento, nrodni);
		
			} catch (IllegalArgumentException e) {
	               System.out.println("Hubo un error en la carga " + e.getMessage());
			}
		}
		input.close();
		System.out.println(alu.toString());
	}
		
		
		
		
	}


