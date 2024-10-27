package ejercicio6;

public class Profesor extends Empleado {
	private Departamento departamento;

	public Profesor(String nombre, String dni, String estadoCivil, int añoIncorporacion, int numDespacho,
			Departamento departamento) {
		super(nombre, dni, estadoCivil, añoIncorporacion, numDespacho);
		this.departamento = departamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	// Cambio de departamento de un profesor.
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", departamento="
				+ departamento + "]";
	}
}
