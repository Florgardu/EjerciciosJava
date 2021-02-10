package ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VueloTest {

	@Test
	void testReservaVuelo() {
		Vuelo vuelo = new Vuelo ("Aeroparque", "Miami" , "01/06/2018", 1234, 250);
		
		
		vuelo.setAsientosOcupados(15);
		assertEquals(vuelo.getAsientosOcupados(), 15);
		
		assertFalse(vuelo.reservar(250));
		assertEquals(vuelo.getAsientosOcupados(), 15);
		
		assertTrue(vuelo.reservar(100));
		assertEquals(vuelo.getAsientosOcupados(), 115);
		
		assertFalse(vuelo.liberararAsientos(25000));
		assertEquals(vuelo.getAsientosOcupados(), 115);
		
		assertTrue(vuelo.liberararAsientos(100));
		assertEquals(vuelo.getAsientosOcupados(), 15);
		
		assertEquals("Vuelo [origen=Aeroparque, destino=Miami, fecha=01/06/2018, numero=1234, capacidadTotal=250, asientosOcupados=15]", vuelo.toString());
	
		
	}

}
