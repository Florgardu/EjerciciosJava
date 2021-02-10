package ejercicioFrigorifico;

import java.util.Calendar;
import java.util.Date;

public class ProductoCongelado extends Producto {

	private double temperatura;

	
	public ProductoCongelado(Date miFecha1, String numeroLote, double temperatura) {
		super(miFecha1, numeroLote);
		this.temperatura = temperatura;
	}

	@Override
	public Date calcularfechaVencimiento() {
		Calendar fechaVencimiento = Calendar.getInstance();
		//cargo la fecha de envasado
		fechaVencimiento.setTime(this.getFechaEnvasado());
		
		if(this.temperatura<10) {
			// le agrego 12
			fechaVencimiento.add(Calendar.DATE, 12);
		} else {
			// le agrego 20
			fechaVencimiento.add(Calendar.DATE, 20);
		}
		
		return fechaVencimiento.getTime();
	}

	@Override
	public String toString() {
		return "ProductoCongelado [temperatura=" + temperatura + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getNumeroLote()=" + getNumeroLote() + "]";
	}
	
	
	
	
	
	

}
