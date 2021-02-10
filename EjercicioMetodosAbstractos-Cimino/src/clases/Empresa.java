package clases;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Personal> listaEmpleados;

	public Empresa() {
		super();
		this.listaEmpleados = new ArrayList<Personal>();
	}

	public void agregarEmpleados(Personal empleado) {
		listaEmpleados.add(empleado);
	}

	public void mostrarSalarioXEmpleado() {
		for (Personal personal : listaEmpleados) {
			System.out.println("Nombre: " + personal.getNombre() + " Sueldo " + personal.calcularSalario());

		}

	}

	public double calcularTotalSalarios() {
		double acumuladorSalarios = 0;
		for (Personal personal : listaEmpleados) {
			acumuladorSalarios = acumuladorSalarios + personal.calcularSalario();
		}

		return acumuladorSalarios;

	}

	public void mostrarEmpleadosAComision() {

		for (Personal personal : listaEmpleados) {
			if (personal instanceof PersonalComision) {
				System.out.println("Los empleados que trabajan con comision son " + personal);
			}

		}

	}

	public String[][] matrizEmpleadoSueldo() {

		int cantidadEmpleados = this.listaEmpleados.size();
		int columnas = 2;

		String[][] matrizEmpleadoSueldo = new String[cantidadEmpleados][columnas];
		int posicionNombre = 0;
		int posicionSueldo = 1;

		for (int i = 0; i < this.listaEmpleados.size(); i++) {
			matrizEmpleadoSueldo[i][posicionNombre] = this.listaEmpleados.get(i).getNombre();
			double sueldo = this.listaEmpleados.get(i).calcularSalario();
			matrizEmpleadoSueldo[i][posicionSueldo] = Double.toString(sueldo);

		}

		return matrizEmpleadoSueldo;

	}

}
