package ar.com.ort;

public class TarjetaDeCredito {
	
	//atributos
	
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double disponible;
	private double acumuladorGastos;
	
	//getter y setters 
	
	public String getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	public double getDisponible() {
		return disponible;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	public void setDisponible(double disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", disponible=" + disponible + "]";
	}
	// constructor 
	public TarjetaDeCredito (String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.disponible = limiteDeCompra;
	}
		
	//metodos 
	private boolean puedoComprar (double monto) {
		return (monto<=disponible);
	}
	
	public boolean realizarCompra (double monto) {
		boolean puedoComprar = this.puedoComprar(monto);
		if (puedoComprar) {
			//actualiza monto disponible
			disponible=disponible-monto;
			acumuladorGastos=acumuladorGastos+monto;
			return true;
		}else {
			return false;
		}
	}
	
	public void actualizarLimite (double nuevoLimite) {
		if (nuevoLimite<limiteDeCompra) {
			limiteDeCompra=nuevoLimite;
			disponible= nuevoLimite-acumuladorGastos;
			
		}
		
		if (acumuladorGastos>nuevoLimite) {
			disponible=0;
			
	
		
		}	
	}

}
