package curso2polimorfismo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Operacion_clasePadre mensajeroSuma = new Suma_claseHija();
		// yo sé que no puede ser new operacion_clasePadre porque al ser abstracta no puede instarciar un objeto.
		// pero no puede ser directamente suma_claseHija mensajeroSuma= new Suma_claseHija ? por que? 

		mensajeroSuma.pedirDatos();
		mensajeroSuma.operaciones();
		mensajeroSuma.mostrarResultado();
		
		
		
		Operacion_clasePadre mensajeroResta = new Resta_claseHija();
		mensajeroResta.pedirDatos();
		mensajeroResta.operaciones();
		mensajeroResta.mostrarResultado();
		
	}

}
