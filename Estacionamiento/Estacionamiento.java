package ar.edu.ort.tp1.estacionamiento;

public class Estacionamiento {
	private Automovil[][] espacios ;
	
	public final float PRECIO_AUTO_POLICIA = 40.50f;
	public final float PRECIO_AUTO_TAXIS   = 65.00f;
	public final float PRECIO_AUTO_COMUN   = 110.05f;
	
	
	
	/*Constructor cuyos par�metros que recibe indicar�n cuantos pasillos tiene y cuantas posiciones cada pasillo. */ 
	public Estacionamiento(int pasillos, int posiciones) {
		espacios = new Automovil[pasillos][posiciones];
	}; 
	 
	/*Este m�todo se encargar� de poner todas las posiciones del estacionamiento libres (es decir, en null). */
	private void inicializarEstacionamiento(){
		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				espacios[i][j] = null;
			}
		}
	}; 
	 
	/*Dado un pasillo y una posici�n, me indica si est� ocupado. */
	public boolean estaOcupado(int pasillo, int posicion){
		boolean retorno = false;
		
//		pasillo  = pasillo - 1;
//		posicion = posicion - 1;
		
		//4 pasillos (0-3)
		//length = 4
		if ((pasillo>=0)  && (pasillo<espacios.length)) {
			
			if ((posicion>=0)  && (posicion<espacios[pasillo].length)) {
				
				if (espacios[pasillo][posicion] != null) {
					retorno = true;
				}
			}
		}
		
		
		
		return retorno;
	};
	
	public boolean estaDisponible(int pasillo, int posicion) {
		return !estaOcupado(pasillo, posicion);
	}
	 
	/* Devuelve la cantidad total de espacios disponibles en el estacionamiento. */ 
	public int cantidadDisponible(){
		int disponibles = 0;
		
		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
//				if (espacios[i][j] == null) {
//					disponibles++;
//				}
				
				if (estaDisponible(i, j)) {
					disponibles++;
				}
				
			}
		}
		
		return disponibles;
	};
	 
	/* Si el espacio est� libre le asigna el Automovil y retorna true, 
	 * 	en caso de que este ocupado no hace nada y retorna false, 
	 * En ambos casos y avisa por consola que ocurri�. 
	 * */ 
	public boolean ocuparEspacio(int pasillo, int posicion, Automovil auto){
		boolean retorno = false;
		
		if (estaDisponible(pasillo, posicion)) {
			espacios[pasillo][posicion] = auto;
			retorno = true;
			System.out.println("Se pudo agregar el Automovil");
		}else {
			System.out.println("No pudo agregar el Automovil");
		}
		
		return retorno;
	};
	
	public boolean ocuparEspacio(int pasillo, int posicion, TipoDeAutomovil tipoAutomovil){
		boolean 	retorno = false;
		Automovil 	auto;
		
		if (estaDisponible(pasillo, posicion)) {
			auto = new Automovil(tipoAutomovil);
			
			espacios[pasillo][posicion] = auto;
			retorno = true;
			System.out.println("Se pudo agregar el Automovil");
		}else {
			System.out.println("No pudo agregar el Automovil");
		}
		
		return retorno;f
	};
	
	/* Este m�todo retorna cuanta plata deber�a recaudar el d�a de hoy seg�n los autom�viles estacionados.*/ 
	public float recaudarHoy(){
		float 		recaudacion = 0;
		Automovil 	auto;
		
		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				
				if (estaOcupado(i, j)) {
					auto = espacios[i][j];
					
					switch (auto.getTipoAutomovil()) {
						case Policia : 
							recaudacion += PRECIO_AUTO_POLICIA;
							break;
							
						case Taxi :
							recaudacion += PRECIO_AUTO_TAXIS;
							break;
							
						case Comun : 
							recaudacion += PRECIO_AUTO_COMUN;
							break;
						
						default:
						
					}
				}
			}
		}
		
		return recaudacion;
	}; 
	
	public float recaudarHoy_Reutilizando(){
		float 		recaudacion = 0;
		Automovil 	auto;
		
		for (int i = 0; i < espacios.length; i++) {
			recaudacion += recaudarElPasillo(i);
		}
		
		return recaudacion;
	}; 
	 
	 
	/* Este m�todo retorna cuanta plata deber�a recaudar el d�a de hoy en el pasillo especificado.*/ 
	public float recaudarElPasillo(int pasillo){
		float 		recaudacion = 0;
		Automovil 	auto;
		
		for (int j = 0; j < espacios.length; j++) {

			if (estaOcupado(pasillo, j)) {
				auto = espacios[pasillo][j];
				
				switch (auto.getTipoAutomovil()) {
					case Policia : 
						recaudacion += PRECIO_AUTO_POLICIA;
						break;
						
					case Taxi :
						recaudacion += PRECIO_AUTO_TAXIS;
						break;
						
					case Comun : 
						recaudacion += PRECIO_AUTO_COMUN;
						break;
					
					default:
					
				}
			}
		}
	
		return recaudacion;
	};
	 
	/* Este m�todo retorna cuantos autom�viles se encuentran en la posici�n especificada.*/ 
	public int cuantosAutosHayEnLaPosicion(int posicion){
		int cantidad = 0;
		
		for (int i = 0; i < espacios.length; i++) {
			if (estaOcupado(i, posicion)) {
				cantidad ++;
			}
		}
		return cantidad;
	};
}


		// este método recorre todas las columnas y pasa el total de autos por columna

			
 		public int autosPorColumna() {
 			
 			int contadorAutos=0; 
 			int cantidadColumnas= this.espacios[0].lenght; 
 			
 			for (int i = 0; i < cantidadColumnas; i++) {
 				contador=0;
 				for (int j = 0; j < espacios.length; j++) {
 					if (this.estaOcupado(j, i)) {
						contador++;
					}
					System.out.println("Columna" + i + " tiene " contador + " de autos ");
				}
				
			}
 			
 			
 			
 		}
			










