package instituto.ort;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String dni;
	private ArrayList<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();
	
	
	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}


	public ArrayList<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}
	
	public void addEvaluacion(Evaluacion evaluacion) {
		this.evaluaciones.add(evaluacion);
	}


	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}


	public double calcularPromedio(){
		double acumuladorNotas = 0;
		
		for (Evaluacion evaluacion : evaluaciones) {
			acumuladorNotas = acumuladorNotas + evaluacion.getNota();
		}
		
		// hay que poner un if si la cantidad de examenes es 0 no calcula promedio. 
		
		return Matematica.obtenerPromedio(acumuladorNotas, evaluaciones.size());
	}

}
