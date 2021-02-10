package clases;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Programa p= new Programa();
		Serie s= new Serie();
		ProgramaTv tv= new ProgramaTv();
		
		ArrayList<Mostrable> mostrables= new ArrayList<Mostrable>();
		mostrables.add(p);
		mostrables.add(s);
		mostrables.add(tv);

		for (Mostrable mostrable : mostrables) {
			mostrable.mostrar();
		}
		
		
	}

}
