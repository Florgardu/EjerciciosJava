package ejercicioFrigorifico;

import java.util.Calendar;
import java.util.Date;

public class ProductoRefrigerado extends Producto {

	private String codigo;

	public ProductoRefrigerado(Date fechaEnvasado, String numeroLote, String codigo) {
		super(fechaEnvasado, numeroLote);
		this.codigo = codigo;
	}

	@Override
	public Date calcularfechaVencimiento() {
		Calendar fechaVencimiento = Calendar.getInstance();
		//cargo la fecha de envasado
		fechaVencimiento.setTime(this.getFechaEnvasado());
		// le agrego 10 dias
		fechaVencimiento.add(Calendar.DATE, 10);

		return fechaVencimiento.getTime();
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigo=" + codigo + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getNumeroLote()=" + getNumeroLote() + "]";
	}
	
	
	
	
	

}
