package ejercicio5;

public class Hotel {
	 
	 private String nombre;
	 private String localidad;
	 private int habitacionesTotales;
	 private int habitacionesDisponibles;
	 
	 
	 
	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesDisponibles) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.habitacionesTotales = habitacionesTotales;
		this.habitacionesDisponibles = habitacionesDisponibles;
	} 
	
 
	 
	public String getNombre() {
		return nombre;
	}




	public String getLocalidad() {
		return localidad;
	}




	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}




	public int getHabitacionesDisponibles() {
		return habitacionesDisponibles;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}




	public void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales = habitacionesTotales;
	}




	public void setHabitacionesDisponibles(int habitacionesDisponibles) {
		this.habitacionesDisponibles = habitacionesDisponibles;
	}




	public boolean ocuparHabitaciones(int cantidadHabitacionesOcupar) {
		boolean hayLugar = false;

		if (habitacionesDisponibles >= cantidadHabitacionesOcupar) {
			hayLugar = true;
			habitacionesDisponibles= habitacionesDisponibles-cantidadHabitacionesOcupar;
		} return hayLugar;
	}
	 
	 //* desocuparHabitaciones: recibe por parámetro la cantidad de habitaciones a desocupar.
	//* Valida que sea posible realizar la acción y devuelve true o false según corresponda. //*
	 
	 
	public boolean desocuparHabitaciones(int cantidadHabitacionesDesocupar) {
		boolean sePuedeDesocupar = false;
		if (habitacionesDisponibles == 0) {
			return sePuedeDesocupar;
		} else {
			habitacionesDisponibles = habitacionesDisponibles + cantidadHabitacionesDesocupar;
			return sePuedeDesocupar = true;
		}
	}


	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", localidad=" + localidad + ", habitacionesTotales=" + habitacionesTotales
				+ ", habitacionesDisponibles=" + habitacionesDisponibles + "]";
	}
	 
	
	
	
}
