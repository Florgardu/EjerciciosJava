package modularizacion;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Definir la función azar, que devuelva un número entero aleatorio entre 0 y un
número recibido como parámetro, sin incluir a este último.
Ejemplo:Seinvocaazar(10)→devuelveunnúmeroentre0y9.
*/
		int nIngresado = 10; 
		System.out.println(azar(nIngresado));
		
	}
	
	public static int azar (int n) { 
		int numero;
		numero = (int) (Math.random() * (n-1));
		return numero;
		
	}
		

}
