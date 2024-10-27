package ejercicio6;

public class Empleado extends Persona {
	private int añoIncorporacion;
	private int numDespacho;
	
	public Empleado(String nombre, String dni, String estadoCivil, int añoIncorporacion, int numDespacho) {
		super(nombre, dni, estadoCivil);
		this.añoIncorporacion = añoIncorporacion;
		this.numDespacho = numDespacho;
	}

	public int getNumDespacho() {
		return numDespacho;
	}
	// Reasignación despacho empleado
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", añoIncorporacion="
				+ añoIncorporacion + ", numDespacho=" + numDespacho + "]";
	}
}
