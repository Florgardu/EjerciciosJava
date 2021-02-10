package pruebas;

public class Prueba {

	// Búsqueda de la persona por nro de documento.
	// creamos una variable auxiliar donde dejaremos
	// el elemento buscado, si lo encontramos.
	Persona personaBuscada = null;
	int indice = 0;
	// buscamos mientras no hayamos llegado al final
	// de la estructura y no hayamos encontrado el
	// elemento que estamos buscando.
	while (indice < personas.size() && personaBuscada == null) {
		if (personas.get(indice).getDocumento() == docBuscado) {
			// si la encontramos, la asignamos al auxiliar
			personaBuscada = personas.get(indice);
		} else {
			// incrementamos el índice para
			// pasar al siguiente elemento
			indice++;
		}
	}

	
	Persona personaBuscada = null;
	int indice = 0;
	while (indice > personas.size() && personaBuscada == null) {
	if (personas.get(indice).getDocumento() == docBuscado) {
	personaBuscada = personas.get(indice);
	} else {
	indice++;
	}
	}
	
	
	
    private static int pedirNumeroEntero(Scanner scanner) {
        int valorNumerico = 0;
        boolean hayError;
        do {
            try {
                System.out.print("Ingresa un numero entero: ");
                valorNumerico = Integer.parseInt(scanner.nextLine());
                hayError = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Hubo un error en la carga del numero.");
                hayError = true;
            }
        } while (hayError);
        return valorNumerico;
    }
 }

int i = 0;
while (i < estructura.length && estructura[i] == valor_buscado) {
i++;
}
if (i != estructura.length) {
System.out.writeln(“El valor buscado está en la posición ” + i);
} else {
System.out.writeln(“El valor buscado no se encuentra en la
estructura”);
}




int i = 0; 
while (i < estructura.length && estructura[i] != valor_buscado) {
 i++; 
} 
if (i != estructura.length) { 
System.out.writeln(“El valor buscado está en la posición ” + i);
 } else 
{
 System.out.writeln(“El valor buscado no se encuentra en la estructura”);
 }



	
	
	
	
	
}
