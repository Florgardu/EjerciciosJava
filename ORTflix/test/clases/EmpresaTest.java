package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpresaTest {

	@Test
	void testVerPelicula() {
		Empresa empresa = new Empresa();
		// creo cliente no premium
		Cliente clienteStandard = new Cliente("1", Categoria.STANDART);
		
		// creo cliente premium
		Cliente clientePremium = new Cliente("2", Categoria.PREMIUM);
		
		// creo cliente con deuda
		Cliente clienteConDeuda = new Cliente("3", Categoria.STANDART);
		clienteConDeuda.setDeuda(100);
		
		// los agrego
		empresa.agregarClientes(clienteStandard);
		empresa.agregarClientes(clientePremium);
		empresa.agregarClientes(clienteConDeuda);
		
		// creo peliculas premium y no premium
		
		Pelicula pelicula1 = new Pelicula("kill bill", Categoria.PREMIUM);
		Pelicula pelicula2 = new Pelicula("titanic", Categoria.STANDART);
		
		
		// las agrego a la empresa
		
		empresa.agregarPeliculasDisponibles(pelicula1);
		empresa.agregarPeliculasDisponibles(pelicula2);

		
		
		// pruebo ver pelicula para los distintos errores
		assertEquals("CLIENTE_INEXISTENTE",empresa.verPelicula("33", "kill bill"));
		
		assertEquals("CONTENIDO_INEXISTENTE",empresa.verPelicula("2", "kill gill"));
		

		assertEquals("CLIENTE_DEUDOR",empresa.verPelicula("3", "kill bill"));
		
		assertEquals("CONTENIDO_NO_DISPONIBLE",empresa.verPelicula("1", "kill bill"));
		
		
		// pruebo ver pelicula ok
		assertEquals("ALQUILER_OK",empresa.verPelicula("2", "kill bill"));
		
		// ver historial de peliculas vistas
		assertEquals(1, clientePremium.getPeliculasVistas().size());
		assertEquals(0, clienteConDeuda.getPeliculasVistas().size());
		assertEquals(0, clienteStandard.getPeliculasVistas().size());

		
	}

}
