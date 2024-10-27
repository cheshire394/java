package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Multimedia multi = new Multimedia("El padrino", "Francis",Formato.dvd, 220 );
		System.out.println(multi);
		Pelicula peli = new Pelicula("El padrino", "Francis",Formato.mov, 220, "Joana" );
		System.out.println(peli);
	}
}
