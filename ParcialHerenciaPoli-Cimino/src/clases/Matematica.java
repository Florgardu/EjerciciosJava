package clases;

public class Matematica {

	// al cual se le envía un valor monetario y un porcentaje y devuelve un valor
	// double con el
	// porcentaje sumado al precio.

	public static double sumarPorcentaje(double valorMonetario, double porcentaje) {
		double plus = valorMonetario * (porcentaje / 100);
		double total = valorMonetario + plus;
		return total;
	}

}
