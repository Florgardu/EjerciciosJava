package pruebasmodularizacion;

import java.util.Scanner;

public class Pruebaclase4 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String passCorrecto = "a123";
		String usuario;
		String pass;
		final int TOPE = 3;
		int cont = 1;
		boolean userVal = false;
		boolean passVal = false;

		usuario = ingreseTexto("usuario");
		pass = ingreseTexto("contraseña");

		userVal = validarUsuario(usuario);
		passVal = validarPass(pass, passCorrecto);

		while ((!userVal || !passVal) && cont < TOPE) {
			System.out.println("Error de datos");
			usuario = ingreseTexto("usuario");
			pass = ingreseTexto("contraseña");
			userVal = validarUsuario(usuario);
			passVal = validarPass(pass, passCorrecto);
			cont++;
		}

		if (userVal && passVal) {
			System.out.println("Ingreso ok");

		} else {
			System.out.println("Usuario bloqueado");
		}

	}

	/* acá empiezan las funciones */

	public static String ingreseTexto(String texto) {
		String txt;
		System.out.println("Por favor ingresa tu " + texto + ": ");
		txt = scan.nextLine();
		return txt;

	}

	public static boolean validarUsuario(String user) {
		String userCorrecto = "abcd";
		boolean valido = false;
		if (user.equals(userCorrecto)) {
			valido = true;
		}

		return valido;

	}

	public static boolean validarPass(String pass, String passCorrecto) {

		boolean valido = false;
		if (pass.equals(passCorrecto)) {
			valido = true;
		}

		return valido;

		// return pass.equals(passCorrecto);
	}
}
