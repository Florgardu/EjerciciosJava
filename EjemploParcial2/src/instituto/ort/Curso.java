package instituto.ort;

import java.util.ArrayList;

public class Curso {
	
	private String codigo;
	private String titulo;
	private int horas;
	
	private ArrayList<Alumno> alumnos = new ArrayList();
	
	public Curso(String codigo, String titulo, int horas) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.horas = horas;
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public void addAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getHoras() {
		return horas;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

	
	public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double promedio){
		// buscar que el alumno tenga al menos 2 evaluaciones, sino no juega
		// que ese alumno tenga un promedio mayor al recivido por parametro
		
		ArrayList<Alumno> alumnosEncimaDe = new ArrayList<Alumno>();
		
		for (Alumno alumno : alumnos) {
			if(alumno.getEvaluaciones().size()>=2 && alumno.calcularPromedio() > promedio){
				alumnosEncimaDe.add(alumno);
			}
		}
		
		return alumnosEncimaDe;
		
	}
	
	

}
