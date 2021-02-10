package ejercicioSucursales;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creo un comercio
		
		Comercio miComercio= new Comercio(2345, "Sociedad anonima");
	
		// creo productos 
		
		SectorCasa sector1= new SectorCasa(122, "comedor", 10);
		
		Mueble silla = new Mueble("123","madera italiana", 1000, 15, "pitiribi", sector1);
		
		Electrodomestico microondas= new Electrodomestico("222", "super micro", 5000, 3, 300);
		
		Bazar vasos = new Bazar("445","vasos ", 400, 8, "verde", 4);
		
		Bazar platos = new Bazar("245","platos ",600, 10, "rojo", 6);

		// le agrego productos al comercio 
		
		miComercio.agregarProductosAComercio(silla);
		miComercio.agregarProductosAComercio(microondas);
		miComercio.agregarProductosAComercio(vasos);
		miComercio.agregarProductosAComercio(platos);

		// le creo 3 sucursales a mi comercio - eran 10 pero hago 3 para probar
		
		miComercio.cargar10Sucursales();
		
		
		// hago 5 clientes 
		
		Cliente cliente1= new Mayorista("12", "SRL", 5, 30);
		Cliente cliente2= new Mayorista("13", "SA", 5, 50);
		Cliente cliente3= new Minorista("14", "SRL", 5);
		Cliente cliente4= new Minorista("15", "SA", 10);
		Cliente cliente5= new Mayorista("52", "SRL", 10, 100);


		// tengo mis sucursales
		
		Sucursal sucursal1= miComercio.dameSucursal(0);
		Sucursal sucursal2= miComercio.dameSucursal(1);
		Sucursal sucursal3= miComercio.dameSucursal(2);


		// ahora entra un nuevo pedido - lo crea el comercio
		
		Pedido pedido1=	miComercio.generarPedido(cliente1, sucursal1.getCodigo(), 1);
		Pedido pedido2=	miComercio.generarPedido(cliente2, sucursal2.getCodigo(), 2);
		Pedido pedido3=	miComercio.generarPedido(cliente2, sucursal2.getCodigo(), 2);
		Pedido pedido4=	miComercio.generarPedido(cliente2, sucursal2.getCodigo(), 5);

		
		
		// ahora cargo el pedido de productos
		
		pedido1.agregarProductos(platos, 1);
		pedido1.agregarProductos(vasos, 2);
		pedido2.agregarProductos(silla, 2);

		
		pedido1.calcularImporteDelPedido();
		pedido2.calcularImporteDelPedido();
		
		System.out.println(pedido1.calcularImporteDelPedido());
		System.out.println(pedido2.calcularImporteDelPedido());

		
		miComercio.mostrarStockMenosDiez();
		
		miComercio.mostrarPedidosXSucursal();

	}

}
