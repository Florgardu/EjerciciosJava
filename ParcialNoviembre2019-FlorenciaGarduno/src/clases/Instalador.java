package clases;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;	

import java.util.ArrayList;
public class Instalador {

	private int capacidadEnMB;
	private ArrayList<Aplicacion> listaAplicaciones;

	public Instalador(int capacidadEnMB) {
		super();
		this.capacidadEnMB = capacidadEnMB;
		this.listaAplicaciones = new ArrayList<Aplicacion>();

	}

	public int getCapacidadEnMB() {
		return capacidadEnMB;
	}

	public ArrayList<Aplicacion> getListaAplicaciones() {
		return listaAplicaciones;
	}

	public void setCapacidadEnMB(int capacidadEnMB) {
		this.capacidadEnMB = capacidadEnMB;
	}

	public void setListaAplicaciones(ArrayList<Aplicacion> listaAplicaciones) {
		this.listaAplicaciones = listaAplicaciones;
	}

	// NO TOCAR
	public boolean esFechaMayor(String d1, String d2) {
		boolean resul = false;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date1 = sdf.parse(d1);
			Date date2 = sdf.parse(d2);

			if (date1.after(date2)) {
				resul = true;
			}

		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return resul;
	}
	
	public Aplicacion buscarApp(String nombre) {
		Aplicacion app = null;
		Aplicacion appEnLista;
		int contador = 0;

		while (contador < this.listaAplicaciones.size() && app == null) {
			appEnLista = listaAplicaciones.get(contador);
			if (appEnLista.getNombre().equals(nombre)) {
				app = appEnLista;
			} else {
				contador++;
			}

		}

		return app;

	}
	
	public int getMemoriaDisponible() {

		int memoriaDisponible;
		int sumatoriaMemoria = 0;

		for (Aplicacion aplicacion : listaAplicaciones) {
			sumatoriaMemoria = aplicacion.getTamañoMB() + sumatoriaMemoria;
		}

		memoriaDisponible = this.capacidadEnMB - sumatoriaMemoria;
		return memoriaDisponible;
	}
	
	public boolean hayEspacioEnMemoria (int tamañoApp) {
		boolean hayLugar=false;
		
		if (this.getMemoriaDisponible()>=tamañoApp) {
			hayLugar=true;
		} 
			
		return hayLugar;
		
	}

	public void instalar(String nombre, int tamañoMB, String fecha) {
		Aplicacion app;

		if (this.hayEspacioEnMemoria(tamañoMB)) {
			app = this.buscarApp(nombre);
			if (app == null) {
				app = new Aplicacion(nombre, tamañoMB, fecha);
				this.listaAplicaciones.add(app);
				System.out.println("Se instalo correctamente la nueva app");
			} else {
				intentarActualizarApp(nombre, tamañoMB, fecha, app);
			}
		} else {
			app = this.buscarApp(nombre);
			if (app == null) {
				System.out.println("No hay lugar para instalar una nueva app");
			} else {
				if (tamañoMB <= app.getTamañoMB()) { // ERROR
					intentarActualizarApp(nombre, tamañoMB, fecha, app);
				} else {
					System.out.println("No hay espacio para actualizar");
				}
			}

		}

	}

	private void intentarActualizarApp(String nombre, int tamañoMB, String fecha, Aplicacion app) {
		if (esFechaMayor(fecha, app.getFecha())) {
			this.listaAplicaciones.remove(app);
			app = new Aplicacion(nombre, tamañoMB, fecha);
			this.listaAplicaciones.add(app); // ERROR!!
			System.out.println("Se actualizo la app");
		} else {
			System.out.println("no se actualizo porque la fecha no es mayor a la existente");
		}
	}
			
}
