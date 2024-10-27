package ejercicio13;

public class Vehiculo {
	private int peso;
	private String matricula;
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Vehiculo [peso=" + peso + ", matricula=" + matricula + "]";
	}
}
