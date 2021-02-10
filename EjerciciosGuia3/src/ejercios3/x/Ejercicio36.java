package ejercios3.x;
import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	Desarrollar un algoritmo que permita ingresar un número natural. La
		computadora muestra el factorial del número.
		Ejemplo: Se ingresa 5, la computadora muestra: 120.
		*/
		
		
		int numIngresado;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero");
		numIngresado=scan.nextInt();
		int contador=1;
		int factorial;
		factorial=1;
		
		while (contador<=numIngresado) {
			factorial=factorial*contador;
			contador++;
			
		}
		System.out.println(factorial);
		scan.close(); 

	}

}
