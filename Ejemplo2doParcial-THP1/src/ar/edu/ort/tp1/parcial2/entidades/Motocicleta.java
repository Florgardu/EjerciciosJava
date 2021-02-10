/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.exceptions.EstacionamientoException;

/**
 * Representa una motocicleta a ser estacionada. el precio de los autos se
 * fracciona cada 5 minutos.
 */
public class Motocicleta extends Vehiculo {

	/**
	 * Constructor de motocicleta
	 * 
	 * @param patente     patente de la motocicleta
	 * @param horaIngreso hora del ingreso precioPorHora precio de la hora completa
	 *                    de las motocicletas
	 */

	private float precioPorHora;

	public Motocicleta(String patente, Hora horaIngreso, float precioPorHora) {
		super(patente, horaIngreso);
		this.precioPorHora = precioPorHora;
	}

	/**
	 * Valida que una patente sea v�lida para el tipo de vehiculo auto. debe tener
	 * formato de tres n�meros y tres letas por ejemplo '182ABC'.
	 */
	public void validarPatente(String patente) throws EstacionamientoException {

		if (!patente.matches(TipoVehiculo.MOTOCICLETA.getRegex())) {
			throw new EstacionamientoException("Patente errónea");
		}

	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo la hora y minutos de
	 * salida. Debe redondearse a 5 minutos la cantidad de minutos de la estad�a, si
	 * la duraci�n da 12 minutos, se deben cobrar 15. si la duraci�n da 7 minutos,
	 * se deben cobrar 10.
	 */

	@Override
	public float calcularImporte(Hora horaEgreso) throws IllegalArgumentException {

		float precioCincoMinutos = this.precioPorHora / CINCO_MINUTOS_POR_HORA;

		super.validarHoraEgreso(horaEgreso);
		Hora tiempoEstadia = calcularTiempoEstadia(horaEgreso);

		int minutosEstadia = tiempoEstadia.getMinuto();
		int minutosEstadiaRedondo = super.redondear(minutosEstadia, CINCO);

		// CALCULO EL PRECIO DE LAS HORAS
		int horasEstadia = tiempoEstadia.getHora();
		float importeHora = horasEstadia * this.precioPorHora;

		float importeMinutos = (precioCincoMinutos / CINCO) * minutosEstadiaRedondo;

		float importe = importeHora + importeMinutos;
		return importe;

	}

}
