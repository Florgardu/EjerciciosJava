package ejercicio4tp;

import java.util.ArrayList;


public class Inmobiliaria {
	
	private String nombre; 
	private ArrayList<Barrio> listaBarrios;
	
	
	public Inmobiliaria(String nombre) {
		super();
		this.nombre = nombre;
		this.listaBarrios = new ArrayList<Barrio>();
	}


	public String getNombre() {
		return nombre;
	}


	public ArrayList<Barrio> getListaBarrios() {
		return listaBarrios;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setListaBarrios(ArrayList<Barrio> listaBarrios) {
		this.listaBarrios = listaBarrios;
	}
	
	
	public Barrio obtenerBarrioMaxProp() {
		Barrio barrioMax = null;
		int max = 0;

		for (Barrio barrio : listaBarrios)
			if (barrio.getListaPropiedadesPorBarrio().size() > max) {
				max= barrio.getListaPropiedadesPorBarrio().size();
				barrioMax = barrio;
			}

		return barrioMax;
		
	}

	// recorrer todos los barrios y despues todas las propiedades (Matris)
	public void mostrarPropiedades () {
		
		for (Barrio barrio : listaBarrios) {
			barrio.mostrarPropiedades();
			
			}
		
	}
	

	public void agregarBarrio(Barrio barrio) {
		int tope = listaBarrios.size() - 1;
		int contador = 0;
		int posiBusc = 0;
		boolean encontre = false;

		while (!encontre && contador <= tope) {
			if (listaBarrios.get(contador).getNombre().equals(barrio.getNombre())) {
				encontre = true;
				posiBusc = contador;

			}
			contador++;
		}

		if (!encontre) {
			listaBarrios.add(barrio);
		} else {
			System.out.println("Encontre el barrio buscada, no se puede agregar porque ya esta agregada");
			System.out.println("Este se encuentra en la posicion:" + posiBusc);
		}

	}


	@Override
	public String toString() {
		return "Inmobiliaria [nombre=" + nombre + ", listaBarrios=" + listaBarrios + "]";
	}
	
	
	
	
}
