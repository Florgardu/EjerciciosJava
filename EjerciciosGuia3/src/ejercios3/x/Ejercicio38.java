package ejercios3.x;
import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Desarrollar un algoritmo que, dado un número N, la computadora muestra 
		 * los primeros N términos de la sucesión de Fibonacci.
		 Ejemplo: Se ingresa 10, la computadora muestra: 0 1 1 2 3 5 8 13 21 34.
		*/
		
		Scanner scan = new Scanner(System.in);
		int cantidadDeNum;
		System.out.println("Ingrese cantidad de numero de la sucesión de Fibonacci");
		cantidadDeNum= scan.nextInt();
		int contador=1;
		int n1=0;
		int n2=1; 
		int n3;
		
		System.out.println(n1);
		System.out.println(n2);
		while (contador<(cantidadDeNum-2)) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			contador++;
			System.out.println(n3);
			
		}
		
		scan.close();
	
		
	}

}
