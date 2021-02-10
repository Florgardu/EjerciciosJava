package tpn1;

import java.util.Scanner;

public class Ejercio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Construir un programa que simule el funcionamiento de una calculadora que puede 
		 * realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores
		 *  numéricos enteros.
		En un principio, el usuario debe especificar la operación que desea realizar 
		(s para la suma, r para la resta, p para el producto y d para la división) 
		y luego, deberá ingresar dos números enteros para así realizar la operación. 
		Informar el resultado por pantalla.
Nota: Se recomienda el empleo de una sentencia switch.
 */
		 Scanner scan = new Scanner(System.in);
		 final String SUMA="s";
		 final String RESTA="r";
		 final String PRODUCTO="p";
		 final String DIVISION="d";
		 int numero1;
		 int numero2;
		 String operacion;
		 System.out.println("Ingrese un numero");
		 numero1=scan.nextInt();
		 System.out.println("Ingrese otro numero");
		 numero2=scan.nextInt();
		 System.out.println("Ingrese operación");
		 operacion=scan.next();
		 
		 
		 switch (operacion) {
		 case SUMA:
			System.out.println(numero1+numero2);
			break;
		
		 case RESTA:
				System.out.println(numero1-numero2);
				break;	
			
		 case PRODUCTO:
				System.out.println(numero1*numero2);
				break;	
				
		 case DIVISION:
				System.out.println(numero1/numero2);
				break;			

		default: 
			System.out.println("Operación invalida");
			break;
		}
		 
		 
		scan.close();
	 }
} 
