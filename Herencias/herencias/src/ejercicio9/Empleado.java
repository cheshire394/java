package ejercicio9;

public abstract class Empleado {
	private String nombre;
	private String dni;
	private String dirección;
	private int teléfono;
	private int horas;
	private double beneficio;
	private static int numEmpleado = 0;
	
	public Empleado(String nombre, String dni, String dirección, int teléfono, int horas, double beneficio) {
		this.nombre = nombre;
		this.dni = dni;
		this.dirección = dirección;
		this.teléfono = teléfono;
		this.horas = horas;
		this.beneficio = beneficio;
		numEmpleado++;
	}
	
	public int getNumEmpleado() {
		return numEmpleado;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}
	
	
}
