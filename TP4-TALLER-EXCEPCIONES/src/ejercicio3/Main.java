package ejercicio3;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero;
		numero= pedirNumeroEntero("Por favor ingrese un número");
		System.out.println("El numero ingresado es " + numero);

		
	}
	
	
	
	private static int pedirNumeroEntero (String texto) {
		 int numero=0;
		 System.out.println(texto);
		 do {
				try {
					numero = scanner.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					String caracterError= scanner.next();
					System.out.println("Error, ingreso el valor no numerico "  +  caracterError + "por favor reingrese un valor numerico");
				}

			} while (numero == 0);
              return numero;
      
		}
		 
	}
	
	


