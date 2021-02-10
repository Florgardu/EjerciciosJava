package ejercicio5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Hotel miHotel = new Hotel("Hilton", "CABA",200, 15 );
		
		
		System.out.println(miHotel.ocuparHabitaciones(3));
		System.out.println(miHotel.getHabitacionesDisponibles());
		System.out.println(miHotel.desocuparHabitaciones(10));
		System.out.println(miHotel.getHabitacionesDisponibles());
		
	}

}
