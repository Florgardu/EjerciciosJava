package clases;

import java.util.ArrayList;

public class Doctor {
	
	private String nombre;
	private int cantidadTurnos;
	private String HorarioAtención; 
	private ArrayList<Paciente> listaTurnosParcientes;
	
	
	public Doctor(String nombre, int cantidadTurnos, String horarioAtención) {
		
		this.nombre = nombre;
		this.cantidadTurnos = cantidadTurnos;
		HorarioAtención = horarioAtención;
		this.listaTurnosParcientes = new ArrayList<Paciente>();
	}


	public String getNombre() {
		return nombre;
	}


	public int getCantidadTurnos() {
		return cantidadTurnos;
	}


	public String getHorarioAtención() {
		return HorarioAtención;
	}


	public ArrayList<Paciente> getListaTurnosParcientes() {
		return listaTurnosParcientes;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setCantidadTurnos(int cantidadTurnos) {
		this.cantidadTurnos = cantidadTurnos;
	}


	public void setHorarioAtención(String horarioAtención) {
		HorarioAtención = horarioAtención;
	}


	public void setListaTurnosParcientes(ArrayList<Paciente> listaTurnosParcientes) {
		this.listaTurnosParcientes = listaTurnosParcientes;
	}


	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", cantidadTurnos=" + cantidadTurnos + ", HorarioAtención="
				+ HorarioAtención + ", listaTurnosParcientes=" + listaTurnosParcientes + "]";
	} 
	
	
	
	private Paciente buscarPaciente (String dni) {
		Paciente pacienteBuscado=null; 
		Paciente paciente; 
		int contador=0; 
		
		while (contador < listaTurnosParcientes.size() && pacienteBuscado==null) {
			paciente=listaTurnosParcientes.get(contador);
			if (paciente.getDni().equals(dni)) {
				pacienteBuscado=paciente;
			} else {
				contador++; 
			}
		}
		
		return pacienteBuscado;
		
	}
	
	public void registrarTurno(String nombre, String apellido, String tel, String dni, Genero tipoGenero) {
		Paciente paciente;

		if (this.listaTurnosParcientes.size() < this.cantidadTurnos) {
			paciente = this.buscarPaciente(dni);
			if (paciente == null) {
				paciente = new Paciente(nombre, apellido, tel, dni, tipoGenero);
				this.listaTurnosParcientes.add(paciente);
				this.listarTurnos();
			} else {
				System.out.println("El paciente "+dni+" ya existe en la lista");
			}
		} else {
			System.out.println("El médico no tiene más turnos");
		}
		
		
	
	}


	public void listarTurnos() {
		// TODO Auto-generated method stub
		System.out.println("El doctor " + nombre + "atienden en el horario " + HorarioAtención);
		 for (Paciente paciente : listaTurnosParcientes) {			
			System.out.println(paciente);
		}
		
	}
	
	
	public void anularTurnos (String dni) {
		Paciente pacienteBorrar;
		
		pacienteBorrar= buscarPaciente(dni);
		
		if (pacienteBorrar!= null) {
			this.listaTurnosParcientes.remove(pacienteBorrar);
		} else {
			System.out.println("Ese dni no esta en la lista");
		}
	}
		
	private double cantidadPacientePorGenero (Genero generoBuscad) {
		int contadorGenero=0;
		
		for (Paciente paciente : listaTurnosParcientes) {
			if (paciente.getTipoGenero().equals(generoBuscad)) {
				contadorGenero++;
			}
			
		}
		
		return contadorGenero;
	}

	
	public double porcentajePorGenero(Genero generoBuscado) {
		double porcentaje;
		double totalPorGenero;

		totalPorGenero = this.cantidadPacientePorGenero(generoBuscado);

		porcentaje = (totalPorGenero / this.listaTurnosParcientes.size()) * 100;

		return porcentaje;
	}
}


