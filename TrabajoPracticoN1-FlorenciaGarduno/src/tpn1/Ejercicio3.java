package tpn1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Realizá un programa que pida al 
		 usuario ingresar su nombre. Escribí un mensaje de bienvenida 
		 que incluya el nombre ingresado.
		
		 */
		
		Scanner scan = new Scanner(System.in);
		String nombre;
		System.out.println("Ingrese su nombre");
		nombre= scan.next();
		System.out.println("Bienvenido "+ nombre);
				
		scan.close();

	}

}
