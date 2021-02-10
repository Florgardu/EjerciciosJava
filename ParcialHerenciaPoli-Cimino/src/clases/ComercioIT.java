package clases;

import java.util.ArrayList;

public class ComercioIT {

	private ArrayList<Facturable> historialFacturacion;

	public ComercioIT() {
		this.historialFacturacion = new ArrayList<Facturable>();
	}

	public void addNuevaFactura(Facturable nuevaFacturacion) {
		this.historialFacturacion.add(nuevaFacturacion);
	}

	public void verArray() {
		for (Facturable facturable : historialFacturacion) {
			System.out.println(facturable);
		}
	}

	public double montoTotalFacturado() {
		double montoTotal = 0;

		for (Facturable facturable : historialFacturacion) {
			montoTotal = montoTotal + facturable.calcularMontoFacturacion();
		}

		return montoTotal;
	}

	// La cantidad de servicios
	// de reparación con nivel de dificultad mayor al enviado por parámetro.
	public int cantidadServiciosConDificultadMayorA(int nivelDificultad) {
		int contadorCantServicios = 0;
		for (Facturable facturable : historialFacturacion) {
			if (facturable instanceof ServicioReparacion) {
				ServicioReparacion s = (ServicioReparacion) facturable;
				if (s.soyDificultadMayorA(nivelDificultad)) {
					contadorCantServicios++;
				}
			}
		}

		return contadorCantServicios;
	}

}
