package ejercicio6;

public class PersonalServicio extends Empleado{
	private Seccion seccion;

	public PersonalServicio(String nombre, String dni, String estadoCivil, int añoIncorporacion, int numDespacho,
			Seccion seccion) {
		super(nombre, dni, estadoCivil, añoIncorporacion, numDespacho);
		this.seccion = seccion;
	}
	
	public Seccion getSeccion() {
		return seccion;
	}
	// Traslado de sección de un empleado del personal de servicio
	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "PersonalServicio [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", seccion="
				+ seccion + "]";
	}
}
