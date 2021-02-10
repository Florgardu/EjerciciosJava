import java.util.Arrays;

public class Estacionamiento {

	private Auto[][] espacios;
	private double tarifa;

	public Estacionamiento(int pasillos, int posiciones) {
		this.espacios = new Auto[pasillos][posiciones];
		this.inicializarEstacionamiento();
	}

	private double tarifasSegunAuto(Auto auto) {
		TipoAuto tipoAuto = auto.getTipoAuto();
		switch (tipoAuto) {
		case POLICIA:
			this.tarifa = 40.50;
			break;
		case TAXI:
			this.tarifa = 65;
			break;

		default:
			this.tarifa = 110.05;
			break;
		}

		return this.tarifa;

	}

	private void inicializarEstacionamiento() {
		int pasillos = this.espacios.length;
		int posiciones = this.espacios[0].length;

		for (int i = 0; i < pasillos; i++) {
			for (int j = 0; j < posiciones; j++) {
				this.espacios[i][j] = null;
			}

		}
	}

	// Dado un pasillo y una posición, me indica si está ocupado. /*
	public boolean estaOcupado(int pasillo, int posicion) {
		boolean estaOcupado = false;
		if (this.espacios[pasillo][posicion] != null) {
			estaOcupado = true;
		}
		return estaOcupado;
	}

	public Auto[][] getEspacios() {
		return espacios;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setEspacios(Auto[][] espacios) {
		this.espacios = espacios;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Estacionamiento [espacios=" + Arrays.toString(espacios) + ", tarifa=" + tarifa + "]";
	}

	// Devuelve la cantidad total de espacios disponibles en el estacionamiento.
	public int cantidadDisponible() {
		int cantidadDisp = 0;

		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				if (!this.estaOcupado(i, j)) {
					cantidadDisp++;
				}
			}

		}

		return cantidadDisp;

	}

	public void mostrarMatriz() {

		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				System.out.print(this.espacios[i][j] + "\t\t");
			}
			System.out.println();
		}

	}

	public boolean estacionarAuto(int pasillo, int posicion, Auto auto) {
		boolean ocuparEspacio = false;
		if (!this.estaOcupado(pasillo, posicion)) {
			this.espacios[pasillo][posicion] = auto;
			ocuparEspacio = true;
			System.out.println("Se estaciono con éxito");
		} else {
			System.out.println("Lugar ocupado, no se pudo estacionar");
		}

		return ocuparEspacio;
	}

	/*
	 * Este método retorna cuanta plata debería recaudar el día de hoy según los
	 * automóviles estacionados.
	 */
	public double recaudarHoy() {
		double recaudacion = 0;

		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				if (this.estaOcupado(i, j)) {
					Auto auto = this.espacios[i][j];
					recaudacion = recaudacion + this.tarifasSegunAuto(auto);
				}
			}

		}
		return recaudacion;
	}

	/*
	 * Este método retorna cuanta plata debería recaudar el día de hoy en el pasillo
	 * especificado.
	 */
	public double recaudarElPasillo(int pasillo) {
		double recaudoPasillo = 0;

		for (int i = 0; i < espacios[pasillo].length; i++) {
			if (this.estaOcupado(pasillo, i)) {
				Auto auto = this.espacios[pasillo][i];
				recaudoPasillo = recaudoPasillo + this.tarifasSegunAuto(auto);
			}

		}
		return recaudoPasillo;

	}

	/*
	 * Este método retorna cuantos automóviles se encuentran en la posición
	 * especificada.
	 */
	public int cuantosAutosHayEnLaPosicion(int posicion) {
		int cantidadAutos = 0;

		int posicionAContar = this.espacios.length;

		for (int i = 0; i < posicionAContar; i++) {
			if (this.estaOcupado(i, posicion)) {
				cantidadAutos++;
			}
		}

		return cantidadAutos;

	}

	public int autosPorColumna() {

		int contadorAutos = 0;
		int cantidadColumnas = this.espacios[0].length;

		for (int i = 0; i < cantidadColumnas; i++) {
			contadorAutos = 0;
			for (int j = 0; j < espacios.length; j++) {
				if (this.estaOcupado(j, i)) {
					contadorAutos++;
				}
				
			}
			System.out.println("Columna" + i + " tiene " + contadorAutos + " de autos ");
		}
		return contadorAutos;

	}
}
