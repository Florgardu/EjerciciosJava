package ar.com.ort;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);
		boolean pudo = tarjetaDeCredito.realizarCompra(6000);
		System.out.println("pudo con 4000?::"+pudo);
		System.out.println("estado actual::"+tarjetaDeCredito);
			
		
		tarjetaDeCredito.actualizarLimite(3000);
		System.out.println("estado actual::"+tarjetaDeCredito);
		pudo = tarjetaDeCredito.realizarCompra(500);
		System.out.println("pudo con 2000?::"+pudo);
		System.out.println("estado actual::"+tarjetaDeCredito);


	}

}
