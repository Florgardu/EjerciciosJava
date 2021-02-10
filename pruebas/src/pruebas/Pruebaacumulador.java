package pruebas;

public class Pruebaacumulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador, acumulador; 
		contador=0;
		acumulador=0;
		
		while (contador<10) {
			acumulador=acumulador+contador;
			contador=contador+1;
		
			
		}
 System.out.println("La suma de los primeros 10 numeros naturales es " + acumulador);
	}

}
