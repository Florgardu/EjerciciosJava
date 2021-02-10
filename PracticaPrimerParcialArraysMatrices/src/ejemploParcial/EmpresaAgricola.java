package ejemploParcial;

import java.util.ArrayList;
import java.util.Arrays;

public class EmpresaAgricola {

	private String nombre;
	private String[] columnas;
	private int[][] resultadosCosecha;
	private ArrayList<Cosecha> cosechas;
	private static final String tipoCultivo[] = { "TRIGO", "MAIZ", "SOJA" };

	public EmpresaAgricola(String nombre) {
		this.nombre = nombre;
		this.cosechas = new ArrayList();
	}

	public void cargarResultados() {
		this.columnas = new String[] { "Cosecha", "Tipo cultivo", "Fecha", "Kilos", "Altura", "Humedad" };
		this.resultadosCosecha = new int[][] { { 1, 1, 20170101, 20, 200, 78 }, { 2, 1, 20170801, 19, 194, 85 },
				{ 3, 2, 20170901, 25, 262, 85 }, { 4, 2, 20171201, 12, 140, 64 }, { 5, 3, 20180101, 26, 217, 93 },
				{ 6, 3, 20180201, 34, 261, 91 } };

	}

	// tal que muestre por pantalla los arrays cargados.
	public void mostrarResultados() {

		int cantidadCosecha = this.resultadosCosecha.length;

		this.mostrarColumnas();

		for (int i = 0; i < cantidadCosecha; i++) {
			for (int j = 0; j < this.resultadosCosecha[i].length; j++) {
				System.out.print(this.resultadosCosecha[i][j] + "\t\t");
			}
			System.out.println();
		}

	}

	private void mostrarColumnas() {
		int cantidadColumnas = this.columnas.length;

		for (int i = 0; i < cantidadColumnas; i++) {
			System.out.print(this.columnas[i] + "\t\t");
		}
		System.out.println();
	}

	// El método procesarResultados() carga los resultados en el ArrayList de
	// cosechas
	// usando la matriz resultadosCosecha.

	public void procesarResultados() {
		for (int i = 0; i < resultadosCosecha.length; i++) {
			Cosecha c = new Cosecha();
			for (int j = 0; j < resultadosCosecha[i].length; j++) {
				switch (j) {
				case 0:
					c.setNombre(String.valueOf(resultadosCosecha[i][j]));
					break;
				case 1:
					c.setCultivo(tipoCultivo[resultadosCosecha[i][j] - 1]);
					break;
				case 2:
					c.setFecha(String.valueOf(resultadosCosecha[i][j]));
					;
					break;
				case 3:
					c.setKilo(resultadosCosecha[i][j]);
					break;
				case 4:
					c.setAltura(resultadosCosecha[i][j]);
					break;
				case 5:
					c.setHumedad(resultadosCosecha[i][j]);
					break;
				}
			}
			cosechas.add(c);
		}
	}

	public void mostrarArrayList() {
		for (int i = 0; i < this.cosechas.size(); i++) {
			System.out.println(this.cosechas.get(i));
		}
	}

	// c)public String buscarCosecha(int cosecha);
//	tal que busque una cosecha enviada por parámetro, y retorne su resultado incluyendo
//	todos sus datos en un string. Validar que la cosecha sea válida. Ejemplo:
//	Resultados de cosecha 3: Cultivo: 2 Fecha: 20170901 Kilos: 15 Altura: 199
//	Humedad: 85

	public String buscarCosecha(int cosecha) {
		String cosechaBuscada = null;

		if (cosecha > this.cosechas.size() && cosecha < 0) {
			System.out.println("Cosecha no válida");
		} else {
			cosechaBuscada = this.cosechas.get(cosecha - 1).toString();
		}

		System.out.println("La cosecha buscada  " + cosechaBuscada);
		return cosechaBuscada;

	}

	// public String obtenerCosechaConMasKilos()
	// tal que devuelva el nombre de la cosecha con más kilos.

	public String obtenerCosechaConMasKilos() {
		int cosechaMax = 0;
		String nombreCosechaMax = null;

		for (Cosecha cosecha : this.cosechas) {
			if (cosecha.getKilo() > cosechaMax) {
				nombreCosechaMax = cosecha.getNombre();
				cosechaMax = cosecha.getKilo();
			}
		}

		return nombreCosechaMax;

	}
	
	
	
	// e)public String obtenerCosechaConMasAltura()
	// tal que devuelva el nombre de la cosecha con más altura.
	
	
	public String obtenerCosechaConMasAltura() {
		String nombreCosechaMasAlta=null;
		int maxAltura=0;
		
		for (Cosecha cosecha : this.cosechas) {
			if (cosecha.getAltura()>maxAltura) {
				nombreCosechaMasAlta=cosecha.getNombre();
				maxAltura=cosecha.getAltura();
			}
		}
		
		return nombreCosechaMasAlta;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public String[] getColumnas() {
		return columnas;
	}

	public int[][] getResultadosCosecha() {
		return resultadosCosecha;
	}

	public ArrayList<Cosecha> getCosechas() {
		return cosechas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	public void setResultadosCosecha(int[][] resultadosCosecha) {
		this.resultadosCosecha = resultadosCosecha;
	}

	public void setCosechas(ArrayList<Cosecha> cosechas) {
		this.cosechas = cosechas;
	}

	@Override
	public String toString() {
		return "EmpresaAgricola [nombre=" + nombre + ", columnas=" + Arrays.toString(columnas) + ", resultadosCosecha="
				+ Arrays.toString(resultadosCosecha) + ", cosechas=" + cosechas + "]";
	}

}
