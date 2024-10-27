package ejercicio6;

public class Empleado extends Persona {
	private int a�oIncorporacion;
	private int numDespacho;
	
	public Empleado(String nombre, String dni, String estadoCivil, int a�oIncorporacion, int numDespacho) {
		super(nombre, dni, estadoCivil);
		this.a�oIncorporacion = a�oIncorporacion;
		this.numDespacho = numDespacho;
	}

	public int getNumDespacho() {
		return numDespacho;
	}
	// Reasignaci�n despacho empleado
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", a�oIncorporacion="
				+ a�oIncorporacion + ", numDespacho=" + numDespacho + "]";
	}
}
