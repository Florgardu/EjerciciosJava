package ejemploComposicionKeyword;

public class Laptop {

	private int anioFabricacion;
	private String marca;

	private Keyboard keyboard;
	
	
	public Laptop() {
		this(2020, "HP");
	}

	// desde afuera no pueden setear el teclado, si obtener con los getters. 
	public Laptop(int anioFabricacion, String marca) {
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
		this.keyboard = new Keyboard(433221, "Spanish");
	}
	
	// getter y setter de anio y marca

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	// getter y setters del teclado 
	
	public int getSerieNumTeclado () {
		return this.keyboard.getNumeroSerie();
	}
	
	
	public String getLayoutTeclado () {
		return this.keyboard.getLayout();
	}
}
