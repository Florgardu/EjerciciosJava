package ejercicio2;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidadAlumnos;
		int cantidadSillas;
		int sillasFaltantes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de alumnos");
		cantidadAlumnos=scan.nextInt();
		System.out.println("Ingrese cantidad de sillas");
		cantidadSillas=scan.nextInt();
		sillasFaltantes=(cantidadAlumnos-cantidadSillas);
		
		if (cantidadAlumnos<=cantidadSillas) { System.out.println("Alcanzan");
			
		} 
		
		else { System.out.println("Faltan " + sillasFaltantes+ " sillas" );
			
		}

		
		
		
	}

}
