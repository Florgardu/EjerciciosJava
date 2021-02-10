package CLUB;

import java.util.ArrayList;

public class Socio {
	
	final static int MAX_ACT=4;
	private String dni;
	private String nombre;
	private double deuda;
	ArrayList<Actividad>actividadesInscriptas;
	
	
	
	public Socio(String dni, String nombre, double deuda) {
		
		setDni(dni);
		setNombre(nombre);
		setDeuda(0);
		this.actividadesInscriptas=new ArrayList<Actividad>();
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* La explotación del método agregarActividad(...) de Socio, que recibirá la instancia de una
	actividad para sumarla a las que el socio ya realiza, siempre y cuando esto sea factible. El
	método devolverá un número indicando el resultado de la operación:
	1. Si la operación fue exitosa.
	2. Si el socio ya realiza la actividad.--> !=null
	3. Si el socio ya tiene el cupo de actividades cubierto.--->tieneCupoDeActividades()
	4. Si el socio adeuda cuotas.--> estaAlDia()                                              */
	
		
	public int agregarActividad(Actividad actividad) {
		int resultado = 0;
		
		
		if(buscarActividad(actividad)!=null) {
			resultado=2; //2. Si el socio ya realiza la actividad.
		}else if(!tieneCupoDeActividades()) {
			resultado=3;//3. Si el socio ya tiene el cupo de actividades cubierto.
		}else if(!estaAlDia()) {
			resultado=4;//4. Si el socio adeuda cuotas.
		}else {
			resultado=1;//Si la operación fue exitosa.
			this.actividadesInscriptas.add(actividad);
	     }
		
			return resultado;
	}
	
	public boolean estaAlDia() {
		boolean resul=false;
		
		if(this.deuda<=0) {
			resul=true;
		}
		
		return resul;
	}


	 public boolean tieneCupoDeActividades() {
		boolean ok=false;
		int cant = this.actividadesInscriptas.size();
		
		if(cant<MAX_ACT) {
			ok=true;
		}
		
		return ok;
		
	}
	
	public int dameLaCantDeActividades() {
		return this.actividadesInscriptas.size();
	}
	
	public double calcularActividades() {
		
		double acu=0;
		
		for (Actividad actividad : this.actividadesInscriptas) {
			acu=acu+ actividad.getCosto();
		}
		return acu;
		
	}
	

	public void mostrarActividades() {
		
			
		for (Actividad actividad : this.actividadesInscriptas) {
			System.out.println(actividad.toString());
		}
		
		
	}
	
	
	
	
	public Actividad buscarActividad(Actividad actividad) {
		int i=0;
		Actividad aEncontrada=null;
		Actividad a;
		
		while(i<this.actividadesInscriptas.size()&& aEncontrada==null) {
			a = this.actividadesInscriptas.get(i);
			if (a.getNombreActividad().equals(actividad.getNombreActividad())) {
				aEncontrada = a;
			} else {
				i++;
			}
		}
		return aEncontrada;

		
		
	}


	public double getDeuda() {
		return deuda;
	}


	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}


	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + "]";
	}


	public void agregarALaLista(Actividad act) {
	
		this.actividadesInscriptas.add(act);
		
	}
	
}
