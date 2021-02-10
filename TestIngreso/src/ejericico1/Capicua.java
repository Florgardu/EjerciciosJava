package ejericico1;

public class Capicua {

	private String sTexto = "Ababa";
	private String sTextoBuscado = "Aba";
	

	public  int contadorOcurrencias() {
		int contador = 0;
		
		while (sTexto.indexOf(sTextoBuscado) > -1) {
			sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length(), sTexto.length());
			contador++;
		}
		return contador;
	}

	
}
