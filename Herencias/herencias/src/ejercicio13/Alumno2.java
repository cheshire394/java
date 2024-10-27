package ejercicio13;

public class Alumno2 extends Alumno implements Comparar{
	
	public Alumno2(String nombre, int edad) {
		super(nombre, edad);
	}
	
	public boolean esMenor(Object objeto) {
		boolean menor = false;
		if(objeto instanceof Alumno) {
			Alumno v = (Alumno)objeto;
			if(this.getEdad() < v.getEdad()) {
				menor = true;
			}
		}
		return menor;
	}
	public boolean esMayor(Object objeto) {
		boolean mayor = false;
		if(objeto instanceof Alumno) {
			Alumno v = (Alumno)objeto;
			if(this.getEdad() > v.getEdad()) {
				mayor = true;
			}
		}
		return mayor;
	}
	public boolean esIgual(Object objeto) {
		boolean igual = false;
		if(objeto instanceof Alumno) {
			Alumno v = (Alumno)objeto;
			if(this.getEdad() == v.getEdad()) {
				igual = true;
			}
		}
		return igual;
	}
}
