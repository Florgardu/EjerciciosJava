package ejercicioFrigorifico;

import java.util.Calendar;
import java.util.Date;

public class ProductoFresco extends Producto {

	private String paisOrigen;
	private int indice;

	public ProductoFresco(Date fechaEnvasado, String numeroLote, String paisOrigen, int indice) {
		super(fechaEnvasado, numeroLote);
		this.paisOrigen = paisOrigen;
		this.indice = indice;
	}

	@Override
	public Date calcularfechaVencimiento() {

		Calendar fechaVencimiento = Calendar.getInstance();
		//cargo la fecha de envasado
		fechaVencimiento.setTime(this.getFechaEnvasado());
		// le agrego el indice por 3
		fechaVencimiento.add(Calendar.DATE, (this.indice * 3));

		return fechaVencimiento.getTime();

	}

	public Date sumarRestarDiasFecha(Date fecha, int dias) {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fecha); // Configuramos la fecha que se recibe

		calendar.add(Calendar.DAY_OF_YEAR, dias); // numero de días a añadir, o restar en caso de días<0

		return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

	}
	
	@Override
	public boolean sosFresco() {
		return true;
	}

	@Override
	public String toString() {
		return "ProductoFresco [paisOrigen=" + paisOrigen + ", indice=" + indice + ", getFechaEnvasado()="
				+ getFechaEnvasado() + ", getNumeroLote()=" + getNumeroLote() + "]";
	}

}
