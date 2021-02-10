package clases;

import java.util.ArrayList;

public class Sucursal {

	private int numeroSucursal;
	private String direccion;
	private ArrayList<Producto> listaProductos;
	private ArrayList<Sucursal> listaSucursalesCercanas;
	private ArrayList<VentaProducto> listaProductosVendidos;

	public Sucursal(int numeroSucursal, String direccion) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.listaProductos = new ArrayList<Producto>();
		this.listaSucursalesCercanas = new ArrayList<Sucursal>();
		this.listaProductosVendidos = new ArrayList<VentaProducto>();
	}
	
	
	public void agregarProductoAlaSucursal (Producto producto) {
		this.listaProductos.add(producto);
	}
	
	
	public void agregarSucursalCerca (Sucursal sucursalCercana) {
		this.listaSucursalesCercanas.add(sucursalCercana);
	} 
	

	@Override
	public String toString() {
		return "Sucursal [numeroSucursal=" + numeroSucursal + ", direccion=" + direccion + ", listaProductos="
				+ listaProductos + "]";
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setNumeroSucursal(int numeroSucursal) {
		this.numeroSucursal = numeroSucursal;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	private Producto buscarProducto(Producto productoBuscado) {
		int contador = 0;
		boolean encontreProducto = false;
		

		while (contador < listaProductos.size() && !encontreProducto) {
			Producto productoEnLista = listaProductos.get(contador);
			if (productoEnLista.equals(productoBuscado)) {
				encontreProducto = true;
				productoBuscado = productoEnLista;
			}
			contador++;
		}
		if (!encontreProducto) {
			productoBuscado=null;
		}
		return productoBuscado;

	}

	public boolean hayStock(Producto productoConsultado, int cantidad) {
		Producto productoEncontrado = buscarProducto(productoConsultado);
		boolean hayStock = false;
		if (productoEncontrado != null) {
			if (productoEncontrado.getStock() >= cantidad) {
				hayStock = true;
			}
		}

		return hayStock;
	}
	
	public String vender(Producto productoVender, int cantidadProducto) {
		boolean hayStock = hayStock(productoVender, cantidadProducto);
		String respuesta = "";
		int contador = 0;
		boolean encontreStock = false;
		if (hayStock) {
			productoVender.bajarStock(cantidadProducto);
			VentaProducto nuevaVenta= new VentaProducto (productoVender, cantidadProducto);
			this.listaProductosVendidos.add(nuevaVenta);
			respuesta = "VentaProducto realizada";

		} else {
			while (contador < listaSucursalesCercanas.size() && !encontreStock) {
				Sucursal sucursalCercana = listaSucursalesCercanas.get(contador);

				if (sucursalCercana.hayStock(productoVender, cantidadProducto)) {
					encontreStock = true;
					String direccion = sucursalCercana.getDireccion();
					respuesta= "El producto que desea adquirir se encuentra en la Sucursal " + direccion; 
				} else {
					respuesta = "No hay stock del producto requerido ni en esta sucursal ni en ninguna de las cercanas";
				}

				contador++;

			}

		}
		return respuesta;
	}
	
	public int cantidadTotalProductosVendidos() {
		int acumuladorVentas = 0;
		for (VentaProducto ventaProducto : listaProductosVendidos) {
			acumuladorVentas += ventaProducto.getCantidad();
		}
		return acumuladorVentas;
	}
	
	public int cantidadProductosVendidosDe(String nombreProducto) {
		int acumuladorVentas = 0;
		for (VentaProducto ventaProducto : listaProductosVendidos) {
			if(ventaProducto.getProductoVendido().getNombre().equals(nombreProducto)) {
				acumuladorVentas += ventaProducto.getCantidad();
			}
		}
		return acumuladorVentas;
	}

	
}
	
	


