package ejercicio9;

public class EmpleadoExterno extends Empleado {
	private String empresa;

	public EmpleadoExterno(String nombre, String dni, String direcci�n, int tel�fono, int horas, double beneficio,
			String empresa) {
		super(nombre, dni, direcci�n, tel�fono, horas, beneficio);
		this.empresa = empresa;
	}
	
	
}
