package pilas;

import java.util.Stack;

public class PruebaEquilibrioParentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Verificador v= new Verificador();
		String cadenaNo = "()(";
		String cadenaSi = "()()";

		System.out.println(v.estaEquilibrado(cadenaNo));
		System.out.println(v.estaEquilibrado(cadenaSi));

}
}
