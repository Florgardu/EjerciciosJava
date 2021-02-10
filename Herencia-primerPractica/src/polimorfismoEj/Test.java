package polimorfismoEj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo miVehiculo = new Vehiculo("AA2", "Fort", "XMAX");
		Vehiculo miDeportivo = new VehiculoDeportivo("AA54", "VolgsWagen", "Gol", 150);
		Vehiculo miFurgoneta = new VehiculoFurgoneta("xcv543", "Chevrolet", "4X4", 300);

		miVehiculo.agregarALista(miVehiculo);
		miVehiculo.agregarALista(miDeportivo);
		miVehiculo.agregarALista(miFurgoneta);

		miVehiculo.mostrarVehiculosEnLista();

	}

}
