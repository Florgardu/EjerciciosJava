package clases;



public class InstaladorPremium extends Instalador {

	public InstaladorPremium(int capacidadEnMB) {
		super(capacidadEnMB);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instalar(String nombre, int tamañoMB, String fecha) {
		Aplicacion aplicacion = buscarApp(nombre);
		if(aplicacion!=null){
			if(esFechaMayor(fecha, aplicacion.getFecha())){
				tryToUpgrade(nombre, tamañoMB, fecha, aplicacion);
			} else {
				System.out.println("La aplicacion es mas vieja que la actual");
			}
		} else {
			tryToInstall(nombre, tamañoMB, fecha);
		}
	}

	private void tryToInstall(String nombre, int tamañoMB, String fecha) {
		if(hayEspacioEnMemoria(tamañoMB)) {
			this.getListaAplicaciones().add(new Aplicacion(nombre, tamañoMB, fecha));
		} else {
			System.out.println("No hay lugar para instalar una nueva app");
		}
	}
	
	private void tryToUpgrade(String nombre, int tamañoMB, String fecha, Aplicacion appActual) {
		if(hayEspacioEnMemoria(tamañoMB  - appActual.getTamañoMB())) {
			this.getListaAplicaciones().remove(appActual);
			this.getListaAplicaciones().add(new Aplicacion(nombre, tamañoMB, fecha));
		} else {
			System.out.println("No hay lugar para instalar una nueva app");
		}
	}	
	



}
