package curso2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ClaseHija_suma mensajeroSuma= new ClaseHija_suma();
		mensajeroSuma.pedirDatos();
		mensajeroSuma.sumar();
		System.out.println("El resultado de la suma es  ");
		mensajeroSuma.mostrarResultados();

		
		ClaseHija_resta mensajeroResta = new ClaseHija_resta();
		mensajeroResta.pedirDatos();
		mensajeroResta.restar();
		System.out.println("El resultado de la resta es  ");
		mensajeroResta.mostrarResultados();
		
		
		Object mensajeroSuma2 = new ClaseHija_suma();
		
		
	}

}
