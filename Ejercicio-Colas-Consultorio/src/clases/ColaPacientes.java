package clases;

import java.util.ArrayList;

public class ColaPacientes implements Cola {

	private ArrayList<Paciente> pacientes=new ArrayList<Paciente>();
	private int limite;


	
	public ColaPacientes() {
		this(SIN_LIMITE);
	}

	public ColaPacientes(int limite) {
		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalArgumentException(ERR_TAM_ILEGAL);
		}
		this.limite = limite;
		this.pacientes = new ArrayList<>();
	}
	
	@Override
	public Paciente remove() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_COLA_VACIA);
		}
		return pacientes.remove(0);
	}

	@Override
	public Paciente get() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_COLA_VACIA);
		}
		return pacientes.get(0);
	}

	@Override
	public boolean isEmpty() {
		return pacientes.isEmpty();
	}

	@Override
	public boolean isFull() {
		return pacientes.size() == limite;
	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		this.pacientes.add((Paciente) element);
		
	}


	
	
}

	
	
