package ejercicio1;

import java.util.Objects;

public class Multimedia {
	// Atributos
	protected String titulo;
	protected String autor;
	protected Formato formato;
	protected int duracion;
	
	// Constructor
	public Multimedia(String titulo, String autor, Formato formato, int duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	// Métodos para devolver los atributos (getter)
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}

	// Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return Objects.equals(autor, other.autor) && duracion == other.duracion && formato == other.formato
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion
				+ "]";
	}	
}
