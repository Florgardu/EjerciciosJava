
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creo un estacionamiento
		
		Estacionamiento e= new Estacionamiento(4, 22);
		
		
		System.out.println(e.estaOcupado(1, 2));
		
		Auto auto1= new Auto(TipoAuto.TAXI);
		e.estacionarAuto(0, 0, auto1);
				
		System.out.println(e.estaOcupado(0, 0));  
		
		System.out.println(e.cantidadDisponible());
		
		Auto auto2= new Auto(TipoAuto.POLICIA);
		
		e.estacionarAuto(0, 1, auto2);
		
		e.mostrarMatriz();
		System.out.println(e.recaudarHoy());
		
		Auto auto3= new Auto(TipoAuto.POLICIA);
		Auto auto4= new Auto(TipoAuto.COMUN);
		
		e.estacionarAuto(1, 3, auto3);
		e.estacionarAuto(3, 3, auto4);
		
		
		e.mostrarMatriz();


		System.out.println(e.recaudarElPasillo(1));
		
		System.out.println(e.cuantosAutosHayEnLaPosicion(3));

		
		e.autosPorColumna();
		
		
		prueba p= new prueba();
		
		p.agregarNumeros();
		p.eliminarPares();
		p.eliminarPares2();
		p.eliminaPares3();
	
		
		
	}

}
