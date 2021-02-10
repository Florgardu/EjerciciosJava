/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import java.util.ArrayList;

import ar.edu.ort.tp1.parcial2.exceptions.EstacionamientoException;
import ar.edu.ort.tp1.parcial2.tad.Pila;
import ar.edu.ort.tp1.parcial2.tad.PilaAL;

/**
 * Entidad que engloba el funcionamiento de un estacionamiento de autos y
 * motocicletas. cada tipo de veh�culo ser� estacionado de la forma determinada
 * y en base a su capacidad asignada al momento de la creaci�n del
 * estacionamiento.
 * 
 * Se debe tene en cuenta que el funcionamiento del estacionamiento para cada
 * tipo de veh�culo es del tipo LIFO Utilizar la implementaci�n de TAD que
 * corresponda
 */
public class Estacionamiento {

//TODO COMPLETAR

	// * Constructor del estacionamiento, recibe las capacidades de autos y motos y
	// * los precios por hora completas.

	private int capacidadAutos;
	private int capacidadMotocicletas;
	private float precioAutosPorHora;
	private float precioMotocicletasPorHora;
	private PilaAL<Vehiculo> pilaAutos;
	private PilaAL<Vehiculo> pilaMotos;
	private ArrayList<RegistroVehiculoEstacionado> autosEstacionados = new ArrayList<Estacionamiento.RegistroVehiculoEstacionado>();
	private ArrayList<RegistroVehiculoEstacionado> motosEstacionadas = new ArrayList<Estacionamiento.RegistroVehiculoEstacionado>();

	public Estacionamiento(int capacidadAutos, int capacidadMotocicletas, float precioAutosPorHora,
			float precioMotocicletasPorHora) {
		// TODO COMPLETAR
		this.pilaAutos = new PilaAL(capacidadAutos);
		this.pilaMotos = new PilaAL(capacidadMotocicletas);
		this.setPrecioAutosPorHora(precioAutosPorHora);
		this.setPrecioMotocicletasPorHora(precioMotocicletasPorHora);

	}

	/**
	 * Setea el precio de la hora de auto, debe ser mayor a 0
	 * 
	 * @param precioAutos the precioAutos to set
	 */
	private void setPrecioAutosPorHora(float precioAutosPorHora) throws EstacionamientoException {
		if (precioAutosPorHora < 0) {
			throw new EstacionamientoException("Precio invalido de Auto.");
		} else {
			this.precioAutosPorHora = precioAutosPorHora;
		}
	}

	/**
	 * Setea el precio de la hora de la motocicleta , debe ser mayor a 0
	 * 
	 * @param precioMotocicletas the precioMotocicletas to set
	 */
	private void setPrecioMotocicletasPorHora(float precioMotocicletasPorHora) throws EstacionamientoException {
		if (precioMotocicletasPorHora < 0) {
			throw new EstacionamientoException("Precio invalido de Moto.");
		} else {
			this.precioMotocicletasPorHora = precioMotocicletasPorHora;
		}
	}

	/**
	 * Permite estacionar un veh�culo en el estacionamiento. La patente debe ser
	 * v�lida segun el tipo de veh�culo el horario de ingreso debe ser v�lido
	 * 
	 * @param tipo    de veh�culo
	 * @param patente del veh�culo
	 * @param hora    de ingreso
	 */
	public void estacionar(TipoVehiculo tipo, String patente, Hora hora) throws EstacionamientoException {
//TODO COMPLETAR

		switch (tipo) {
		case AUTO:
			this.estacionarAuto(patente, hora);
			break;
		case MOTOCICLETA:
			this.estacionarMoto(patente, hora);
			break;
		}

	}

	/**
	 * Permite estacionar una motocicleta.
	 * 
	 * @param patente de la moto
	 * @param hora    del ingreso
	 */
	private void estacionarMoto(String patente, Hora hora) throws EstacionamientoException {
		Motocicleta moto = new Motocicleta(patente, hora, this.precioMotocicletasPorHora);
		try {
			this.pilaMotos.push(moto);
		} catch (Exception e) {
			throw new EstacionamientoException(e.getMessage());
		}

	}

	/**
	 * permite estacionar un auto
	 * 
	 * @param patente del auto
	 * @param hora    del Ingreso
	 */
	private void estacionarAuto(String patente, Hora hora) throws EstacionamientoException {
		Auto auto = new Auto(patente, hora, this.precioAutosPorHora);

		try {
			this.pilaAutos.push(auto);
		} catch (Exception e) {
			throw new EstacionamientoException(e.getMessage());
		}

	}

	/**
	 * Retira un veh�culo del estacionamiento. debe detectar el tipo de veh�culo en
	 * base a su patente (ver diferencias entre la patente de los autos y las motos)
	 * el horario de egreso debe ser v�lido si el veh�culo no est� estacionado debe
	 * lanzar una excepci�n.
	 * 
	 * @param patente
	 * @param horaEgreso
	 * @param minutosEgreso
	 * @return
	 */
	public float retirar(String patente, Hora hora) throws EstacionamientoException {
		/*
		 * Detecta el tipo de veh�culo usando Regular Expressions
		 */

		TipoVehiculo tipo = patente.matches(TipoVehiculo.MOTOCICLETA.getRegex()) ? TipoVehiculo.MOTOCICLETA
				: TipoVehiculo.AUTO;

		float importe = 0;
		Vehiculo encontrado = null;

		if (tipo == TipoVehiculo.AUTO) {
			encontrado = retirar(patente, this.pilaAutos);
		} else {
			if (tipo == TipoVehiculo.MOTOCICLETA) {
				encontrado = retirar(patente, this.pilaMotos);
			}
		}

		// TODO COMPLETAR
		if (encontrado == null) {
			throw new EstacionamientoException("Vehículo con patente " + patente + " No encontrado ");
		} else {
			try {
				encontrado.validarHora(hora);
				importe = encontrado.calcularImporte(hora);
				agregarARegistro(patente, importe);
			} catch (Exception e) {
				throw new EstacionamientoException(e.getMessage());
			}

		}

		return importe;

	}

