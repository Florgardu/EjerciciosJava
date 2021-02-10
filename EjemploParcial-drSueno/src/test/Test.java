package test;

import clases.Doctor;
import clases.Genero;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo una doctor con su agenda de pacientes y horario de atención
		
		
		Doctor miDoctor = new Doctor("Guillermo Ruiz Baltar", 5, "de 10 a 15hs");
		
		/// agrego pacientes a la lista de turnos - el ultimo no debe dejar por cupo
		
		miDoctor.registrarTurno("flor", "gardu", "1127010234", "35805837", Genero.FEMENINO);
		miDoctor.registrarTurno("pepe", "perez", "115550234", "35805115", Genero.MASCULINO);
		miDoctor.registrarTurno("chino", "garcia", "1127013434", "31805837", Genero.MASCULINO);
		miDoctor.registrarTurno("flor", "gagliardi", "11243430234", "34805837", Genero.FEMENINO);
		miDoctor.registrarTurno("juan", "gagliardi", "11243430234", "34805837", Genero.FEMENINO);
		
		miDoctor.registrarTurno("juan", "gagliardi", "11243430234", "311117", Genero.MASCULINO);
		miDoctor.registrarTurno("juan", "gagliardi", "11243430234", "32222", Genero.MASCULINO);

		
		// anular turnos - se borrar de la lista a dni de flor gardu y me permite agregar a alguien, libero 
		//un lugar
		
		miDoctor.anularTurnos("35805837");
		
		miDoctor.listarTurnos();
		miDoctor.registrarTurno("juan", "gagliardi", "11243430234", "32222", Genero.MASCULINO);

		
		// metodo porcentaje 
		
		miDoctor.porcentajePorGenero(Genero.FEMENINO);
		System.out.println(miDoctor.porcentajePorGenero(Genero.FEMENINO));
	}

}
