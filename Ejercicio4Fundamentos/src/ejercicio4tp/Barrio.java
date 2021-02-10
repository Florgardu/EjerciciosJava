package ejercicio4tp;

import java.util.ArrayList;

public class Barrio {
	
	private String nombre;
	private ArrayList<Propiedades> listaPropiedadesPorBarrio;   //una lista siempre esta en plural
	
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		this.listaPropiedadesPorBarrio = new ArrayList<Propiedades>();
		
	}


	public String getNombre() {
		return nombre;
	}


	public ArrayList<Propiedades> getListaPropiedadesPorBarrio() {
		return listaPropiedadesPorBarrio;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setListaPropiedadesPorBarrio(ArrayList<Propiedades> listaPropiedadesPorBarrio) {
		this.listaPropiedadesPorBarrio = listaPropiedadesPorBarrio;
	} 
	
	
	//AGREGAR ALGO A UNA LISTA CON VALIDACIÓN DE QUE NO ESTE
	public void agregarPropiedad(Propiedades propiedad) {
		int tope = listaPropiedadesPorBarrio.size() - 1;
		int contador = 0;
		int posiBusc = 0;
		boolean encontre = false;

		while (!encontre && contador <= tope) {
			if (listaPropiedadesPorBarrio.get(contador).getDireccion().equals(propiedad.getDireccion())) {
				encontre = true;
				posiBusc = contador;

			}
			contador++;
		}

		if (!encontre) {
			listaPropiedadesPorBarrio.add(propiedad);
		} else {
			System.out.println("Encontre la propiedadd buscada, no se puede agregar porque ya esta agregada");
			System.out.println("Este se encuentra en la posicion:" + posiBusc);
		}

	}
	
	///QUITAR PROPIEDAD DE LA LISTA
	// todo el while se puede hacer en una función de buscarPropiedad
	
	public void quitarPropiedad(Propiedades propiedad) {
		int tope = listaPropiedadesPorBarrio.size() - 1;
		int contador = 0;
		int posiBusc = 0;
		boolean encontre = false;

		while (!encontre && contador <= tope) {
			if (listaPropiedadesPorBarrio.get(contador).getDireccion().equals(propiedad.getDireccion())) {
				encontre = true;
				posiBusc = contador;

			}
			contador++;
		}

		if (encontre) {
			listaPropiedadesPorBarrio.remove(posiBusc);
		} else {
			System.out.println("No Encontre la propiedad buscada, no se puede agregar porque ya esta agregada");
		}

	}
	
	
	
	public void mostrarPropiedadesXtipo (String tipo){
		
		for (Propiedades propiedad: listaPropiedadesPorBarrio)
			if (propiedad.getTipo().equals(tipo)) {
				System.out.println("Dirección: " + propiedad.getDireccion() + " " + "Valor de venta: " + propiedad.getPrecio());
				
			}
		
	}
	
	
public void mostrarPropiedades (){
		
		for (Propiedades propiedad: listaPropiedadesPorBarrio)
				System.out.println("Dirección: " + propiedad.getDireccion() + " " + "Valor de venta: " + propiedad.getPrecio());
				
			}


@Override
public String toString() {
	return "Barrio [nombre=" + nombre + ", listaPropiedadesPorBarrio=" + listaPropiedadesPorBarrio + "]";
}
		
	}
	


