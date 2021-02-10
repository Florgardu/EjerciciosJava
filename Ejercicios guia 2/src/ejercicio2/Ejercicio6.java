package ejercicio2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coordenadaX;
		int coordenadaY;
		int radio; 
		double hipotenusa;
		double cuentaElevados;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese coordenada X");
		coordenadaX= scan.nextInt();
		System.out.println("Ingrese coordenada Y");
		coordenadaY=scan.nextInt();
		System.out.println("Ingrese radio");
		radio=scan.nextInt();
		
		cuentaElevados = Math.pow(coordenadaX, 2)+ Math.pow(coordenadaY, 2);
		hipotenusa= Math.sqrt (cuentaElevados);
		
		
		// o, en una linea seria
		// double h = Math.sqrt(Math.pow(coordenadaX, 2)+ Math.pow(coordenadaY, 2));
		
		if (hipotenusa<radio) { System.out.println("Pertenece");
			
		} else { System.out.println("No pertenece");
			
		}
		
		scan.close();
		
		
	}

}
