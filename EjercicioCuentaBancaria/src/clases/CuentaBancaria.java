package clases;

public class CuentaBancaria {

	private String cbu;
	private String tipo;
	private double saldo;
	private Persona titular;
	private Fecha fechaDeApertura;
	
	
	public String getCbu() {
		return cbu;
	}
	public String getTipo() {
		return tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public Persona getTitular() {
		return titular;
	}
	public Fecha getFechaDeApertura() {
		return fechaDeApertura;
	}
	public void setCbu(String cbu) {
		this.cbu = cbu;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public void setFechaDeApertura(Fecha fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	
	//constructor 
	
	public CuentaBancaria(String tipo, Persona titular) {
		super();
		this.tipo = tipo;
		this.titular = titular;
		this.saldo=0;
		this.cbu=generarCbu(); 
		this.fechaDeApertura=obtenerFechaDeHoy();
	}
	
	
	private String generarCbu () {
		return "soy el CBU que toco"; 
	}
	
	private Fecha obtenerFechaDeHoy () {
		Fecha hoy= new Fecha(23,10,2019);
		return hoy; 
	}
	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular
				+ ", fechaDeApertura=" + fechaDeApertura + "]";
	}
	
	
	public void depositar (double monto) {
		saldo=saldo+monto;
		
	}
	
	public void mostrarInfo () {
		System.out.println("El nombre del titular es: " + titular.nombreCompleto());
		System.out.println("El dni del titular es " + titular.getDni()  );
		System.out.println("El cbu es " + this.cbu);
		System.out.println("El saldo es " + this.saldo);
		System.out.println("Tipo de cuenta es " + getTipo () );  // puedo usar get o this es lo mismo
		

		
	}
	
	public void extraerMonto (int montoExtraer) {
		if (montoExtraer <= saldo) {
			saldo = saldo - montoExtraer;

		} else {
			System.out.println("Saldo insuficiente");
		}
	}

}
