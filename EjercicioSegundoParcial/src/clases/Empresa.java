package clases;

import java.util.ArrayList;

public class Empresa {
	
	
	private ArrayList<Empleado> listaEmpleadosConfirmados;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public Empresa() {
		
		this.listaEmpleadosConfirmados = new ArrayList<Empleado>();
	}
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.listaEmpleadosConfirmados = new ArrayList<Empleado>();
	}

	
	@Override
	public String toString() {
		return "Empresa [listaEmpleadosConfirmados=" + listaEmpleadosConfirmados + ", nombre=" + nombre + "]";
	}

	public void confirmarAsistencia (String dni, String nombreyApellido, Cargo puestoEnEmpresa, Dieta preferenciaComida ) {
		Empleado empleadoBuscado = buscarEmpleadoEnListaFiesta(dni);
		if (empleadoBuscado == null) {
			empleadoBuscado= new Empleado(dni, nombreyApellido, puestoEnEmpresa, preferenciaComida); 
			listaEmpleadosConfirmados.add(empleadoBuscado);
			System.out.println("listo agregado");		
		} else {
			System.out.println("Ya estaba confirmado, no puede dos veces");
		}
		
	}
	
	
	
	private Empleado buscarEmpleadoEnListaFiesta (String dniEmpleado) {
		int contador=0; 
		Empleado empleadoBuscado = null;
		Empleado empleadoEnLista;
		
		while (contador< listaEmpleadosConfirmados.size() && empleadoBuscado==null) {
			empleadoEnLista= listaEmpleadosConfirmados.get(contador);
			if (empleadoEnLista.getDni().equals(dniEmpleado)) {
				empleadoBuscado=empleadoEnLista;
			} else {
				contador++;
			}
		}
		
		return empleadoBuscado;
	}
		
		
		
	
	public void anularAsistencia (String dni, Dieta tipoComida) {
		Empleado empleEnLista = buscarEmpleadoEnListaFiesta(dni);
		if (empleEnLista == null) {
			System.out.println("No existe");
			
		} else {
			this.listaEmpleadosConfirmados.remove(empleEnLista);
			System.out.println("Baja efectuada de lista de: " + tipoComida);
		}
		
		
	}
	
	public void cambiarTipoComida (String dni, Dieta tipoComida) {
		Empleado empleEnLista;
		
		empleEnLista= buscarEmpleadoEnListaFiesta(dni);
		if (empleEnLista==null) {
			System.out.println("No existe");
		} else {
			if (empleEnLista.getPreferenciaComida().equals(tipoComida)) {
				System.out.println("No se puede realizar el cambio");
			} else {
				empleEnLista.setPreferenciaComida(tipoComida);
				System.out.println("Cambio realizado satisfactoriamente");
			}
		}
			
	}
			
	
	public ArrayList<Empleado> mostrarListadoConfirmados (Dieta tipoComida) {
		ArrayList <Empleado>listaConfirmadosTipoComida = new ArrayList<Empleado>();
		
		for (Empleado empleado : this.listaEmpleadosConfirmados) {
			if (empleado.getPreferenciaComida().equals(tipoComida)) {
				listaConfirmadosTipoComida.add(empleado);
			}
		}
		
		System.out.println(listaConfirmadosTipoComida);
		return listaConfirmadosTipoComida;
	}
	
	public int cantidadConfirmadosFiesta () {
		return this.listaEmpleadosConfirmados.size();
	}
	
	

}
