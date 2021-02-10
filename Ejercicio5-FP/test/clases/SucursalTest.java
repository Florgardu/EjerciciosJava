package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SucursalTest {
	
	private String MSG_ERROR = "No hay stock del producto requerido ni en esta sucursal ni en ninguna de las cercanas";
	private String MSG_SUCURSAL = "El producto que desea adquirir se encuentra en la Sucursal corriente 1459";
	private String VENTA_OK = "VentaProducto realizada";

	@Test
	void testVender() {
		Producto leche= new Producto("leche", 100); 
		Producto cafe= new Producto("cafe", 50); 
		Producto pan= new Producto("pan", 200); 
		Producto yogurt = new Producto("yogurt", 200); 
		
		Sucursal sucursal1 = new Sucursal(1, "acevedo 652");
		Sucursal sucursal2 = new Sucursal(2, "corriente 1459");
		Sucursal sucursal3 = new Sucursal(3, "JB Justo 666");

		sucursal1.agregarProductoAlaSucursal(leche);
		sucursal1.agregarProductoAlaSucursal(cafe);
		
		sucursal2.agregarProductoAlaSucursal(pan);
		
		sucursal3.agregarProductoAlaSucursal(yogurt);

		sucursal1.agregarSucursalCerca(sucursal2);
		
		// valido mensajes de error para varios casos
		assertEquals(MSG_ERROR, sucursal1.vender(yogurt, 1));
		assertEquals(MSG_SUCURSAL, sucursal1.vender(pan, 1));
		assertEquals(MSG_ERROR, sucursal1.vender(pan, 500));
		assertEquals(MSG_ERROR, sucursal1.vender(leche, 500));
		
		// valido que las ventas descuenten bien el stock
		assertTrue(sucursal1.hayStock(leche, 99));
		assertEquals(VENTA_OK, sucursal1.vender(leche, 99));
		assertTrue(sucursal1.hayStock(leche, 1));
		assertEquals(VENTA_OK, sucursal1.vender(leche, 1));
		assertFalse(sucursal1.hayStock(leche, 1));
		assertEquals(MSG_ERROR, sucursal1.vender(leche, 1));
		
		assertTrue(sucursal1.hayStock(cafe, 1));
		assertEquals(VENTA_OK, sucursal1.vender(cafe, 1));
		
		// TODO: probar cantidad de productos vendidos por Sucursal
		assertEquals(101, sucursal1.cantidadTotalProductosVendidos());
		assertEquals(0, sucursal2.cantidadTotalProductosVendidos());
		
		assertEquals(100, sucursal1.cantidadProductosVendidosDe("leche"));
		assertEquals(1, sucursal1.cantidadProductosVendidosDe("cafe"));
		
		
	}

}
