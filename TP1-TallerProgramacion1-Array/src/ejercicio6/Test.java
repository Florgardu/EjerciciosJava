package ejercicio6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creo un rubro
		
		Rubro rubro1= new Rubro ("Cafeteria");
		
		// inicializo el arreglo de importes
		
		rubro1.inicializarGastos();
		
		
		// le cargo a enero y febrero gastos  // pruebo método agregarGasto
		
		rubro1.agregarGasto(MESDELANIO.ABRIL, 100);
		rubro1.agregarGasto(MESDELANIO.ENERO, 200);

		
		// VEO QUE LO HAYA CARGADO BIEN
		
		System.out.println(rubro1);
		
	
		// pruebo método getNombre()

		rubro1.getName();
		System.out.println(rubro1.getName());
		
		// pruebo método getTotalGastos - pido enero y pido abril 
		// debería darme 200 y 100
		
		rubro1.getTotalGastos(MESDELANIO.ENERO);
		rubro1.getTotalGastos(MESDELANIO.ABRIL);

		System.out.println(rubro1.getTotalGastos(MESDELANIO.ENERO));
		System.out.println(rubro1.getTotalGastos(MESDELANIO.ABRIL));
		
		
		/// ---- MÉTODOS DE GASTOSTOTAL
		
		
		// Creo un objeto gasto anual
		
		GastoAnual gasto2020 = new GastoAnual ();
		
		// AGREGO rubros
		gasto2020.agregarRubro(rubro1);
		
		// pruebo el método AgregarGasto
		
		gasto2020.agregarGastoNuevo(MESDELANIO.ENERO, "Cafeteria", 200);
		gasto2020.agregarGastoNuevo(MESDELANIO.ENERO, "Cafeteria", 200);
	
		
        // esto debería agregar 200 pesos a cafeteria, lo cual daría un total de 400 
		
		rubro1.getTotalGastos(MESDELANIO.ENERO);
		System.out.println(rubro1.getTotalGastos(MESDELANIO.ENERO));
		
		
		// ahora pruebo si agrega un rubro que no existe con AgregarGastoNuevo
		
	gasto2020.agregarGastoNuevo(MESDELANIO.MARZO, "Tintoreria", 200);
	System.out.println(gasto2020);
		 
		
		// pruebo consolidadoDeGastos()
		
		gasto2020.consolidadoDeGastos();
		
		// pruebo gastoAcumulado(MESDELANIO mes) 
		
		gasto2020.gastoAcumulado(MESDELANIO.ENERO);
		gasto2020.gastoAcumulado(MESDELANIO.FEBRERO);
		gasto2020.gastoAcumulado(MESDELANIO.MARZO);
		
		// deberia dar 400
		
		System.out.println(gasto2020.gastoAcumulado(MESDELANIO.ENERO));
		
		// deberia dar 0 
		
		System.out.println(gasto2020.gastoAcumulado(MESDELANIO.FEBRERO));
		
		// deberia dar 200

		System.out.println(gasto2020.gastoAcumulado(MESDELANIO.MARZO));

		
		
		// pruebo gastoAcumulado(String nombreRubro) por rubro
		
		gasto2020.gastoAcumulado("Cafeteria");
		
		// debería dar 400
		
		System.out.println(gasto2020.gastoAcumulado("Cafeteria"));
		
		// debería dar 200 
		System.out.println(gasto2020.gastoAcumulado("Tintoreria"));
		
		
		// debería dar -1
		System.out.println(gasto2020.gastoAcumulado("Supermercado"));
		
		
		// pruebo informarConsumoPorMes y por promedio 
		
		gasto2020.informarConsumosPorMes();
		
		
		// pruebo public void informarMesMayorConsumo() - debe darme enero con 400 
		
		
		gasto2020.informarMesMayorConsumo();
		

	
		
		

	}

}
