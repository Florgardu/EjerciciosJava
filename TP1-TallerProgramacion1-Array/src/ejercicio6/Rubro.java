package ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;

import ejercicio5.Meses;

public class Rubro {

	private String name;
	private Double[] gastosPorMes = new Double[12];
	private MESDELANIO[] meses = { MESDELANIO.ENERO, MESDELANIO.FEBRERO, MESDELANIO.MARZO, MESDELANIO.ABRIL, MESDELANIO.MAYO,
			MESDELANIO.JUNIO, MESDELANIO.JULIO, MESDELANIO.AGOSTO, MESDELANIO.SEPTIEMBRE, MESDELANIO.OCTUBRE,
			MESDELANIO.NOVIEMBRE, MESDELANIO.DICIEMBRE };

	public Rubro(String name) {
		this.name = name;
	}

	
	public void inicializarGastos() {
		for (int i = 0; i < gastosPorMes.length; i++) {
			gastosPorMes[i] = 0d;
		
		}
		
	}

	// Acumula el importe en la posición correspondiente al mes indicado.
	public void agregarGasto(MESDELANIO mes, double importe) {
        double acumuladorGastos=0;
		int posicion;
		posicion = this.ObtenerPosicionDelMes(mes);
		acumuladorGastos= this.gastosPorMes[posicion]+importe;
		this.gastosPorMes[posicion]= acumuladorGastos;

	}

	private int ObtenerPosicionDelMes(MESDELANIO mes) {
		int posicion = -1;
		int contador = 0;

		while (contador < this.meses.length && posicion == -1) {

			if (this.meses[contador].equals(mes)) {
				posicion = contador;
			} else {
				contador++;

			}
		}
		return posicion;
	}

	
	// 
// 	Devuelve el importe acumulado de gastos para el mes indicado
	
	public double getTotalGastos(MESDELANIO mes) {
		int posicion;
		double gastoDeEseMes;
		
		posicion= this.ObtenerPosicionDelMes(mes);
		gastoDeEseMes= this.gastosPorMes[posicion];
		return gastoDeEseMes;
		
	}
	
	

	public String getName() {
		return name;
	}

	
	// to string 

	@Override
	public String toString() {
		return "Rubro [name=" + name + ", gastosPorMes=" + Arrays.toString(gastosPorMes) + ", meses="
				+ Arrays.toString(meses) + "]";
	}


	public Double[] getGastosPorMes() {
		return gastosPorMes;
	}


	public MESDELANIO[] getMeses() {
		return meses;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setGastosPorMes(Double[] gastosPorMes) {
		this.gastosPorMes = gastosPorMes;
	}


	public void setMeses(MESDELANIO[] meses) {
		this.meses = meses;
	}
	
	
	public double gastoAcumulado() {
		double gastoAcumulado=0; 
		
		for (int i = 0; i < gastosPorMes.length; i++) {
			gastoAcumulado= gastoAcumulado+ gastosPorMes [i];
		}
		
		return gastoAcumulado; 
	
	}
	
	
	
	
	

}
