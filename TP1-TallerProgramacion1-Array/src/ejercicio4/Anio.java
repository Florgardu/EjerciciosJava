package ejercicio4;

public class Anio {

	private String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
			"octubre", "noviembre", "diciembre" };;
	private int[] diasXMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


	public String getNombreDelMes(int numeroMes) {
		int numero = numeroMes - 1;
		String mes = meses[numero];
		return mes;

	}

	public int diasTranscurridos(int numeroMes) {
		int numero = numeroMes - 1;
		int acumuladorDiasTrancurridos = 0;

		for (int i = 0; i < numero; i++) {

			acumuladorDiasTrancurridos = acumuladorDiasTrancurridos + this.diasXMes[i];

		}

		return acumuladorDiasTrancurridos;

	}

}
