package clases;

import java.util.ArrayList;


public class Empresa {

	private ArrayList<Viaje> viajesRealizados;
	private Camion[] camiones = new Camion[10];
	private Chofer[] choferes = new Chofer[20];

	public Empresa() {
		super();
		this.viajesRealizados = new ArrayList<Viaje>();
		// this.camiones = camiones;
		// this.choferes = choferes;
	}

	public void llenarListaDeCamiones() {

		Camion camion1 = new Camion(0, 100);
		this.camiones[0] = camion1;
		Camion camion2 = new Camion(1, 150);
		this.camiones[1] = camion2;
		Camion camion3 = new Camion(2, 300);
		this.camiones[2] = camion3;
		Camion camion4 = new Camion (3, 400);
		this.camiones[3] = camion4;
		Camion camion5 = new Camion(4, 200);
		this.camiones[4] = camion5;

	}

	public void llenarListaChoferes() {
		Chofer chofer1 = new Chofer("A1", "Jose", 100);
		this.choferes[0] = chofer1;

		Chofer chofer2 = new Chofer("A2", "Juan", 150);
		this.choferes[1] = chofer2;

		Chofer chofer3 = new Chofer("A3", "Alberto", 200);
		this.choferes[2] = chofer3;

		Chofer chofer4 = new Chofer("A4", "Roberto", 400);
		this.choferes[3] = chofer4;

		Chofer chofer5 = new Chofer("A5", "Diego", 300);
		this.choferes[4] = chofer5;

		Chofer chofer6 = new Chofer("A6", "Pablo", 100);
		this.choferes[5] = chofer6;

		Chofer chofer7 = new Chofer("A7", "Andres", 180);
		this.choferes[6] = chofer7;

	}
	
	public void agregarViajes (Viaje viajeAgregar) {
		this.viajesRealizados.add(viajeAgregar);
	}
	
	
	
	

	// Desarrollar el método informarCostoViajes que muestre por pantalla cual fue
	// el costo
	// aproximado de cada viaje (honorario + consumo del camión)

	public void informarCostoViajes() {
		double costoViaje = 0;
		Camion camion;
		Chofer chofer;
		double gastoPorKm = 0;
		double honorario = 0;
		int posicionCamionEnLista;
		double kmViaje = 0;

		for (Viaje v : this.viajesRealizados) {
			if (v != null) {
				posicionCamionEnLista = v.getIdCamion();
				camion = camiones[posicionCamionEnLista];
				gastoPorKm = camion.getGastoPorKmRecorrido();
				kmViaje = v.getKmViaje();

				chofer = buscarChofer(v.getIdChofer());
				if (chofer != null) {
					honorario = chofer.getHonorarioPorViaje();
				} else {
					System.out.println("No existe el chofer");
				}

			}

			costoViaje = honorario + (gastoPorKm * kmViaje);
			System.out.println("El costo del viaje fue " + costoViaje);
		}

	}

	private Chofer buscarChofer(String idChofer) {
		Chofer choferBuscado = null;
		int contador = 0;

		while (contador < this.choferes.length && choferBuscado == null) {
			if (this.choferes[contador].getIdChofer().equals(idChofer)) {
				choferBuscado = this.choferes[contador];
			} else {
				contador++;
			}

		}
		return choferBuscado;

	}

	// • Desarrollar el método informarViajesXChoferCamion que muestre por pantalla
	// elnombre de cada chofer y la cantidad de viajes que realizó con cada camión

	public void informarViajesXChoferCamion() {

		int cantChoferes = this.choferes.length;
		int cantCamiones = this.camiones.length;
		int[][] cantViajesChoferCamion = new int[cantChoferes][cantCamiones];

		for (Viaje v : this.viajesRealizados) {
			int choferFila = posicionChofer(v.getIdChofer());
			int camionColumna = v.getIdCamion();
			if (choferFila!=-1) {
				cantViajesChoferCamion[choferFila][camionColumna]++;
			}
		}

		mostrarMatriz(cantViajesChoferCamion);

	}

	private int posicionChofer(String idChofer) {
		int posicion = 0;
		int contador = 0;
		Chofer choferBuscado = null;
		Chofer aux;

		while (contador < this.choferes.length && choferBuscado == null) {
			aux = this.choferes[contador];
			if (aux != null && aux.getIdChofer().equals(idChofer)) {
				choferBuscado = aux;
			} else {
				contador++;
			}
		}

		if (choferBuscado != null) {
			posicion = contador;
		} else {
			posicion = -1;
		}

		return posicion;
	}

	private void mostrarMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length && this.choferes[i] != null; i++) {

			System.out.println(this.choferes[i].getNombre());
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + " viajes con camión " + j);

			}
		}

	}

}
