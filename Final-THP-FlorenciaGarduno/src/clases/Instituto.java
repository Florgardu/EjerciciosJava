package clases;

import java.util.ArrayList;

public class Instituto {

	private String nombre;
	private ArrayList<Alumno> listaAlumnos;
	private ArrayList<Curso> listaCursos;

	public Instituto(String nombre) {
		super();
		this.nombre = nombre;
		this.listaAlumnos = new ArrayList<Alumno>();
		this.listaCursos = new ArrayList<Curso>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return "Instituto [nombre=" + nombre + ", listaAlumnos=" + listaAlumnos + ", listaCursos=" + listaCursos + "]";
	}

}
