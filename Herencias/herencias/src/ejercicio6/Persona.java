package ejercicio6;

public class Persona {
	protected String nombre;
	protected String dni;
	protected String estadoCivil;
	
	public Persona(String nombre, String dni, String estadoCivil) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
	}

	/*
	 * Getters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	/*
	 * Setters
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	// Cambio del estado civil de una persona
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + "]";
	}
}
