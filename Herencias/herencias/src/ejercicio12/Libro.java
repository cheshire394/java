package ejercicio12;

public class Libro extends Item implements Prestable{
	private boolean prestado;

	public Libro(int codigo, String titulo, int anho, boolean prestado) {
		super(codigo, titulo, anho);
		this.prestado = false;
	}

	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + ", toString()=" + super.toString() + "]";
	}

	public boolean prestar() {
		if (prestado == true)
			return false;
		else {
			prestado = true;
			return true;
		}
	}

	public boolean devolver() {
		if (prestado == false)
			return false;
		else {
			prestado = false;
			return true;
		}
	}
	
	
}
