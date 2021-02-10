package test;

import clases.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frigorico f= new Frigorico();
		
		ProdNacional p = new ProdNacional(456, "bife lomo", 100, true);
		ProdNacional p1 = new ProdNacional(456, "torta frita", 50, false);
		ProdNacional p2 = new ProdNacional(416, "soja", 80, true);

		f.agregarProducto(p);
		f.agregarProducto(p1);
		f.agregarProducto(p2);
		
		VendedorJunior v1= new VendedorJunior("Juan", 3334, 20000, "3/4/2020", "Inutilisima");
		VendedorJunior v2= new VendedorJunior("Carla", 3335, 20000, "3/5/2020", "PaulinaCocina");
		VendedorSenior v3= new VendedorSenior("Pedro", 1250, 30000, "3/4/2018", 3);
		VendedorSupervisor v4= new VendedorSupervisor("Andrea", 1000, 50000, "3/1/2017", 3);
		
		f.agregarEmpleado(v1, 0);
		f.agregarEmpleado(v2, 1);
		f.agregarEmpleado(v3, 2);
		f.agregarEmpleado(v4, 3);
		
		Pais pais1= new Pais("Argentina");
		Pais pais2= new Pais ("EEUU");
		Pais pais3= new Pais("Japon");
		Pais pais4= new Pais("China");
		
		f.agregarPais(pais1, 0);
		f.agregarPais(pais2, 1);
		f.agregarPais(pais3, 2);
		f.agregarPais(pais4, 3);

	
				
		Cliente c1= new Cliente("Sa", 3345, 5443, pais1);
		Cliente c2= new Cliente("rrhermanos", 5555,555343, pais2);
		Cliente c3= new Cliente("razonSocial", 5454, 787687876, pais3);
		Cliente c4= new Cliente("razonSocial2",545722, 12344354, pais4);

		//Abro pedido 
		Pedido ped1= new Pedido(v1, c1);
		Pedido ped2= new Pedido(v3, c2);
		Pedido ped3= new Pedido(v3, c2);
		Pedido ped4= new Pedido(v4, c4);
		
		//Cargo Pedidos con item de compra
		
		ped1.agregarItem(p1, 3);
		ped1.agregarItem(p2, 5);
		
		ped2.agregarItem(p1, 5);
		ped2.agregarItem(p, 2);
		
		ped3.agregarItem(p2, 5);
		ped3.agregarItem(p, 10);

		ped4.agregarItem(p1, 10);
		ped4.agregarItem(p2, 30);
		
		
		// agregoPedidos a Frigorifico
		
		f.agregarPedido(ped1);
		f.agregarPedido(ped2);
		f.agregarPedido(ped3);
		f.agregarPedido(ped4);
		
		//Pruebo primer método 
		//Desarrollar un método llamado pedidoMasCaro, que imprima el pedido de mayor importe.

		
		Pedido pMasCaro= f.pedidoMasCaro();
		System.out.println(pMasCaro);
		
		
		
		//Pruebo metodo informarCantPedidos
	
			f.informarCantPedidos();
			
		// Pruebo método costoTotal de sueldos
			
			double sueldos= f.costoTotal();
			System.out.println(sueldos);
	}

}
