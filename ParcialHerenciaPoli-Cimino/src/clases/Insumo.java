package clases;

public class Insumo implements Facturable {

	private String nombre;
	private TipoDeInsumo tipo;
	private double porcentajeGanancia;
	private double precioLista;
	private static final double IVA = 21;

	public Insumo(String nombre, TipoDeInsumo tipo, double porcentajeGanancia, double precioLista) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioLista = precioLista;
	}

	// Para los insumos, se suma su porcentaje de ganancia al precio de lista.
	// Sobre ese valor se suma el IVA
	@Override
	public double calcularMontoFacturacion() {
		double valorGanancia = Matematica.sumarPorcentaje(this.precioLista, this.porcentajeGanancia);
		double montoFacturacion = Matematica.sumarPorcentaje(valorGanancia, IVA);
		return montoFacturacion;
	}

	@Override
	public String toString() {
		return "Insumo [nombre=" + nombre + ", tipo=" + tipo + ", porcentajeGanancia=" + porcentajeGanancia
				+ ", precioLista=" + precioLista + ", IVA=" + IVA + "]";
	}

}
