package clases;

public class Pelicula {

	private String nombre;
	private Categoria categoriaPelicula;
	
	
	public String getNombre() {
		return nombre;
	}
	public Categoria getCategoriaPelicula() {
		return categoriaPelicula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCategoria_pelicula(Categoria categoria_pelicula) {
		this.categoriaPelicula = categoria_pelicula;
	}
	public Pelicula(String nombre, Categoria categoria_pelicula) {
		super();
		this.nombre = nombre;
		this.categoriaPelicula = categoria_pelicula;
	}

	
	
	
}
