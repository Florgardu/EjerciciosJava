package polimorfismoEj;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	protected ArrayList<Vehiculo> listaVehiculos; 

	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.listaVehiculos = new ArrayList<Vehiculo>();
		
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	public String mostrarDatos () {
		return "Matricula: " + this.matricula + "\nMarca:  " + this.marca +  "\nModelo:  " + this.modelo;
	}
	
	
	public void agregarALista (Vehiculo vehiculo) {
		this.listaVehiculos.add(vehiculo);
	}
	
	
	public void mostrarVehiculosEnLista () {
		for (Vehiculo vehiculo : listaVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
			System.out.println("");
		}
	}

}