	private void agregarARegistro(String patente, float importe) {
		RegistroVehiculoEstacionado r = new RegistroVehiculoEstacionado(patente, importe);
		TipoVehiculo tipo = patente.matches(TipoVehiculo.MOTOCICLETA.getRegex()) ? TipoVehiculo.MOTOCICLETA
				: TipoVehiculo.AUTO;

		switch (tipo) {
		case AUTO:
			this.autosEstacionados.add(r);
			break;

		case MOTOCICLETA:
			this.motosEstacionadas.add(r);
			break;

		}

	}

	/**
	 * Retira el veh�culo de la TAD especificada
	 * 
	 * @param patente a retirar
	 * @param tad     REEMPLAZAR EL TIPO DE ESTE PARAMETRO POR LA TAD QUE
	 *                CORRESPONDA
	 * @throws EstacionamientoException Cuando no se encuentra el veh�culo
	 * 
	 */
	private Vehiculo retirar(String patente, PilaAL<Vehiculo> pila) throws EstacionamientoException {
//		par�metro tad REEMPLAZAR EL TIPO DE ESTE PARAMETRO POR LA TAD QUE CORRESPONDA
		// TODO COMPLETAR
		Vehiculo v = null;
		PilaAL<Vehiculo> pilaAux = new PilaAL<Vehiculo>();
		Vehiculo vAux = null;

		while (!pila.isEmpty() && v == null) {
			vAux = pila.pop();
			if (vAux.getPatente().equals(patente)) {
				v = vAux;
			} else {
				pilaAux.push(vAux);
			}

		}

		this.pasaElementos(pila, pilaAux);

		return v;
	}

	private void pasaElementos(PilaAL<Vehiculo> pila1, PilaAL<Vehiculo> pila2) {
		while (!pila2.isEmpty()) {
			pila1.push(pila2.pop());
		}
	}

	/**
	 * Muestra por pantalla el resumen del final del d�a (cantidad de autos y motos
	 * estacionados, total recaudado para autos y para motos y los listados de los
	 * autos y motos estacionados durante el d�a con el importe abonado por cada
	 * uno)
	 */
	public void finalizarDia() {
		// TODO DESCOMENTAR Y COMPLETAR
		System.out.println("\r\n--------- Resumen final del día --------------\r\n");

		int cantidadAutos = this.contarVehiculos(this.autosEstacionados);
		int cantidadMotos = this.contarVehiculos(this.motosEstacionadas);
		float recaudacionMotos = this.recaudacion(motosEstacionadas);
		float recaudacionAutos = this.recaudacion(autosEstacionados);

		System.out.printf("Se han estacionado " + cantidadAutos + " autos\n");
		System.out.printf("Se han estacionado " + cantidadMotos + " motocicletas\n");
		System.out.println("\r\n----------------------------------------------");
		System.out.printf("Por estacionamiento de autos se ha recaudado " + "$" + recaudacionAutos + "\n");
		System.out.printf("Por estacionamiento de motocicletas se ha recaudado $" + recaudacionMotos + "\n");
		System.out.println("\r\n----------------------------------------------");
		System.out.println("Listado de autos estacionados");
		 this.mostrarListadoFinalDia(this.autosEstacionados);
		System.out.println("\r\n----------------------------------------------");
		System.out.println("Listado de motocicletas estacionados");
		this.mostrarListadoFinalDia(this.motosEstacionadas);
		System.out.println("\r\n--------- Fin del reporte resumen final del d�a --------------\r\n");
	}

	private int contarVehiculos(ArrayList<RegistroVehiculoEstacionado> registro) {

		int contador = 0;

		for (RegistroVehiculoEstacionado registroVehiculoEstacionado : registro) {
			contador++;
		}

		return contador;

	}

	private float recaudacion(ArrayList<RegistroVehiculoEstacionado> registro) {
		float recaudacionTotal = 0;

		for (RegistroVehiculoEstacionado r : registro) {
			recaudacionTotal = r.getImporte() + recaudacionTotal;
		}

		return recaudacionTotal;
	}

	/**
	 * @param listado a mostrar
	 */
	private void mostrarListadoFinalDia(ArrayList<RegistroVehiculoEstacionado> listado) {

		for (RegistroVehiculoEstacionado vehiculoEstacionado : listado) {
			float importe= vehiculoEstacionado.getImporte();
			String patente= vehiculoEstacionado.getPatente();
			System.out.println("-Vehículo patente:" + patente  + "- Importe abonado: " + importe);
		}
		
		
	}

	/**
	 * Inner class que posee los datos de un auto que fue estacionado durante el d�a
	 *
	 */
	private class RegistroVehiculoEstacionado {

		private String patente;
		private float importe;

		/**
		 * @param patente
		 * @param importe
		 */
		public RegistroVehiculoEstacionado(String patente, float importe) {
			this.patente = patente;
			this.importe = importe;
		}

		/**
		 * @return the patente
		 */
		public String getPatente() {
			return patente;
		}

		/**
		 * @return the importe
		 */
		public float getImporte() {
			return importe;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "RegistroVehiculoEstacionado [patente=" + patente + ", importe=" + importe + "]";
		}

	}
}
