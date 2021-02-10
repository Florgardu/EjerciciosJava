import java.util.ArrayList;

public class Restaurant {

	private ArrayList<Empleado> empleados;
	private Mesa[] mesas = new Mesa[26];
	private Mozo[] mozos = new Mozo[20];
	private ArrayList<Pedido> pedidos;
	private Menu menuDelDia;

	public Restaurant() {
		super();
		this.empleados = new ArrayList();
		this.mesas = mesas;
		this.mozos = mozos;
		this.pedidos = new ArrayList();
	}

	// Desarrollar un método llamado pedidosPorCocinero que dado el nro de legajo de
	// un cocinero,
	// informe todos los pedidos que tenga a su cargo.

	public void pedidosPorCocinero(int numeroLegajo) {
		int cantidadPedidosAsignados = 0;
		for (Pedido p : this.pedidos) {
			if (p.perteneceAlCocinero(numeroLegajo)) {
				cantidadPedidosAsignados++;
			}

		}

		System.out.println("El cocinero con legajo " + numeroLegajo + " tiene esta cantidad de pedidos "
				+ cantidadPedidosAsignados);

	}
	
	
	// ) Desarrollar un método llamado liberarMesa que dado un número de mesa, informe el importe a
// 	pagar de acuerdo a lo pedido por la mesa y la libere.
	
	
	public double liberarMesa (int numeroMesa) {
		double importePagar=0;
		
		
		Mesa mesaALiberar= this.buscarMesa(numeroMesa);
		Pedido pedidoDeMesa= this.buscarPedidoPorMesa(mesaALiberar);
		
		if (pedidoDeMesa!=null) {
			importePagar= pedidoDeMesa.calcularImporte();
		} else {
			System.out.println("Ese pedido no existe para esa mesa");
		}
					
	
		if (mesaALiberar!=null) {
			mesaALiberar.setEstaLibre(true);
		} else {
			System.out.println("Mesa ingresada no existe");
		}
		
		return importePagar;
		
		
	}
	
	private Pedido buscarPedidoPorMesa(Mesa mesa) {
		Pedido pedidoDeMesa=null;
		for (Pedido p : this.pedidos) {
			if (p.getMesa().equals(mesa)) {
				pedidoDeMesa=p;
			}
		}
		return pedidoDeMesa;
	}
	
	
	// pedidos por mozos
	
	public void informarCantPedidos () {
		Mozo mozo;
		Mesa mesa;
		int nroMozo;
		int nroMesa;
		int [][] tabla = new int [this.mozos.length][this.mesas.length];
		
		for (Pedido p : this.pedidos) {
			mozo=p.getMozo();
			nroMozo= obtenerNroMozo(mozo);
			mesa=p.getMesa();
			nroMesa= obtenerNumeroDeMesa(mesa); 
			if (nroMozo!=-1 && nroMesa!=-1) {
				tabla[nroMozo][nroMesa]++;
			}
		}
		
	
		mostrarMatriz(tabla); 
		
		
	}
	
	
	private void mostrarMatriz (int [][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ "\t\t");
				
			}
			System.out.println();
		}
		
	}
	
	
	private int obtenerNumeroDeMesa (Mesa mesa) {
		int numeroMesa=-1;
		for (int i = 0; i < mesas.length; i++) {
			if (this.mesas[i]==mesa) {
				numeroMesa=i;
			}
		}
		return numeroMesa;
		
	}
	
	
	private int obtenerNroMozo(Mozo m) {
		int numeroMozo=-1;
		
		for (int j = 0; j < mozos.length; j++) {
			if (this.mozos[j]==m) {
				numeroMozo=j;
			}
		}
		
		return numeroMozo;
	}
	
	
	
	
	private Mesa buscarMesa (int numeroMesa) {
		Mesa mesaBuscada=null;
		for (Pedido p : this.pedidos) {
			if (p.getMesa().getNumero()==numeroMesa) {
				mesaBuscada=p.getMesa();
			}
		}
		
		return mesaBuscada;
	}
	

	public void agregarMenuDelDia(Menu menu) {
		this.menuDelDia = menu;
	}

	public void verListaPedidos() {
		System.out.println(this.pedidos);
	}

	public void cargarMozos(Mozo mozo, int posicion) {
		mozos[posicion] = mozo;

	}

	public void cargarMesas(Mesa mesa, int posicion) {
		mesas[posicion] = mesa;
	}

	public void procesarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public Mesa[] getMesas() {
		return mesas;
	}

	public Mozo[] getMozos() {
		return mozos;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void setMesas(Mesa[] mesas) {
		this.mesas = mesas;
	}

	public void setMozos(Mozo[] mozos) {
		this.mozos = mozos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
