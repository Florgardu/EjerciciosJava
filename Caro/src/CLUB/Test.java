package CLUB;

public class Test {

	public static void main(String[] args) {
		
		Club club=new Club("El Club social y Deportivo “Unidos Aprobaremos”");
		club.agregarActividad("futbol", 20);
		club.agregarActividad("voley", 15);
		club.agregarActividad("basquet", 15);
		club.agregarActividad("pileta_libre", 40);
		club.agregarActividad("yoga", 10);
		club.agregarActividad("zumba", 10);
		club.agregarActividad("crossfit", 10);
		club.agregarActividad("funcional", 30);
		club.agregarActividad("teatro", 60);
		club.agregarActividad("tango", 25);
		club.agregarActividad("danzas_folkloricas", 35);	
		
		
		
			
		
		club.agregarSocio("29695793", "Carolina");
		club.agregarSocio("29695792", "Lorenzo");
		club.agregarSocio("29695791", "Pablo");
		
		club.inscribirSocioEnActividad("36397441", "zumba");
		club.inscribirSocioEnActividad("36397441", "futbol");
		club.inscribirSocioEnActividad("36397441", "voley");
		club.inscribirSocioEnActividad("36397441", "saraza");
		
		club.montoAbonar("36397441");
		
		club.obtenerPromedioActividades();
		
		club.listarActividadesPosSocio();

	}

}
