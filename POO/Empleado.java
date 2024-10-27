
public class Empleado {
/*1. Crea una clase llamada Empleado:
		● Con los atributos privados nombre, y teléfono.
		● Implementa los métodos necesarios para accederatributos de manera pública (getters y setters).
		a estos dos
		●Añade el atributo estático y privado numEmpleados. Este atributo
		almacenará el número de instancias que se han creado de la clase
		Empleado.
		● Implementa un método público para conocer el valor de
		numEmpleados.
		●Crea una clase aparte con el método main para probar todas las
		funcionalidades de la clase Empleado.*/
	
	private String nombre;
	private int telf;
	
	//almacena el numero de instancias que se han creado en la clase.
	private static int numEmpleado = 0;//static no necesita objetos clase.atributo accede a él.
	
	//creamos dos constructores uno vacio y otro parametrizado;
	public Empleado() {
		numEmpleado++;
	}
	
	public Empleado(String s, int i) {
		numEmpleado++; 
	}
	
	//creamos un metodo publico, que sea estatico (no necesita objetos) lo hace
	// a traves de la variable, y que sea void porque no devuelve nada.
	public static void mostrarNumEmpleados() {
		System.out.println("Empleados creados: "+numEmpleado);
	}
	
	//creamos getter y setter:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelf() {
		return telf;
	}
	public void setTelf(int telf) {
		this.telf = telf;
	}
	
	
	//metodo que opera para conocer el valor de numEmpleado:
	public int conoceNumEmple() {
		
		return numEmpleado;
	}
	
		
	public static void main(String[] args) {
		//Invoco el método estático
		Empleado.mostrarNumEmpleados();
		//Creamos 1 empleado
		Empleado e1 = new Empleado();
		Empleado.mostrarNumEmpleados();
		//Creamos otro empleado
		Empleado e2 = new Empleado("fsd",0);
		Empleado.mostrarNumEmpleados();
	}

}
