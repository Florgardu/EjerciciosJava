import java.util.ArrayList;

public class Menu {
	
	private ArrayList<Producto> productos;
	
	
	

	public Menu() {
		super();
		this.productos = new ArrayList();
	}
	
	
	public void agregarProductosDelMenu (Producto producto) {
		this.productos.add(producto);
	}
	

}
