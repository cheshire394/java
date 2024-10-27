package ejercicio12;

public class Revista extends Item{
	private int numero;

	public Revista(int codigo, String titulo, int anho, int numero) {
		super(codigo, titulo, anho);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", toString()=" + super.toString() + "]";
	}
	
	
}
