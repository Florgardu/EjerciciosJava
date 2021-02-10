package ejercicio6;

public class Libro {
	
	
	private String autor;
	private String tituloLibro;
	private String editorial;
	
	
	
	public Libro(String autor, String tituloLibro, String editorial) {
		super();
		this.autor = autor;
		this.tituloLibro = tituloLibro;
		this.editorial = editorial;
	}



	public String getAutor() {
		return autor;
	}



	public String getTituloLibro() {
		return tituloLibro;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", tituloLibro=" + tituloLibro + ", editorial=" + editorial + "]";
	}

	
	
	
	
	
}
