package pilas;

import java.util.Stack;

public class Verificador {

	
	
	public boolean estaEquilibrado(String cadena) {
		Stack<String> pila = new Stack();
		int i = 0;

		while (i < cadena.length()) {
			if (cadena.charAt(i) == '(') {
				pila.push("(");
			} // si el parentesis es de apertura lo agrego, lo apilo
			else if (cadena.charAt(i) == ')') { // si es de cierre vuelvo a preguntar
				if (!pila.isEmpty()) {
					pila.pop();
				} // si la pila no esta vacía desapilo
				else {
					pila.push(")");
				} // si no esta vacía lo agrego, va a quedar solo sin pareja
			}
			i++;
		}

		if (pila.isEmpty()) {
			return true;
		} else {
			return false;
		}

	
	
}
}
