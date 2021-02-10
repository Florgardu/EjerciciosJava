package ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutomovilTest {

	@Test
	void testCargarCombustible() {
		Automovil automovil = new Automovil("Ford", "Fieta", "AZS232");
		assertEquals(0, automovil.getCantidadCombustible());
		automovil.setCapacidadTotalCombustible(60);
		assertFalse(automovil.cargarCombustible(100));
		assertTrue(automovil.cargarCombustible(50));
		assertEquals(50, automovil.getCantidadCombustible());
	}
	
	@Test
	void testViajar() {
		Automovil automovil = new Automovil("Ford", "Fieta", "AZS232");
		assertFalse(automovil.viajar(10));
		
		
		automovil.setCapacidadTotalCombustible(60);
		assertTrue(automovil.cargarCombustible(50));
		automovil.setKmPorLitro(10);
		
		automovil.viajar(10);
		assertEquals(49, automovil.getCantidadCombustible());
		
		automovil.viajar(20);
		assertEquals(47, automovil.getCantidadCombustible());
	}

}
