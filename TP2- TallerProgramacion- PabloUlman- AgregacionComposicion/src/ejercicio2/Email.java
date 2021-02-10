package ejercicio2;

public class Email {
	
	//Crear también la clase EMail cuyo constructor deberá recibir un único String con el formato
	//“cuenta@dominio.del.mail”. Para llenar los atributos cuenta y dominio, ambos de tipo String,
	//se deberá usar el método split(separador) de la clase String, usando la arroba (”@”) como
	//separador. El método getValor() devolverá el String con la “reconstrucción” de la dirección,
//	utilizando ambos atributos más la arroba.
	
	
	private String cuenta;
	private String dominio;
	
	
	public Email (String email) {
	//	int indiceArroba= email.indexOf("@");   // me da la posicion del arroba
	//	this.cuenta= email.substring(0, indiceArroba);    // agarra desde la posicion que le diga
	//	this.dominio= email.substring(indiceArroba+1);  ESTA PODRÍA SER OTRA MANERA
		
	 String [] cuentaDominioArray = email.split("@");
	 this.cuenta=cuentaDominioArray[0] ;  // esto tmb podría monerle set y pasar por parametro el array con posicion
	 this.dominio=cuentaDominioArray[1];
	 
	}

	
	public String getValor () {
		return cuenta+"@" + dominio;
	}
	

	@Override
	public String toString() {
		return "Email [cuenta=" + cuenta + ", dominio=" + dominio + "]";
	}
	
	 
	
	

}
