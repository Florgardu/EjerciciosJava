package multiplosDe3y5;

public class Multiplo {

	public void fizzBuzz(int n) {
		// Write your code here

		for (int i = 1; i <= n; i++) {

			boolean esMultiploDe3 = esMultiploDe(i, 3);
			boolean esMultiploDe5 = esMultiploDe(i, 5);

			if (esMultiploDe5 && !esMultiploDe3) {
				System.out.println("Buzz");
			}

			if (esMultiploDe3 && !esMultiploDe5) {
				System.out.println("Fizz");
			}

			if (esMultiploDe5 && esMultiploDe3) {
				System.out.println("FizzBuzz");
			} 

			if (!esMultiploDe5 && !esMultiploDe3) {
				System.out.println(i);
			}
		}

	}

	private boolean esMultiploDe(int numero, int multiplo) {
		boolean esMultiplo = false;

		if (numero % multiplo == 0) {
			esMultiplo = true;
		} else {
			esMultiplo = false;
		}
		return esMultiplo;
	}

}
