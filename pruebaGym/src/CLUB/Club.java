package CLUB;

import java.util.ArrayList;

public class Club {
	private String nombre;
	ArrayList<Socio> socios;
	ArrayList<Actividad> actividades;

	public Club(String nombre) {
		setNombre(nombre);
		this.socios = new ArrayList<Socio>();
		this.actividades = new ArrayList<Actividad>();
	}

	public Socio buscarSocio(String dni) {
		int i = 0;
		Socio socioEncontrado = null;
		Socio socio;

		while (i < this.socios.size() && socioEncontrado == null) {
			socio = this.socios.get(i);
			if (socio.getDni().equals(dni)) {
				socioEncontrado = socio;
			} else {
				i++;
			}
		}
		return socioEncontrado;

	}

	/*
	 * En la clase ClubSocial desarrolla un método, montoAbonar 1. Recibe un dni 2.
	 * Si existe, muestra los datos y el costo TOTAL de las actividades que realiza
	 * 3. Si no existe muestra un mensaje de error
	 */
	public void montoAbonar(String dni) {
		Socio s;

		s = buscarSocio(dni);
		if (s != null) {
			s.mostrarActividades();
		} else {
			System.out.println("Error");
		}

	}

	/*
	 * En la case ClubSocial desarolla un metodo obtenerPromedioActividades 1.
	 * Muestra el promedio de actividades que tienen los socios (si hay 10 socios y
	 * en total suman 39 actividades el promedio es 3,9)
	 */

	public void obtenerPromedioActividades() {
		int cantActividades = 0;
		int acumuloActividades = 0;
		int cantSocios = 0;
		double promedio = 0;

		for (Socio socio : socios) {
			cantActividades = socio.dameLaCantDeActividades();
			acumuloActividades += cantActividades;
			cantSocios++;
		}
		promedio = calcularPromedio(acumuloActividades, cantSocios);
		System.out.println("El promedio de actividades que tienen los socios es : " + promedio);
	}

	private double calcularPromedio(int acumulo, int cant) {
		double promedio = 0;
		promedio = acumulo / cant;
		return promedio;
	}

	/*
	 * En la clase ClubSocial desarrollar un metodo listarActividadesPosSocio 1. No
	 * recibe parametros 2. lista los datos de los socios y por cada socio, las
	 * actividades que realiza
	 */
	public void listarActividadesPosSocio() {
		for (Socio socio : socios) {
			socio.toString();
			socio.mostrarActividades();

		}
	}

	/*
	 * La explotación del método inscribirSocioEnActividad(...) de ClubSocial, que
	 * recibe el número de DNI de un socio y el nombre de una actividad. El método
	 * debe controlar que tanto el socio como la actividad sean válidos. Además de
	 * agregar —cuando sea posible— la actividad a las que el socio ya realiza, el
	 * método debe devolver un mensaje que indicará el resultado de la operación: 1.
	 * “El socio fue inscripto en la actividad”. 2. “El socio ya realiza esta
	 * actividad”. 3. “El socio no puede hacer más actividades pues su cupo de
	 * actividades está cubierto”. 4. “El socio tiene una deuda pendiente”. 5. “El
	 * socio no existe”. 6. “La actividad no existe”.
	 */
	public String inscribirSocioEnActividad(String dni, String nombreAct) {
		int resultado;
		String mostrar = null;

		resultado = inscipcionSocioAct(dni, nombreAct);
		switch (resultado) {
		case 1:
			mostrar = "El socio fue inscripto en la actividad";
			break;
		case 2:
			mostrar = "El socio ya realiza esta actividad ";
			break;
		case 3:
			mostrar = "El socio no puede hacer más actividades pues su cupo de actividades está cubierto";
			break;
		case 4:
			mostrar = "El socio tiene una deuda pendiente";
			break;
		case 5:
			mostrar = "El socio no existe";
			break;
		case 6:
			mostrar = "La actividad no existe";

			break;
		}

		return mostrar;

	}

	public int inscipcionSocioAct(String dni, String nombreAct) {
		Socio socio;
		Actividad act;
		int resultado = 0;

		Actividad a;
		socio = buscarSocio(dni);// busco al socio

		a = buscarActividad(nombreAct);// si esa actividad existe
		act = socio.buscarActividad(a); // si esa actividad la tiene el socio

		if (socio == null) {
			resultado = 5; // 5. “El socio no existe”.
		} else if (a == null) {
			resultado = 6; // 6. “La actividad no existe”.*/
		}
		if (act != null) {
			resultado = 2; // 2. “El socio ya realiza esta actividad”.
		} else if (!socio.tieneCupoDeActividades()) {
			resultado = 3; // 3. “El socio no puede hacer más actividades pues su cupo de actividades está
							// cubierto”.
		} else if (!socio.estaAlDia()) {
			resultado = 4;// 4. “El socio tiene una deuda pendiente”.
		} else {
			socio.agregarALaLista(act);
			resultado = 1; // 1. “El socio fue inscripto en la actividad”.
		}

		return resultado;
	}

	public Actividad buscarActividad(String nombreAct) {
		int i = 0;
		Actividad aEncontrada = null;
		Actividad a;

		while (i < this.actividades.size() && aEncontrada == null) {
			a = this.actividades.get(i);
			if (a.getNombreActividad().equals(nombreAct)) {
				aEncontrada = a;
			} else {
				i++;
			}
		}
		return aEncontrada;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarActividad(String nombre, double costo) {

		Actividad a;
		a = buscarActividad(nombre);

		if (a != null) {
			actividades.add(new Actividad(nombre, costo));
		}
	}

	public void agregarSocio(String nombre, String dni) {

		if (buscarSocio(dni) == null) {
			this.socios.add(new Socio(nombre, dni, 0));
		} else
			System.out.println("Socio ya existe");
	}

}
