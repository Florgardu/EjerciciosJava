package ejercicioCosechas;

import java.util.ArrayList;

public class EmpresaAgricola {

	private String nombre;
	private ArrayList<Cosecha> cosechas;
	private String columnas[];
	private int resultadosCosecha[][];

	public EmpresaAgricola(String nombre) {
		super();
		this.nombre = nombre;
		this.cosechas = new ArrayList<Cosecha>();
	}

	public void cargarResultados() {
		this.columnas = new String[] { "Cosecha", "Tipo cultivo", "Fecha", "Kilos", "Altura", "Humedad" };
		this.resultadosCosecha = new int[][] { { 1, 1, 20170101, 20, 200, 78 }, { 2, 1, 20170801, 19, 194, 85 },
				{ 3, 2, 20170901, 25, 262, 85 }, { 4, 2, 20171201, 12, 140, 64 }, { 5, 3, 20180101, 26, 217, 93 },
				{ 6, 3, 20180201, 34, 261, 91 } };
	}

	// El método procesarResultados()
	// carga los resultados en el ArrayList de cosechas usando la matriz
	// resultadosCosecha.

	public void procesarResultados() {

		for (int i = 0; i < resultadosCosecha.length; i++) {
			Cosecha cosecha = new Cosecha();
			cosecha.setNombre(String.valueOf(this.resultadosCosecha[i][0]));
			cosecha.setTipoCosecha(String.valueOf(this.resultadosCosecha[i][1]));
			cosecha.setFecha((String.valueOf(this.resultadosCosecha[i][2])));
			cosecha.setKilos(this.resultadosCosecha[i][3]);
			cosecha.setAltura(this.resultadosCosecha[i][4]);
			cosecha.setHumedad(this.resultadosCosecha[i][5]);
			this.cosechas.add(cosecha);
		}
	}

	public void mostrarArray() {
		for (Cosecha c : this.cosechas) {
			System.out.println(c);
		}
	}

	public void mostrarResultados() {
		this.mostrarColumnas();
		for (int i = 0; i < this.resultadosCosecha.length; i++) {
			for (int j = 0; j < this.resultadosCosecha[i].length; j++) {
				System.out.print(this.resultadosCosecha[i][j] + "\t\t");
			}
			System.out.println();
		}
	}

	private void mostrarColumnas() {
		for (int i = 0; i < columnas.length; i++) {
			System.out.print(this.columnas[i] + "\t\t");
		}
		System.out.println();
	}

	// tal que busque una cosecha enviada por parámetro, y retorne su resultado
	// incluyendo todos sus datos
	// en un string. Validar que la cosecha sea válida. Ejemplo:
	// Resultados de cosecha 3: Cultivo: 2 Fecha: 20170901 Kilos: 15 Altura: 199
	// Humedad: 85
	public String buscarCosecha(int cosecha) {
		String cosechaBuscada = null;

		if (cosecha > 0 && cosecha < this.cosechas.size()) {
			cosechaBuscada = this.cosechas.get(cosecha - 1).toString();
		} else {
			System.out.println("Numero de cosecha invalida");
		}

		return cosechaBuscada;

	}

	// tal que devuelva el nombre de la cosecha con más kilos.

	public String obtenerCosechaConMasKilos() {
		String nombreCosechaMasKg = null;
		int cosechaMax = 0;

		for (Cosecha c : this.cosechas) {
			if (c.getKilos() > cosechaMax) {
				cosechaMax = c.getKilos();
				nombreCosechaMasKg = c.getNombre();
			}
		}

		return nombreCosechaMasKg;

	}

	// tal que devuelva el nombre de la cosecha con más altura.

	public Cosecha obtenerCosechaConMasAltura() {
		Cosecha cosechaMasAlta = null;
		int alturaMax = 0;

		for (Cosecha c : this.cosechas) {
			if (c.getAltura() > alturaMax) {
				alturaMax = c.getAltura();
				cosechaMasAlta = c;
			}

		}
		return cosechaMasAlta;

	}

}
