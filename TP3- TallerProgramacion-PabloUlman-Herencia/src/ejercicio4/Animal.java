package ejercicio4;

import java.util.ArrayList;

public class Animal {
	
	private String nombre;
	private int tamaño;
	private ArrayList<Habilidad>habilidades;
	private ComidaDeAnimal tipoDeComida;
	private Cuidador cuidador; 
	
	
	public Animal(String nombre, int tamaño, ComidaDeAnimal tipoDeComida, Cuidador cuidador) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.habilidades = new ArrayList();
		this.tipoDeComida = tipoDeComida;
		this.cuidador=cuidador;
	}
	
	
	
	public void hacerHabilidad(int numeroHabilidad) {

		Habilidad h = this.habilidades.get(numeroHabilidad);

		System.out.println(this.nombre + " realizo " + h.getNombreTruco());
		System.out.println("Recibió " + h.getCantidadKilos() + " kilos");
		this.cuidador.descontarStock(tipoDeComida, h.getCantidadKilos());
	}
	
	
	public int kilosHabilidad (int numeroHabilidad) {
		int kilos=	this.habilidades.get(numeroHabilidad).getCantidadKilos();
		return kilos;
	}
	
	
	public void agregarHabilidad (Habilidad habil) {
		this.habilidades.add(habil);
	}


	public String getNombre() {
		return nombre;
	}


	public int getTamaño() {
		return tamaño;
	}


	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}


	public ComidaDeAnimal getTipoDeComida() {
		return tipoDeComida;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}


	public void setTipoDeComida(ComidaDeAnimal tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}

	
	
	public Cuidador getCuidador() {
		return cuidador;
	}


	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}


	@Override
	public String toString() {
		return "Animal nombre=" + nombre + ", tamaño=" + tamaño + ", habilidades=" + habilidades + ", tipoDeComida="
				+ tipoDeComida + "";
	}
	
	
	

}
