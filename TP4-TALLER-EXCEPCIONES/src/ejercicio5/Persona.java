package ejercicio5;

import java.util.Calendar;

public class Persona {

	private static final int VALOR_AUN_VIVE = -1;
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual;

	/**
	 * Constructor para personas que aún viven.
	 *
	 * @param nombreCompleto
	 * @param anioNacimiento
	 */
	public Persona(String nombreCompleto, int anioNacimiento) {
		setAnioActual();
		setNombreCompleto(nombreCompleto);
		setAnioNacimiento(anioNacimiento);
		setAnioFallecimiento(VALOR_AUN_VIVE);
	}

	/**
	 * Constructor para personas que ya han fallecido.
	 *
	 * @param nombreCompleto
	 * @param anioNacimiento
	 * @param anioFallecimiento
	 */
	public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		setAnioActual();
		setNombreCompleto(nombreCompleto);
		setAnioNacimiento(anioNacimiento);
		setAnioFallecimiento(anioFallecimiento);
	}

	/**
	 * Guarda el anio actual para hacer las validaciones correspondientes a las
	 * fechas de nacimiento y fallecimiento.
	 */
	public void setAnioActual() {
		anioActual = Calendar.getInstance().get(Calendar.YEAR);
	}

	/**
	 * @param nombreCompleto El nombre completo a asignar.
	 */
	public void setNombreCompleto(String nombreCompleto) {
		// se recibió un nombre completo para ponerle?
		if (nombreCompleto == null || nombreCompleto.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio ni ser null");
		}
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * @param anioNacimiento El anio de nacimiento a asignar. No puede ser mayor al
	 *                       anio anio actual.
	 */
	public void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento > anioActual) {
			throw new IllegalArgumentException("El anio de nacimiento no puede estar en el futuro");
		}
		this.anioNacimiento = anioNacimiento;
	}

	/**
	 * @param anioFallecimiento El anio de fallecimiento a asignar. No puede ser
	 *                          menor al anio de nacimiento ni mayor al anio actual.
	 */
	public void setAnioFallecimiento(int anioFallecimiento) {
		if (anioFallecimiento != VALOR_AUN_VIVE) {
			if (anioFallecimiento > anioActual) {
				throw new IllegalArgumentException("El anio de fallecimiento no puede estar en el futuro");
			} else if (anioFallecimiento < anioNacimiento) {
				throw new IllegalArgumentException("No puede fallecer antes de nacer.");
			}
		}
		this.anioFallecimiento = anioFallecimiento;
	}

	/**
	 * @return El nombre completo de la persona.
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @return El anio de nacimiento de la persona
	 */
	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	/**
	 * @return El anio de fallecimiento de la persona. Si vale -9999 significa que
	 *         la persona aun vive.
	 */
	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", anioNacimiento=" + anioNacimiento
				+ ", anioFallecimiento=" + anioFallecimiento + "]";
	}
	
	public void MostarEdad () {
		int edad;
		if (this.anioFallecimiento==this.VALOR_AUN_VIVE) {
			edad= this.anioActual-this.anioNacimiento;
			System.out.println("La persona aún vive, tiene " + edad + "años");
		} else {
			edad= this.anioFallecimiento-this.anioNacimiento;
			System.out.println("La persona ya no vive, tenía " + edad + "años");
		}
	}
	
	
	public boolean vive() {
		boolean vive;
		if (this.anioFallecimiento==this.VALOR_AUN_VIVE) {
			vive=true;
		} else {
			vive=false;
		}
		return vive;
	}
	
	
}
