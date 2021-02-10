import java.util.HashMap;
import java.util.Map;

public class Prueba {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setEdad(38);
		
		Animal a = new Animal();
		a.setName("Roberto");
		
		Map m = new HashMap();
		System.out.println(m.put(p, "persona"));
		System.out.println(m.put(a, "animal"));
		
		System.out.println(m.get(p));

	}

}
