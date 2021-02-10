package ejercicioFrigorifico;

import java.util.Date;

public abstract class Producto {

	private Date fechaEnvasado;
	private String numeroLote;

	public Producto(Date fechaEnvasado, String numeroLote) {
		super();
		this.fechaEnvasado = fechaEnvasado;
		this.numeroLote = numeroLote;
	}

	public abstract Date calcularfechaVencimiento();

	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	public boolean sosFresco() {
		return false;
	}
	

}


