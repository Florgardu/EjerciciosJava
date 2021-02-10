package clases;

import java.util.ArrayList;

public class Gym {
	
	private String nombre;
	private ArrayList<Socio>listaSocios;
	
	
	
	public Gym(String nombre) {
		this.nombre = nombre;
		this.listaSocios = new ArrayList<Socio>();
	}



	public String getNombre() {
		return nombre;
	}



	public ArrayList<Socio> getListaSocios() {
		return listaSocios;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setListaSocios(ArrayList<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}



	@Override
	public String toString() {
		return "Gym [nombre=" + nombre + ", listaSocios=" + listaSocios + "]";
	} 
	
	public Socio buscarSocio(String dni) {
		Socio socioGym = null;
		int tope = this.cantidadDeSocios();
		int contador = 0;
		Socio socioEnLista;

		while (contador < tope && socioGym == null) {
			socioEnLista = listaSocios.get(contador);
			if (socioEnLista.getDni().equals(dni)) {
				socioGym = socioEnLista;
			} else {
				contador++;
			}

		}

		return socioGym;

	}
	
	public int cantidadDeSocios (){
		
		int cantidadSocios; 
		
		return cantidadSocios= this.listaSocios.size();
		
	}
	
	public Socio inscribirSocio(String dni, String nombre) {
		Socio socioParaInscribir;

		socioParaInscribir = this.buscarSocio(dni);
		if (socioParaInscribir == null) {
			socioParaInscribir = new Socio(dni, nombre);
			listaSocios.add(socioParaInscribir);
			System.out.println("Socio creado con exito");
		} else {
			System.out.println("El socio ya existe");
		}

		return socioParaInscribir;
		
	}

	
	public void ponerMoroso (String dni) {
		Socio socioMoroso;
		
		socioMoroso= buscarSocio(dni);
		if (socioMoroso!=null && socioMoroso.getDeuda()>0) {
			socioMoroso.setEstadoDeuda(Estado.MOROSO);
			System.out.println("Se pudo cambiar a moroso");
		} else {
			System.out.println("No se pudo, no existe o no tiene deuda");
		}
		
	}
	
	
	public void quitarSocio (String dni) {
		Socio socioBuscado;
		
		socioBuscado = this.buscarSocio(dni);
		if (socioBuscado != null && socioBuscado.getDeuda() <= 0) {
			listaSocios.remove(socioBuscado);
			System.out.println("Socio dado de baja");
		} else {
			System.out.println("No se pudo este socio tenia deuda o no existe");
		}
	}
	
	public void listarDeudores (int montoDeuda, Categoria tipoCategoria) {
		
		 for (Socio socio : listaSocios) {
			if (socio.getDeuda()>montoDeuda && socio.getTipoCategoriaPertenece().equals(tipoCategoria)) {
				System.out.println(socio);
			}
			
		}
	}
	
	
	
}
