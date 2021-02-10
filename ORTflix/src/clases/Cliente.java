package clases;

import java.util.ArrayList;

public class Cliente {

	private String dni;
	private Categoria tipoSuscripcion;
	private ArrayList<Pelicula> peliculasVistas = new ArrayList<Pelicula>();
	private double deuda; 
	

	public Cliente(String dni, Categoria tipoSuscripcion) {
		this.dni = dni;
		this.tipoSuscripcion = tipoSuscripcion;
	}

	
	
	
	public double getDeuda() {
		return deuda;
	}




	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}




	public String getDni() {
		return dni;
	}

	public Categoria getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	public ArrayList<Pelicula> getPeliculasVistas() {
		return peliculasVistas;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setTipoSuscripcion(Categoria tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}

	public void setPeliculasVistas(ArrayList<Pelicula> peliculasVistas) {
		this.peliculasVistas = peliculasVistas;
	}

	
	public void agregarPeliculaVista (Pelicula pelicula) {
		this.peliculasVistas.add(pelicula);
	}
	
	
	
	public double obtenerSaldo () {
		// TODO
		return deuda;
	}
	

}
