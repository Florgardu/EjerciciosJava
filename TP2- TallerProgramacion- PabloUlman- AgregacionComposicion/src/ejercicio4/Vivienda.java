package ejercicio4;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> inquilinos;
	private ArrayList<Mueble> muebles;

	public Vivienda(String calle, int altura, int piso, String departamento) {
		Direccion miDireccion = new Direccion(calle, altura, piso, departamento);
		this.direccion = miDireccion;
		this.inquilinos = new ArrayList();
		this.muebles = new ArrayList();
	}

	public void agregarPersonas(Persona persona) {
		this.inquilinos.add(persona);
	}

	public void agregarMuebles(Mueble mueble) {
		this.muebles.add(mueble);
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public ArrayList<Persona> getInquilinos() {
		return inquilinos;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setInquilinos(ArrayList<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}

	public void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}

	public void mostrarTodo() {
		System.out.println("Vivienda 1:");
		System.out.println("Direccion: " + this.direccion.getCalle() + this.direccion.getAltura()
				+ this.direccion.getPiso() + this.direccion.getDepartamento());
		System.out.println("Personas:");
		for (Persona persona : this.inquilinos) {
			System.out.println(persona);
		}
		System.out.println("Muebles:");
		for (Mueble muebleCasa : this.muebles) {
			System.out.println(muebleCasa);
		}
	}

}
