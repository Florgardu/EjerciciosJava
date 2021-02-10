package ejercicio4;

import java.time.Year;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		LectorDeEnteros le = new LectorDeEnteros(input);
		
	//	RangoDeEnteros rango= new RangoDeEnteros(1, 10);
		
	//	int numero=le.pedir("Ingresame la nota del chico", rango);
		
	//	System.out.println("El numero ingresado es " + numero);
		
		int anioActual = Year.now().getValue();
		int anioNacimientoP1= le.pedir("Ingrese la fecha de nacimiento para persona 1", 1900, anioActual);
		int anioFallecimientoP1= le.pedir("Ingrese fecha de fallecimiento para persona 1");
		int anioNacimientoP2= le.pedir("Ingrese la fecha de nacimiento para persona 2", 1900, anioActual);
		int anioFallecimientoP2= le.pedir("Ingrese fecha de fallecimiento para persona 2", anioNacimientoP2, anioActual);

		Persona persona= new Persona("Hernan Perez", anioNacimientoP1, anioFallecimientoP1);
		Persona persona2= new Persona("Amy Winehouse", anioNacimientoP2, anioFallecimientoP2);
		
		persona.MostarEdad();
		persona2.MostarEdad();
	
	}

}
