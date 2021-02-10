package tpn1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Realizá un programa que solicite al usuario el ingreso por teclado un valor entero mayor que 0
		 *  en una variable llamada num1 y muestre un mensaje por pantalla indicando 
		 * "el número es par" o "el número es impar". Deberá utilizar el operador “módulo” es el caracter %.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1;
		System.out.println("Ingrese un numero entero");
		num1=scan.nextInt();
		
		
		if (num1<=0) { 		
			System.out.println("El valor debe ser mayor que cero");
			
		} 
		 else if (num1%2==0)
		 { System.out.println("Es par");
			
		} else
		{ System.out.println("Es impar");
		}
			
		scan.close();

		}

		
	}


