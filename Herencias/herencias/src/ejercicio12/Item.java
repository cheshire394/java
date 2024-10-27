package ejercicio12;

public abstract class Item {
	private int codigo;
	private String titulo;
	private int anho;
	
	public Item(int codigo, String titulo, int anho) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anho = anho;
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", titulo=" + titulo + ", anho=" + anho + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public int getAnho() {
		return anho;
	}	
	
	
}
