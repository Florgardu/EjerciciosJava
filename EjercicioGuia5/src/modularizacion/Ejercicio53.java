package modularizacion;
import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		Definir la función obtenerResto, que devuelva (sin usar el operador %) el resto
del cociente entre dos números enteros recibidos como parámetros.
Ejemplo: Se invoca obtenerResto(12,5) → devuelve 2.
*/
		
		Scanner scan = new Scanner(System.in);
		int n;
		int n2;
		System.out.println("Ingrese un numero");
		n=scan.nextInt();
		System.out.println("Ingrese otro numero");
		n2=scan.nextInt();
		System.out.println(obtenerResto(n,n2));
		
		scan.close();
	}

	public static int obtenerResto (int n, int n2) {
		int resto;
		resto= n-(n/n2)*n2;
		return resto; 
	
		
	}
	
	
	
}
