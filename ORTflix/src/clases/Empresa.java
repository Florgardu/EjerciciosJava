package clases;

import java.util.ArrayList;


public class Empresa {

	private ArrayList<Cliente> listaClientes; 
	private ArrayList<Pelicula> listaPelisDisponibles;
	
	
	public Empresa() {	
		this.listaClientes =  new ArrayList<Cliente>();
		this.listaPelisDisponibles = new ArrayList<Pelicula>();
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public ArrayList<Pelicula> getListaPelisDisponibles() {
		return listaPelisDisponibles;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void setListaPelisDisponibles(ArrayList<Pelicula> listaPelisDisponibles) {
		this.listaPelisDisponibles = listaPelisDisponibles;
	}
	
	public void agregarPeliculasDisponibles (Pelicula pelicula) {
		this.listaPelisDisponibles.add(pelicula);
	}
	
	public void agregarClientes (Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	
	
	private Cliente buscarCliente(String dni) {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : listaClientes) {
			if (cliente.getDni().equals(dni)) {
				clienteEncontrado = cliente;
			}
		}
		return clienteEncontrado;

	}

	private Pelicula buscarPelicula(String nombrePelicula) {
		Pelicula peliculaEncontrada = null;
		for (Pelicula pelicula : listaPelisDisponibles) {
			if (pelicula.getNombre().equals(nombrePelicula)) {
				peliculaEncontrada = pelicula;
			}
		}
		return peliculaEncontrada;

	}

	public Resultados verPelicula(String dni, String nombrePelicula) {

		// otra opción es que enumere los resultados como <enum> devuelve un Resultado
		// que es un enum.
		// crear la clase enum Resultado.

		Cliente clienteEncontrado = buscarCliente(dni);

		if (clienteEncontrado == null) {
			return Resultados.CLIENTE_INEX;

		}

		Pelicula peliculaEncontrada = buscarPelicula(nombrePelicula);

		if (peliculaEncontrada == null) {
			return Resultados.CONT_INEX;

		}

		double saldoCliente = clienteEncontrado.obtenerSaldo();
		if (saldoCliente > 0) {
			return Resultados.CLI_DEUDOR;

		}

		Categoria categoriaPelicula = peliculaEncontrada.getCategoriaPelicula();
		if (categoriaPelicula == Categoria.PREMIUM) {
			if (clienteEncontrado.getTipoSuscripcion().equals(Categoria.STANDART)) {
				return Resultados.CONT_NO_DISPO;

			}
		}

		clienteEncontrado.agregarPeliculaVista(peliculaEncontrada);
		return Resultados.ALQUILER_OK;

	}
	
	
	
	
	
	
}
