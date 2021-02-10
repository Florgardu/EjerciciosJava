package ejemploParccial2;

import java.util.ArrayList;
import java.util.Arrays;

public class CircuitoATP {

	private int[][] matrizResultados;
	private String[] nombrejugadores;
	private String[] nombretorneos;
	private ArrayList<Jugador> jugadores;

	public CircuitoATP() {
		this.matrizResultados = new int[][] { { 1, 3, 4, 1, 3 }, { 3, 2, 3, 4, 1 }, { 2, 1, 5, 5, 2 },
				{ 4, 5, 1, 2, 5 }, { 5, 4, 2, 3, 4 } };
		;
		nombrejugadores = new String[] { "Pella", "Del Potro", "Schwartzman", "Mayer", "DelBonis" };
		nombretorneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon", "Shangai" };
		this.jugadores = new ArrayList();
	}

	public ArrayList<Jugador> procesarInfo() {
		int cantidadJugadores = this.matrizResultados.length;

		for (int i = 0; i < cantidadJugadores; i++) {
			Jugador j = new Jugador();
			String nombreJugador = this.nombrejugadores[i];
			j.setNombre(nombreJugador);
			j.setPuestoAustralia(this.matrizResultados[i][0]);
			j.setPuestoUsOpen(this.matrizResultados[i][1]);
			j.setPuestoRolandGarros(this.matrizResultados[i][2]);
			j.setPuestoWimbledon(this.matrizResultados[i][3]);
			j.setPuestoShangai(this.matrizResultados[i][4]);

			this.jugadores.add(j);

		}

		return jugadores;
	}

	// tal que reciba el nombre de un jugador, y devuelva el puesto de este en el
	// array de nombreJugadores.
	// si no existe devolver -1
	public int buscoJugador(String nombreJugador) {
		int posicionJugadorBuscado = -1;

		for (int i = 0; i < this.nombrejugadores.length; i++) {
			if (this.nombrejugadores[i].equals(nombreJugador)) {
				posicionJugadorBuscado = i;
			}
		}

		return posicionJugadorBuscado;
	}

	// tal que reciba el nombre de un torneo, y devuelva el puesto de este en el
	// array de nombreNombreTorneo.
	// si no existe devolver -1
	public int buscoTorneo(String torneo) {
		int posicionTorneoBuscado = -1;

		for (int i = 0; i < this.nombretorneos.length; i++) {
			if (this.nombretorneos[i].equals(torneo)) {
				posicionTorneoBuscado = i;
			}
		}
		return posicionTorneoBuscado;
	}

// tal que retorne para un jugador enviado por parametro el resultado de todos los torneos en 
	// string con el nombre del torneo y el puesto.
	public String procesarTorneosJugador(String nombreJugador) {
		int posicionEnArrayJugador = this.buscoJugador(nombreJugador);
		Jugador jugardorBuscado = this.jugadores.get(posicionEnArrayJugador);
		System.out.println(nombreJugador + " = " + jugardorBuscado.toString());
		return jugardorBuscado.toString();
	}

	// tal que el puesto en que finalizó un jugador (enviado por parametro) en un
	// torneo enviado por
	// parámetro y lo devuelva en un String.
	public void obtenerResultadoJugador(String jugador, String torneo) {
		int posicionEnArrayJugador = this.buscoJugador(jugador);
		Jugador jugadorAProcesar = this.jugadores.get(posicionEnArrayJugador);

		int posicionEnArrayTorneo = this.buscoTorneo(torneo);

		int posicionObtenida = jugadorAProcesar.damePosicionEnTorneo(posicionEnArrayTorneo);

		System.out.println("Resultado para el jugador " + jugadorAProcesar.getNombre() + " en "
				+ this.nombretorneos[posicionEnArrayTorneo] + " " + posicionObtenida);

	}

	// que devuelva la peor posicion (más baja)en un torneo del jugador enviado por
	// parámetro
	// ej: Peor resultado de Pella en el año : 4 puesto.
	public int procesarPeorPosTorneoJugador(String nombreJugador) {
		int peorPosicionObtenida = 0;

		int posicionJugadorEnArray = this.buscoJugador(nombreJugador);
		int torneosJugadosPorJugador = this.matrizResultados[posicionJugadorEnArray].length;

		for (int i = 0; i < torneosJugadosPorJugador; i++) {
			int resultado = this.matrizResultados[posicionJugadorEnArray][i];
			if (resultado > peorPosicionObtenida) {
				peorPosicionObtenida = resultado;
			}
		}

		System.out.println("La peor posición de " + nombreJugador + " fue " + peorPosicionObtenida);
		return peorPosicionObtenida;

	}

	public int[][] getMatrizResultados() {
		return matrizResultados;
	}

	public String[] getNombrejugadores() {
		return nombrejugadores;
	}

	public String[] getNombretorneos() {
		return nombretorneos;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setMatrizResultados(int[][] matrizResultados) {
		this.matrizResultados = matrizResultados;
	}

	public void setNombrejugadores(String[] nombrejugadores) {
		this.nombrejugadores = nombrejugadores;
	}

	public void setNombretorneos(String[] nombretorneos) {
		this.nombretorneos = nombretorneos;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "CircuitoATP [matrizResultados=" + Arrays.toString(matrizResultados) + ", nombrejugadores="
				+ Arrays.toString(nombrejugadores) + ", nombretorneos=" + Arrays.toString(nombretorneos)
				+ ", jugadores=" + jugadores + "]";
	}

}
