package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int numero = 0;
		try {
		   System.out.println("El numero vale " + numero);
		   System.out.print("Ingrese un número: ");
		   numero = scanner.nextInt();
		} catch (InputMismatchException e) {
		   System.out.println("Hubo un error en la carga del numero, no debe ingresar un string");
		} finally {
		   System.out.println("El numero ahora vale " + numero);
		
		}
		
		scanner.close();
		
	}
			
		
		
	}

