
public class Bebida extends Producto {

	private int tamaño;
	private boolean tieneAlcohol;

	public Bebida(String nombre, double precio, int tamaño, boolean tieneAlcohol) {
		super(nombre, precio);
		this.tamaño = tamaño;
		this.tieneAlcohol = tieneAlcohol;
	}

	public int getTamaño() {
		return tamaño;
	}

	public boolean isTieneAlcohol() {
		return tieneAlcohol;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public void setTieneAlcohol(boolean tieneAlcohol) {
		this.tieneAlcohol = tieneAlcohol;
	}

	@Override
	public String toString() {
		return "Bebida [tamaño=" + tamaño + ", tieneAlcohol=" + tieneAlcohol + "]";
	}

	
	
	//En el caso de las bebidas
	//consumidas, el descuento es de 10% para las que no contiene alcohol y de 3% en para las que si contienen.
	@Override
	public double getPrecioAbonoEfectivo() {
		double precioEfectivo;
		if (tieneAlcohol) {
			precioEfectivo= this.getPrecio()-this.getPrecio()*0.03;
		} else {
			precioEfectivo= this.getPrecio()-this.getPrecio()*0.10;
		}
		
		
		return precioEfectivo;
	}

	
	
	
}
