package ejercicio1;

public class Pelicula extends Multimedia {
	String actorPrincipal;
	String actrizPrincipal;

	public Pelicula(String titulo, String autor, Formato formato, int duracion, String actorPrincipal,
			String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}

	public Pelicula(String titulo, String autor, Formato formato, int duracion, 
			String actriz) {
		super(titulo, autor, formato, duracion);
		this.actrizPrincipal = actriz;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	
	
	// toString
	public String toString() {
		return super.toString()+
				"[actor: "+actorPrincipal+
				", actriz: "+actrizPrincipal+"]";
	}
}
