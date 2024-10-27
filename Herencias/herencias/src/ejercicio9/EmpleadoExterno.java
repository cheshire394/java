package ejercicio9;

public class EmpleadoExterno extends Empleado {
	private String empresa;

	public EmpleadoExterno(String nombre, String dni, String dirección, int teléfono, int horas, double beneficio,
			String empresa) {
		super(nombre, dni, dirección, teléfono, horas, beneficio);
		this.empresa = empresa;
	}
	
	
}
