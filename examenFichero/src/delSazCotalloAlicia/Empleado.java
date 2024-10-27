package delSazCotalloAlicia;



public class Empleado {
	private int id;
	private String apellidos;
	private int dept;
	private double salario;

	public Empleado(int id, String apellidos, int dept, double salario) {
		this.id = id;
		this.apellidos = apellidos;
		this.dept = dept;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
