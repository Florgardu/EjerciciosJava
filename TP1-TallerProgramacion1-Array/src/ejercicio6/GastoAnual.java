package ejercicio6;

import java.util.ArrayList;

public class GastoAnual {

	private ArrayList<Rubro> misRubros;

	public GastoAnual() {
		this.misRubros = new ArrayList<>();
	}

	// Agrega el importe gastado al rubro que corresponda y en el mes indicado. Si
	// el rubro no se encuentra registrado en la colección se lo agregará, y cuando
	// ya
	// exista se acumulará en este el valor del gasto. Pero debe controlarse que el
	// importe ingresado sea mayor que cero.

	public void agregarGastoNuevo(MESDELANIO mes, String nombreRubro, double importe) {

		Rubro rubroParaAgregar;
		rubroParaAgregar = this.buscarRubro(nombreRubro);
		if (rubroParaAgregar == null) {
			Rubro nuevoRubro = new Rubro(nombreRubro);
			this.agregarRubro(nuevoRubro);
			nuevoRubro.agregarGasto(mes, importe);
		} else {
			if (importe > 0) {
				rubroParaAgregar.agregarGasto(mes, importe);
			}
		}

	}

	// si no lo encuentra debe devolver null
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubroBuscado = null;
		int contador = 0;

		while (contador < this.misRubros.size() && rubroBuscado == null) {
			if (this.misRubros.get(contador).getName() == nombreRubro) {
				rubroBuscado = this.misRubros.get(contador);
			} else {
				contador++;
			}

		}
		return rubroBuscado;
	}

	public void agregarRubro(Rubro rubro) {
		rubro.inicializarGastos();
		this.misRubros.add(rubro);

	}

	@Override
	public String toString() {
		return "GastoAnual [misRubros=" + misRubros + "]";
	}

	// Obtiene y devuelve el Rubro a partir de su nombre.
	// Cuando éste no exista deberá crearlo.

	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro = this.buscarRubro(nombreRubro);
		if (rubro == null) {
			Rubro nuevoRubro = new Rubro(nombreRubro);
		}

		return rubro;

	}

	// Genera un arreglo bidimensional consolidando en una sola estructura todos los
	// gastos del año. La matriz debe medir 12 (la cantidad de meses del año) por la
	// cantidad de Rubros existentes, y cada celda debe contener el importe
	// acumulado para el rubro en ese mes.

	public double[][] consolidadoDeGastos() {
		double cantidadDeRubrosEnLista = this.misRubros.size();

		double[][] gastosConsolidados = new double[12][(int) cantidadDeRubrosEnLista];

		for (int i = 0; i < gastosConsolidados.length; i++) {
			for (int j = 0; j < gastosConsolidados[i].length; j++) {
				double valor;
				Rubro rubroEnLista = this.misRubros.get(j);
				Double[] listaGastosMes = rubroEnLista.getGastosPorMes();
				valor = listaGastosMes[i];
				gastosConsolidados[i][j] = valor;
				System.out.print(gastosConsolidados[i][j] + ", ");
			}
			System.out.println();

		}

		return gastosConsolidados;

	}

	// Devuelve el importe del gasto acumulado en el mes indicado

	public double gastoAcumulado(MESDELANIO mes) {
		double acumuladorGastoMes = 0;

		for (Rubro rubro : misRubros) {
			acumuladorGastoMes = acumuladorGastoMes + rubro.getTotalGastos(mes);
		}

		return acumuladorGastoMes;

	}

	// Devuelve el importe del gasto acumulado en el rubro indicado. Si el rubro no
	// existe deberá devolver -1.

	public double gastoAcumulado(String nombreRubro) {
		double acumuladorGastoMes = 0;
		Rubro rubroBuscado;

		rubroBuscado = this.buscarRubro(nombreRubro);
		if (rubroBuscado == null) {
			acumuladorGastoMes = -1;
		} else {
			acumuladorGastoMes = rubroBuscado.gastoAcumulado();
		}

		return acumuladorGastoMes;

	}

	// Muestra los consumos por mes (discriminado por cada rubro de gasto y
	// acumulado).

	public void informarConsumosPorMes() {

		double[][] gastosTotales = new double[12][this.misRubros.size()];
		gastosTotales = this.consolidadoDeGastos();
		MESDELANIO[] mesDelAnio = { MESDELANIO.ENERO, MESDELANIO.FEBRERO, MESDELANIO.MARZO, MESDELANIO.ABRIL,
				MESDELANIO.MAYO, MESDELANIO.JUNIO, MESDELANIO.JULIO, MESDELANIO.AGOSTO, MESDELANIO.SEPTIEMBRE,
				MESDELANIO.OCTUBRE, MESDELANIO.NOVIEMBRE, MESDELANIO.DICIEMBRE };

		for (int i = 0; i < gastosTotales.length; i++) {
			System.out.println(
					"En el mes " + mesDelAnio[i] + " el gasto total fue " + this.gastoAcumulado(mesDelAnio[i]));
			for (int j = 0; j < gastosTotales[i].length; j++) {
				Rubro rubroEnLista = this.misRubros.get(j);
				double gasto = rubroEnLista.getTotalGastos(mesDelAnio[i]);
				System.out.println("El rubro " + rubroEnLista.getName() + " gasto " + gasto);
				if (this.gastoAcumulado(mesDelAnio[i]) != 0) {
					double promedio = this.CalcularPromedio(this.gastoAcumulado(mesDelAnio[i]), gasto);
					System.out
							.println("El promedio de gasto para  " + rubroEnLista.getName() + " fue " + promedio + "%");

				}

			}
		}

	}

	// Muestra los consumos promedio por mes en cada rubro.
	public void informarPromedioMensualPorRubro() {

		// COMO ERA IGUAL AL MÉTODO DE ARRIBA, LE AGREGUE EL CALCULO DE PROMEDIO AL
		// MÉTODO DE ARRIBA.

	}

	private double CalcularPromedio(double total, double particular) {
		double promedio;
		promedio = (particular / total) * 100;
		return promedio;
	}

	// Calcula y muestra nombre e importe acumulado del mes con mayor consumo
	// total (puede ser uno o más de uno).

	public void informarMesMayorConsumo() {
		double[][] gastosTotales = new double[12][this.misRubros.size()];
		gastosTotales = this.consolidadoDeGastos();	
		double gastoMax = Double.MIN_VALUE;
		MESDELANIO[] mesDelAnio = { MESDELANIO.ENERO, MESDELANIO.FEBRERO, MESDELANIO.MARZO, MESDELANIO.ABRIL,
				MESDELANIO.MAYO, MESDELANIO.JUNIO, MESDELANIO.JULIO, MESDELANIO.AGOSTO, MESDELANIO.SEPTIEMBRE,
				MESDELANIO.OCTUBRE, MESDELANIO.NOVIEMBRE, MESDELANIO.DICIEMBRE };

		for (int i = 0; i < gastosTotales.length; i++) {
			if (this.gastoAcumulado(mesDelAnio[i]) > gastoMax) {
				gastoMax = this.gastoAcumulado(mesDelAnio[i]);
				System.out.println("El mes que más gasto fue " + mesDelAnio[i] + " con  $ " + gastoMax);
			}

		}

	}

}
