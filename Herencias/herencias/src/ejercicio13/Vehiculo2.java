package ejercicio13;

public class Vehiculo2 extends Vehiculo implements Comparar{
	public boolean esMenor(Object objeto) {
		boolean menor = false;
		if(objeto instanceof Vehiculo) {
			Vehiculo v = (Vehiculo)objeto;
			if(this.getPeso() < v.getPeso()) {
				menor = true;
			}
		}
		return menor;
	}
	public boolean esMayor(Object objeto) {
		boolean mayor = false;
		if(objeto instanceof Vehiculo) {
			Vehiculo v = (Vehiculo)objeto;
			if(this.getPeso() > v.getPeso()) {
				mayor = true;
			}
		}
		return mayor;
	}
	public boolean esIgual(Object objeto) {
		boolean igual = false;
		if(objeto instanceof Vehiculo) {
			Vehiculo v = (Vehiculo)objeto;
			if(this.getPeso() == v.getPeso()) {
				igual = true;
			}
		}
		return igual;
	}
}
