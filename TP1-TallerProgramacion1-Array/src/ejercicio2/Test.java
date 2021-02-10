package ejercicio2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// creo 10 atletas

		Atleta jugador1 = new Atleta("Juan", 0.50);
		Atleta jugador2 = new Atleta("Pedro", 0.70);
		Atleta jugador3 = new Atleta("Maria", 0.70);
		Atleta jugador4 = new Atleta("Lisa", 0.45);
		Atleta jugador5 = new Atleta("Hernan", 0.30);
		Atleta jugador6 = new Atleta("Tomas", 0.80);
		Atleta jugador7 = new Atleta("Flor", 0.20);
		Atleta jugador8 = new Atleta("Damian", 0.20);
		Atleta jugador9 = new Atleta("Joaquin", 0.20);
		Atleta jugador10 = new Atleta("Pamela", 0.35);

		// ahora creo un programa que calcule los ganadores.
		Programa procesadorDeDatos = new Programa();

		// agrego los jugadores al programa para que pueda procesarlo

		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador1);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador2);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador3);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador4);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador5);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador6);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador7);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador8);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador9);
		procesadorDeDatos.agregarJugadoresParaAnalizar(jugador10);

		// le pido que calcule los ganadores . Me devuelve una lista

		procesadorDeDatos.calcularGanadores();

		// Deberia mostrarme Flor, Damian y Joaquin

		System.out.println(procesadorDeDatos.calcularGanadores());

	}

}
