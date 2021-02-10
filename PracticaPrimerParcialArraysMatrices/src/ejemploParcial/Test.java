package ejemploParcial;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arreglo = {5, 8, 6, 20, 18, 34, 9, 12, 16, 83};
	for (int i = 0; i < arreglo.length - 1; i++) {
		int aux = arreglo[i];
		arreglo[i] = arreglo[arreglo.length-1];
		arreglo[arreglo.length-1] = aux;
	}
		
	System.out.println(arreglo);

	}

}
