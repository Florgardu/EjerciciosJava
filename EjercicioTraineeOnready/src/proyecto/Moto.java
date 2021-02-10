package proyecto;

public class Moto extends Vehiculo {

	private String cilindrada;
	
	public Moto(String marca, String modelo, double precio, String cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada=cilindrada;
		// TODO Auto-generated constructor stub
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Marca:" +  super.getMarca() + " // Modelo: " + super.getModelo() + " // Cilindrada : " + this.getCilindrada() + " // Precio : $" + super.getPrecio();
				
	}
	

	
	
	
}
