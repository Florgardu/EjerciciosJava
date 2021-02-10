package ejercicio2;

import java.util.ArrayList;

public class Persona {

	private ArrayList<NumTel> numerosTelefono;
	private ArrayList<Email> emails;
	private String nombre;
	private String apellido;
	private ArrayList<Mascota> mascotas;

	public Persona(String nombre, String apellido) {
		super();
		this.numerosTelefono = new ArrayList();
		this.emails = new ArrayList();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mascotas = new ArrayList();
	}

	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public void cambiarNombreMascota (Mascota mascota, String nuevoNombre) {
		mascota.setNombre(nuevoNombre);
	}
	

	public ArrayList<NumTel> getNumerosTelefono() {
		return numerosTelefono;
	}

	public ArrayList<Email> getEmails() {
		return emails;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNumerosTelefono(ArrayList<NumTel> numerosTelefono) {
		this.numerosTelefono = numerosTelefono;
	}

	public void setEmails(ArrayList<Email> emails) {
		this.emails = emails;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// la relacion entre la persona y el mail es de composicion

	public void agregarEmail(String email) {
		Email miNuevoMail = new Email(email);
		this.emails.add(miNuevoMail);
	}

	public void agregarTel(NumTel numTel) {
		this.numerosTelefono.add(numTel);
	}

	public void mostrarTodo() {

		System.out.println(this.nombre + this.apellido);
		System.out.println("Telefonos: ");
		if (this.numerosTelefono.size() <= 0) {
			System.out.println("No hay telefonos cargados");

		} else {
			NumTel numeroTel;
			for (int i = 0; i < this.numerosTelefono.size(); i++) {
				numeroTel = this.numerosTelefono.get(i);
				System.out.println(numeroTel.getTipoLinea() + numeroTel.getValor());
			}
		}

		System.out.println("Emails ");
		if (this.emails.size() <= 0) {
			System.out.println("No hay numeros de tel");
		} else {
			Email mail;
			for (int i = 0; i < this.emails.size(); i++) {
				mail = this.emails.get(i);
				System.out.println(mail.getValor());
			}
		}

		System.out.println("Mascotas ");
		if (this.mascotas.size() <= 0) {
			System.out.println("No hay mascotas");
		} else {
			Mascota mascota;
			for (int i = 0; i < this.mascotas.size(); i++) {
				mascota= this.mascotas.get(i);
				System.out.println(mascota.getNombre());
			}
		}
		
		
		
	}

}
