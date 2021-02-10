package tpn1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizá un programa que resuelva el siguiente problema:
Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del total aportó cada 
una (indicando nombre y porcentaje) y cuál es el monto del total aportado por las tres.
Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego mostrar 
lo pedido en el siguiente formato:
Nombre: capital aportado: $ ... , Porcentaje del capital: %.... , Monto total aportado: $ ....
		 */
	
		
		Scanner scan = new Scanner(System.in);
		String nombre1;
		String nombre2;
		String nombre3;
		double aportePersona1;
		double aportePersona2;
		double aportePersona3;
		double montoTotal;
		
		System.out.println("Ingrese nombre de la primer persona");
		nombre1=scan.nextLine();
		System.out.println("Ingrse nombre de la segunda persona");
		nombre2=scan.nextLine();
		System.out.println("Ingrese nombre de la tercer persona");
		nombre3=scan.nextLine();
		
		System.out.println("Ingrese aporte de "+ nombre1);
		aportePersona1=scan.nextDouble();
		System.out.println("Ingrese aporte de "+ nombre2);
		aportePersona2=scan.nextDouble();
		System.out.println("Ingrese el aporte de "+ nombre3);
		aportePersona3=scan.nextDouble();
		
		montoTotal= aportePersona1+aportePersona2+aportePersona3; 
		
		System.out.println("Nombre: "+ nombre1+ " Capital Aportado: "+ aportePersona1 + " Porcentaje del capital: "+ aportePersona1*100/montoTotal);
		System.out.println("Nombre: "+ nombre2+ " Capital Aportado: "+ aportePersona2 + " Porcentaje del capital: "+ aportePersona2*100/montoTotal);
		System.out.println("Nombre: "+ nombre3+ " Capital Aportado: "+ aportePersona3 + " Porcentaje del capital: "+ aportePersona3*100/montoTotal);
        
		
		 System.out.println(montoTotal + "es el monto total aportado");
		
		
	

			scan.close();


		
		
	}
	

} 		


