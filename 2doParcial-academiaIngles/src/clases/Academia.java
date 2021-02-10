package clases;

import java.util.ArrayList;

public class Academia {

	private String nombre;
	private ArrayList<Alumno> listaAlumnos;

	public Academia(String nombre) {
		super();
		this.nombre = nombre;
		this.listaAlumnos = new ArrayList<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
	public void getCantidadAlumnos () {
		this.listaAlumnos.size();
	}

	
	private Alumno buscarAlumno (String dni) {
		int contador=0;
		Alumno alumnoBuscado=null;
	    Alumno alumnoEnLista; 
		
		while (contador<this.listaAlumnos.size() && alumnoBuscado==null ) {
			alumnoEnLista= this.listaAlumnos.get(contador);
			if (alumnoEnLista.getDni().equals(dni)) {
				alumnoBuscado=alumnoEnLista;
			}else {
				contador++;
			}
		}
		return alumnoBuscado;
	}
	
	
	public Alumno inscribirAlumno (String nombre, String dni, Nivel nivel) {
		Alumno alumnoParaInscribir; 
		
		alumnoParaInscribir=buscarAlumno(dni);
		if (alumnoParaInscribir==null) {
			alumnoParaInscribir= new Alumno(dni, nombre, nivel);
			alumnoParaInscribir.setEstado(Estado.ALTA);
			this.listaAlumnos.add(alumnoParaInscribir);
			System.out.println("Alumno agregado con éxito");
		} else {
			System.out.println("Alumno ya existe");
		}
		return alumnoParaInscribir;
	}
	
	public void ingresarBajaAlumno (String dni) {
		Alumno alumno;
		
		alumno= buscarAlumno(dni);
		if (alumno!=null && alumno.getDeuda()<=0) {
			alumno.setEstado(Estado.BAJA);
			System.out.println("Estado cambiado con éxito");
		} else {
			System.out.println("el alumno tiene deuda o no existe. No se puede cambiar estado");
					
		}
		
	}
	
	
	public void listarAlumnos (Nivel nivel){
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getEstado().equals(Estado.ALTA) && alumno.getNivel().equals(nivel)) {
				System.out.println(alumno);
			}
			
		}
	}
	
	public void cargarPago (String dni, int importePago){
		Alumno alumno;
		alumno=buscarAlumno(dni);
		int deudaAlumno;
		
		if (alumno!=null) {
			deudaAlumno= alumno.getDeuda();
			deudaAlumno=deudaAlumno-importePago;
			alumno.setDeuda(deudaAlumno);
			System.out.println("Se cargo el pago");
		}else {
			System.out.println("No se pudo cargar, no se encontro al alumno");
		}
	}
}
