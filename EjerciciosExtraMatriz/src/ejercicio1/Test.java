package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CeldaSudoku s= new CeldaSudoku();
		
		s.agregarValor(0, 0, 1);
		s.agregarValor(0, 1, 3);
		s.agregarValor(0, 2, 5);
		s.agregarValor(1, 1, 8);

		
		s.mostrar();
	}

}
