package curso2polimorfismo;

import java.util.Scanner; 

public abstract class Operacion_clasePadre {
	
	//objeto para pedir datos
	Scanner entrada= new Scanner (System.in);
	//atributos
	protected int valor1;
	protected int valor2;
	protected int resultado;
	
	
	public void pedirDatos () {
		System.out.println("Ingrese valor 1");
		this.valor1= entrada.nextInt();
		
		System.out.println("Ingrese valor 2");
		this.valor2= entrada.nextInt();
		
	}

	
	public abstract void operaciones ();
	
		
	public void mostrarResultado () {
		System.out.println("El resultado es " + resultado);
	}
	

}
