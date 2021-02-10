package pruebasmodularizacion;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double x = sumar(4, 5);
        System.out.println(x);
        System.out.println(sumar(8, 7));
        System.out.println(sumar(5,5));
        System.out.println(numeroAleatorio());
     


        saludar();
        // saludar("Maria"); ERROR: saludar() no recibe parámetros
        saludarUsuario("Carlos");
        System.out.println(numeroAleatorio());
		        
    }

    // No recibe. No devuelve
    public static void saludar() {
        System.out.println("HOLA");
    }

    // Recibe. No devuelve
    public static void saludarUsuario(String nom) {
        System.out.println("HOLA " + nom);
    }

    // No recibe. Devuelve
    public static double numeroAleatorio() {
        return Math.random();
    }

    // Recibe. Devuelve
    public static double sumar(double a, double b) {
        return a + b;
    }

} // Cierre de la clase

		
		
		
	

