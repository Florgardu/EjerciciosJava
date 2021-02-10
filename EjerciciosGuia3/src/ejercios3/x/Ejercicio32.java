package ejercios3.x;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*
		 * Desarrollar un algoritmo que, dados dos números naturales b y e, 
		 * la computadora muestre el valor de b elevado a e, sin utilizar operadores 
		 * o funciones que calculen exponentes.
          Ejemplo: Se ingresa 2 y 5, la computadora muestra: 32.
		 */
		
		int b;
		b=2;
		int e;
		int resultado;
		e=5;
		int contador;
		contador=1;
		resultado=1;
		
		
		while (contador<=e) {
			resultado=(b*resultado);
			contador=contador+1;

		}
		System.out.println(resultado);

		
	}

}
