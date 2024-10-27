package ejercicio6;

public class PersonalServicio extends Empleado{
	private Seccion seccion;

	public PersonalServicio(String nombre, String dni, String estadoCivil, int a�oIncorporacion, int numDespacho,
			Seccion seccion) {
		super(nombre, dni, estadoCivil, a�oIncorporacion, numDespacho);
		this.seccion = seccion;
	}
	
	public Seccion getSeccion() {
		return seccion;
	}
	// Traslado de secci�n de un empleado del personal de servicio
	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "PersonalServicio [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", seccion="
				+ seccion + "]";
	}
}
