package colas;

import java.util.LinkedList;
import java.util.Queue;

public class primerEjemploCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> cola= new LinkedList<String>();
		cola.add("Flor");
		cola.add("Pedro");
		cola.add("Roberto");
		cola.add("Juan");
		
		int tamanioCola= cola.size();
		int contador=0;
		while (!cola.isEmpty()&& contador<tamanioCola-1) {
			cola.remove();
			contador++;
		}
		System.out.println(cola.peek());
		

		System.out.println("Primer elemento en la cola " + cola.element()); //retorna el primer elemento sin sacarlo
		System.out.println("Primer elemento en la cola " + cola.peek()); //retorna el primer elemento sin sacarlo, si algo vaya devuelve null no da excepcion
		System.out.println("El tamaño de la cola" + cola.size() );
		System.out.println("Remover" + cola.remove() );
		System.out.println("Remover" + cola.remove() );
		System.out.println("Remover" + cola.remove() );
		System.out.println("Remover" + cola.remove() );


		if (cola.isEmpty()) {
			System.out.println("Cola vacia");
		}

	}

}
