package clases;

import java.util.Calendar;

public class PersonalFijo extends Personal {

	private double sueldoBasico;

	public PersonalFijo(String numeroDni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
		super(numeroDni, nombre, apellido, anioIngreso);
		this.sueldoBasico = sueldoBasico;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub

		double salario = 0;

		double porcentajeAnios = calcularPorcentajePorAntiguedad();
		porcentajeAnios = this.sueldoBasico* (porcentajeAnios / 100);
		salario = this.sueldoBasico + porcentajeAnios;
		return salario;
	}

	private double calcularPorcentajePorAntiguedad() {
		Calendar cal = Calendar.getInstance();
		int anioActual = cal.get(Calendar.YEAR);
		int aniosAntiguedad = anioActual - this.getAnioIngreso();
		double porcentajePorAntiguedad = 0;

		if (aniosAntiguedad >= 2) {
			porcentajePorAntiguedad = 5;
		}
		if (aniosAntiguedad >= 4) {
			porcentajePorAntiguedad = 10;
		}
		if (aniosAntiguedad >= 8) {
			porcentajePorAntiguedad = 15;
		}
		if (aniosAntiguedad >= 15) {
			porcentajePorAntiguedad = 20;

		}

		return porcentajePorAntiguedad;

	}

}
