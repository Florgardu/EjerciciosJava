package ejercicioFrigorifico;

import java.util.ArrayList;

public class Empresa {
	
	
	private ArrayList<Producto> productosAVender;
	
	

	public Empresa() {
		super();
		this.productosAVender = new ArrayList();
	}
	
	public void addProducto(Producto producto) {
		this.productosAVender.add(producto);
	}
	

}
