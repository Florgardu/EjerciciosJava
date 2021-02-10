package ejercicio4;

import java.util.ArrayList;

public class Show {

	private ArrayList<Animal> animales;

	public Show() {
		this.animales = new ArrayList<Animal>();
	}

	public void agregarAnimalesParaShow(Animal animal) {
		this.animales.add(animal);
	}

	public void hacerTruco() {
		Cuidador cuidadorAnimal;

		for (int i = 0; i < animales.size(); i++) {
			cuidadorAnimal = animales.get(i).getCuidador();
			ComidaDeAnimal alimentoAnimal = animales.get(i).getTipoDeComida();
			for (int j = 0; j < animales.get(i).getHabilidades().size(); j++) {
				int kilosTruco= animales.get(i).kilosHabilidad(j);
				if (cuidadorAnimal.hayAlimento(alimentoAnimal, kilosTruco)) {
					animales.get(i).hacerHabilidad(j);
				} else {
					System.out.println(
							animales.get(i).getNombre() + " no tiene suficiente alimento para el siguiente truco");

				}

			}

		}

	}
}
