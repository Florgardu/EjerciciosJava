package test;

import clases.ComercioIT;
import clases.Insumo;
import clases.Servicio;
import clases.ServicioArmado;
import clases.ServicioReparacion;
import clases.TipoDeInsumo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComercioIT comercio = new ComercioIT();

		Insumo i = new Insumo("Impresora", TipoDeInsumo.hardware, 10, 5000);

		double monto = i.calcularMontoFacturacion();
		System.out.println(monto);

		comercio.addNuevaFactura(i);

		Servicio servicioArmado = new ServicioArmado(2, 250);
		// double montoServicioArmado = servicioArmado.calcularMontoFacturacion();
		// System.out.println(montoServicioArmado);

		comercio.addNuevaFactura(servicioArmado);

		Servicio servicioRe1 = new ServicioReparacion(2, 180, 1);
		Servicio servicioRe2 = new ServicioReparacion(2, 180, 3);
		Servicio servicioRe3 = new ServicioReparacion(2, 180, 4);

		comercio.addNuevaFactura(servicioRe1);
		comercio.addNuevaFactura(servicioRe2);
		comercio.addNuevaFactura(servicioRe3);

		// double precioSinIncremento = servicioRe1.calcularPrecio();
		// double precioConIncremento = servicioRe2.calcularPrecio();

		// System.out.println(precioSinIncremento);
		// System.out.println(precioConIncremento);

		// double totalConIva1 = servicioRe1.calcularMontoFacturacion();
		// double totalConIva2 = servicioRe2.calcularMontoFacturacion();

		// System.out.println(totalConIva1);
		// System.out.println(totalConIva2);

		double montoTotalFacturado = comercio.montoTotalFacturado();
		System.out.println(montoTotalFacturado);

		// pruebo método cantidad de servicios
		// de reparación con nivel de dificultad mayor a 3 debería darme 2

		int cantidad = comercio.cantidadServiciosConDificultadMayorA(3);
		System.out.println(cantidad);

	}

}
