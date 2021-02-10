package pilas;

import java.util.Stack;

public class PrimerPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<String> pilaDeString= new Stack<String>();
		
	//	pilaDeString.push("Hola, llegue primero");
	//	pilaDeString.push("Hola, yo segundo");
	//	pilaDeString.push("Hola, los últimos seremos los primeros");
		
	pilaDeString.push("Hola");	
	pilaDeString.push("Primero");
	System.out.println("Elemento de la cima es " + pilaDeString.peek());

	String mensaje=	pilaDeString.pop();
	
	System.out.println("Elemento de la cima es " + pilaDeString.peek());

    pilaDeString.push(mensaje);

	System.out.println("Elemento de la cima es " + pilaDeString.peek());

	//	System.out.println("Elemento de la cima es " + pilaDeString.peek());
	//	System.out.println("Tamaño de la pila " + pilaDeString.size());
	//	System.out.println("Desapilo todos los elementos " + pilaDeString.pop());
	//	System.out.println("Desapilo todos los elementos " + pilaDeString.pop());
	//	System.out.println("Desapilo todos los elementos " + pilaDeString.pop());
	//	if (pilaDeString.isEmpty()) {
	//		System.out.println("La pila esta vacía");
		//}

	}

}
