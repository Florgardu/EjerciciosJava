package ejercicio4;

public class ComidaDeAnimal {

	
	private int stock;
	

	public ComidaDeAnimal(int stock) {
		super();
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "ComidaDeAnimal stock=" + stock + "]";
	}
	
	
	
	
	
	
	
}
