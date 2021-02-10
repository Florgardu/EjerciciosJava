package proyecto;

import java.util.ArrayList;

public class Concesionario {
	
	private ArrayList<Vehiculo>vehiculosDisponibles = new ArrayList<Vehiculo>();
	

	
	public Concesionario() {
	}

	public void llenarArrayVehiculos() {
		Auto auto1= new Auto("Peugeot","206", 200000 , 4);
		this.vehiculosDisponibles.add(auto1);
		Moto moto1 = new Moto ("Honda", "Titan",60000,"125cc");
		this.vehiculosDisponibles.add(moto1);
		Auto auto2= new Auto("Peugeot","208", 250000 , 5);
		this.vehiculosDisponibles.add(auto2);
		Moto moto2 = new Moto ("Yamaha", "YBR", 80500.50,"160cc"); 
		this.vehiculosDisponibles.add(moto2);                		
	}
	
	
	// lista todos los Vehiculos de la lista
	public void getVehiculosDisponibles() {
		for (Vehiculo vehiculo : vehiculosDisponibles) {
			System.out.println(vehiculo.toString());	
		}
	}

	public void vehiculoMasCaro() {
		double max=0;
		Vehiculo vehiculoMasCaro=null;
		
		for (Vehiculo vehiculo : vehiculosDisponibles) {
			if (vehiculo.getPrecio()>max) {
				max=vehiculo.getPrecio();
				vehiculoMasCaro=vehiculo;
			}
		}
		
		System.out.println("Vehiculo más caro : " + vehiculoMasCaro.getMarca() + " " +  vehiculoMasCaro.getModelo());
	}


	public void vehiculoMasBarato() {
		double min=Double.MAX_VALUE;
		Vehiculo vehiculoMasCaro=null;
		
		for (Vehiculo vehiculo : vehiculosDisponibles) {
			if (vehiculo.getPrecio()<min) {
				min=vehiculo.getPrecio();
				vehiculoMasCaro=vehiculo;
			}
		}
		
		System.out.println("Vehiculo más barato : " + vehiculoMasCaro.getMarca() + " " +  vehiculoMasCaro.getModelo());
	}

	
	public void buscarModeloConLetraPedida(String letra) {
		
		for (Vehiculo vehiculo : vehiculosDisponibles) {
			if (this.buscarLetra(letra, vehiculo.getModelo())) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " 
			     + vehiculo.getMarca() + " " + vehiculo.getModelo() + " $"+ vehiculo.getPrecio());
			}
		}
		
	}
	
	
	
	private boolean buscarLetra(String letra, String palabra) {
		boolean tieneLetra=false;
		char[] aCaracteres = palabra.toCharArray();
		for (char c : aCaracteres) {
			if (String.valueOf(c).equals(letra)) {
				tieneLetra=true;
			}
		}
		return tieneLetra;
	}
	
	

	public void deMayorAMenorPrecio() {
		
		for (int i = 0; i < this.vehiculosDisponibles.size()-1; i++) {
			for (int j = 0; j < this.vehiculosDisponibles.size()-1; j++) {
				//pregunto si el numero actual es menor a numero siguiente 
				if (this.vehiculosDisponibles.get(j).getPrecio()<this.vehiculosDisponibles.get(j+1).getPrecio()) {
					// lo intercambio de lugar
					Vehiculo aux= this.vehiculosDisponibles.get(j);
					this.vehiculosDisponibles.set(j, this.vehiculosDisponibles.get(j+1));
					this.vehiculosDisponibles.set(j+1, aux);
				}
			}
		}
		
		// muestro el arreglo ordenado de mayor a menor
		
		for (Vehiculo vehiculo : vehiculosDisponibles) {
			System.out.println(vehiculo.getMarca()+ " "+ vehiculo.getModelo());
		}
		
	}
	
	

	
	
	
	
}
