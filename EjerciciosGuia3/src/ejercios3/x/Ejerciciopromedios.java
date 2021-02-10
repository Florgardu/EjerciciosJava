package ejercios3.x;
import java.util.Scanner;

public class Ejerciciopromedios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Desarrollar un algoritmo que permita ingresar un número N. 
		 * Acto seguido, permitir ingresar N números enteros, correspondientes a las
		 *  notas de un curso. La computadora muestra el promedio de las notas ingresadas.
		 Ejemplo: Se ingresa 4, luego 4 7 3 9, la computadora muestra: 5.75.
		 */
		Scanner scan = new Scanner(System.in);
		int cantMaterias;
		int cont;
		cont = 1; 
		int notas; 
		double promedio=0;
		int sumatoria;
		sumatoria=0;
		
		System.out.println("Ingrese cantidad de notas");
		cantMaterias= scan.nextInt();
		
		while (cont<=cantMaterias) {
			System.out.println("Ingrese nota");
			notas=scan.nextInt();
			sumatoria=sumatoria+notas;  //es sumatoria=sumatoria+notas porque tengo q sumarle una nota a la sumatoria que ya se esta guardando.
			cont++;
			
			
		} 
		promedio=sumatoria/cantMaterias;
		System.out.println("tu promedio es " + promedio );
		
		
		
		
		
		
	}

}
