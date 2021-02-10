package proyecto;

public class Auto extends Vehiculo {

	private int puertas;

	public Auto(String marca, String modelo, double precio, int cantidadPuertas) {
		super(marca, modelo, precio);
		this.puertas = cantidadPuertas;
		// TODO Auto-generated constructor stub
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		// Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00

		return "Marca:" + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas : " + this.getPuertas()
				+ " // Precio : $ " + super.getPrecio();

	}

}
