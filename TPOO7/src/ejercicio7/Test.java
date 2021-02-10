package ejercicio7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* En la clase test, crear el objeto a través del constructor. "Ford","Fiesta", "ABCD123",
Capacidad:40, Cantidad: 20, Kilometros por litro: 10.
Probar todos los métodos  */ 
		
		Automovil miAuto= new Automovil("Ford", "Fiesta", "ABCD123");
		miAuto.setCapacidadTotalCombustible(40);
		miAuto.setCantidadCombustible(20);
		miAuto.setKmPorLitro(10);
		
		System.out.println(miAuto.cargarCombustible(30));
		System.out.println(miAuto);
		
		
		
		
	}

}
