/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.exceptions.EstacionamientoException;

/**
 * Representa un auto a ser estacionado. El precio de los autos se fracciona
 * cada 10 minutos.
 */
public class Auto extends Vehiculo {

//		TODO COMPLETAR
	/**
	 Constructor de auto
	 * 
	 * @param patente       patente del auto
	 * @param horaIngreso   hora del ingreso
	 * @param precioPorHora precio de la hora completa de los autos
	 */
	
	private float precioPorHora;
	
	
	public Auto(String patente, Hora horaIngreso, float precioPorHora) {
	super(patente, horaIngreso);
	this.precioPorHora = precioPorHora;
}

	/**
	 * Valida que una patente sea v�lida para el tipo de vehiculo auto. debe tener
	 * formato de tres letras y tres n�meros por ejemplo 'DSA182' o dos letras tres
	 * numeros y dos letras ejemplo 'AB123CD'
	 */
	@Override
	public void validarPatente(String patente) throws EstacionamientoException {

		// TODO COMPLETAR
		// FORMA DE VERIFICAR QUE LA PATENTE TIENE EN FORMATO CORRECTO

		if (!patente.matches(TipoVehiculo.AUTO.getRegex())) {
			throw new EstacionamientoException("Patente errónea");
		}
	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo el horario de salida.
	 * Debe redondearse a 10 minutos la cantidad de minutos de la estad�a, si la
	 * duraci�n da 7 minutos, se deben cobrar 10.
	 */
	@Override
	public float calcularImporte(Hora hora) throws EstacionamientoException {
// autos cada 10' motos 5'
		
		float precioDiezMinutos= this.precioPorHora/DIEZ_MINUTOS_POR_HORA;

		super.validarHoraEgreso(hora);
		Hora tiempoEstadia= calcularTiempoEstadia(hora);
		
		int minutosEstadia= tiempoEstadia.getMinuto();
		int minutosEstadiaRedondo=super.redondear(minutosEstadia, DIEZ);
		
		//CALCULO EL PRECIO DE LAS HORAS 
		float precioTotalHora = tiempoEstadia.getHora() * this.precioPorHora;
		float precioTotalMinutos = (precioDiezMinutos * minutosEstadiaRedondo / DIEZ);
		
		return precioTotalHora+precioTotalMinutos;
	}

}
