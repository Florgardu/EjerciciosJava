package ejercicio5;
public class AnioV2 {
	

	private Meses[] meses = { Meses.ENERO, Meses.FEBRERO, Meses.MARZO, Meses.ABRIL ,Meses.MAYO, Meses.JUNIO, Meses.JULIO, Meses.AGOSTO, Meses.SEPTIEMBRE, Meses.OCTUBRE, Meses.NOVIEMBRE, Meses.DICIEMBRE };
	private int[] diasXMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


	public Meses getNombreDelMes(int numeroMes) {
		int numero = numeroMes - 1;
		Meses mes = meses[numero];
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
