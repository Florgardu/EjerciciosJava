package prueba_parcial;
import java.util.Scanner;
import java.util.Random;

public class Casino {

	private static final String BKJ = "BKJ";
	private static final String RUL = "RUL";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreJugador;
		double montoInicial;
		String tipoJuego;
		double dineroRestante;
		final double APUESTA_MINIMA = 500;
		double costoJuego;
		double montoActual;
		int resultado;
		int contadorJuegos = 0;
		final int VALOR_JUEGO_MENOR_COSTO = 100;
		double montoAcumulado=0; 
		int contadorRul=0;
		int contadorBkj=0;
		int contadorPkr=0;


		nombreJugador = leerNombre("Hola jugador ingrese su nombre");
		montoInicial = leerValidarApuesta("Ingrese monto a apostar minimo " + APUESTA_MINIMA + " pesos",APUESTA_MINIMA);
		montoActual = montoInicial; // cuando entro tengo toda la plata

		while (montoActual >= (montoInicial * 0.20) 
				&& montoActual >= VALOR_JUEGO_MENOR_COSTO
				&& montoAcumulado < 5000) {

			tipoJuego = leerValidarTipoJuego("Ingrese el juego que desea jugar: RUL para Ruleta, BKJ para Black Jack o PKR para Poker");
			costoJuego = ObtenerCostoJuego(tipoJuego);
			System.out.println("El costo por el juego elegido es " + costoJuego);

			if (montoActual>= costoJuego) {
				montoActual = RestaCostoJuego(montoActual, costoJuego);
				
				switch (tipoJuego) {
					case RUL:
						contadorRul++;
						break;
					case BKJ:
						contadorBkj++;
						break;
	
					default:
						contadorPkr++;
						break;
				}
				
				resultado = obtenerResultado();
				switch (resultado) {
					case 1:
						montoActual = montoActual + costoJuego;
						break;
					case 2:
						montoActual = montoActual + (costoJuego * 2);
						break;
					default:
						break;
				}

				montoAcumulado= montoActual-montoInicial; 
				
				System.out.println(montoActual);
				
				contadorJuegos++; 
				
			} else {
				System.out.println("No le alcanza el dinero para este juego");
			}

		}
		
		
		System.out.println("Tu dinero restante es " + montoActual);
		System.out.println("Total de veces que se jugo Ruleta:"+ contadorRul);
		System.out.println("Total de veces que se jugo BlackJack:"+ contadorBkj);
		System.out.println("Total de veces que se jugo Poker:"+ contadorPkr);
		System.out.println("Se jugo "+ ((double)contadorRul/contadorJuegos)*100 + " % a la ruleta" );
		System.out.println("Se jugo "+ ((double)contadorBkj/contadorJuegos)*100 +  " % al BlackJack" );
		System.out.println("Se jugo "+ ((double)contadorPkr/contadorJuegos)*100 + " % al Poker" );


		
		
	}

	public static String leerNombre(String texto) {
		String nombre;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		nombre = scan.next();
		return nombre;

	}

	public static double leerValidarApuesta(String texto, double minimoDeApuesta) {
		double valorApuesta;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		valorApuesta = scan.nextInt();
		while (valorApuesta < minimoDeApuesta) {
			System.out.println("Error ." + texto);
			valorApuesta = scan.nextInt();
		}

		return valorApuesta;

	}

	public static String leerValidarTipoJuego(String texto) {
		String juegoElegido;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		juegoElegido = scan.next();
		while (!juegoElegido.equals(RUL) && !juegoElegido.equals(BKJ) && !juegoElegido.equals("PKR")) {
			System.out.println("Error. " + texto);
			juegoElegido = scan.next();
		}
		return juegoElegido;
	}

	public static double ObtenerCostoJuego(String tipoJuego) {
		double costoJuego;
		switch (tipoJuego) {
		case RUL:
			costoJuego = 100;
			break;
		case BKJ:
			costoJuego = 200;
			break;

		default:
			costoJuego = 500;
			break;
		}

		return costoJuego;
	}

	public static double RestaCostoJuego(double montoInicial, double costoJuego) {
		double montoRestante;
		montoRestante = (montoInicial - costoJuego);
		return montoRestante;

	}

	public static int obtenerResultado() {
		//return 0;
		Random r = new Random();
		return r.nextInt(3);
	}

}
