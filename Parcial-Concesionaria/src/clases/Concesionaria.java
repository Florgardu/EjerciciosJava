package clases;

import java.util.ArrayList;

public class Concesionaria {
	
	
	private String nombre; 
	private ArrayList <Vehiculo>listaVehiculosDisponibles;
	
	
// constructor 
	public Concesionaria(String nombre) {
		super();
		this.nombre = nombre;
		this.listaVehiculosDisponibles = new ArrayList<Vehiculo>();
	}
	
	//getter y setters
	
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Vehiculo> getListaVehiculosDisponibles() {
		return listaVehiculosDisponibles;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setListaVehiculosDisponibles(ArrayList<Vehiculo> listaVehiculosDisponibles) {
		this.listaVehiculosDisponibles = listaVehiculosDisponibles;
	}

	// toString
	@Override
	public String toString() {
		return "Concesionaria [nombre=" + nombre + ", listaVehiculosDisponibles=" + listaVehiculosDisponibles + "]";
	} 
	
	
	public void agregarAutos (Vehiculo vehiculoNuevo) {
		this.listaVehiculosDisponibles.add(vehiculoNuevo);
	}
	
// metodos pedidos 
	
	
	private double sacarPromedio () {
		double promedio;
		double sumatoriaPrecio=0;
		
		for (Vehiculo vehiculo : listaVehiculosDisponibles) {
			sumatoriaPrecio= vehiculo.getPrecio() + sumatoriaPrecio;
			
		}
		promedio= sumatoriaPrecio/listaVehiculosDisponibles.size();
		return promedio;
		
		
	}
	
	
	public ArrayList<Vehiculo> vehiculosMasBaratosQuePromedio () {
		ArrayList<Vehiculo> listaVehiculosMasBaratosQuePromedio= new ArrayList<Vehiculo>();
		double promedio= sacarPromedio(); 
		
		 for (Vehiculo vehiculo : listaVehiculosDisponibles) {
			if (vehiculo.getPrecio()<= promedio) {
				listaVehiculosMasBaratosQuePromedio.add(vehiculo);
			}
		}
		
		return listaVehiculosMasBaratosQuePromedio;
		
	}
	
	public int cantidadVehiculosSegunMarca (Marca marca) {
		int cantidadAutos=0; 
		
		 for (Vehiculo vehiculo : listaVehiculosDisponibles) {
			if (vehiculo.getMarca().equals(marca)) {
				cantidadAutos++;
			}
		}
		
		
		return cantidadAutos; 
	}
	
	
	public Vehiculo elAutoMasCaro () {
		Vehiculo elMasCaro=null; 
		double max=0; 
		
		for (Vehiculo vehiculo : listaVehiculosDisponibles) {
			if (vehiculo.getPrecio()>max) {
				max=vehiculo.getPrecio();
				elMasCaro=vehiculo;
			}
		}
		
		return elMasCaro;
	}

}
