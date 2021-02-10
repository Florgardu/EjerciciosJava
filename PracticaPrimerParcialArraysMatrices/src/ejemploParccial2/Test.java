package ejemploParccial2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		CircuitoATP torneoAtp= new CircuitoATP();		
		
		torneoAtp.procesarInfo();
		// pruebo que el ArrayList se haya cargado bien
		System.out.println(torneoAtp.procesarInfo());
		
		torneoAtp.buscoJugador("Pella");
		
		// pruebo que ande el buscador de jugador por nombre, lo puse público para poder probar
		System.out.println(torneoAtp.buscoJugador("Pella"));
		
		// pruebo que ande el buscador de torneo por nombre, lo puse público para poder probar
		System.out.println(torneoAtp.buscoTorneo("Shangai"));
		
		// pruebo buscando a Del Potro
		
		torneoAtp.procesarTorneosJugador("Del Potro");
		
		// pruebo buscar puesto de Schwartzman en RolandGarros
		
		torneoAtp.obtenerResultadoJugador("Schwartzman", "RolandGarros");
		
		// pruebo método procesar peor posicion de un jugador que paso por parametro
		
		torneoAtp.procesarPeorPosTorneoJugador("Pella");
		
		
		
		
	}

}
