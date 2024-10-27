package ejercicio2;

import ejercicio1.Formato;
import ejercicio1.Multimedia;
import ejercicio1.Pelicula;

public class Principal {
	public static void main(String[] args) {
		// Se cree un objeto de tipo ListaMultimedia de tamaño 10.
		ListaMultimedia lista = new ListaMultimedia(10);
		
		// Se creen tres películas y se añadan a la lista.
		Pelicula peli1 = new Pelicula("El padrino", "Francis", Formato.mov, 220, "Sofía");
		Pelicula peli2 = new Pelicula("El padrino II", "Francis", Formato.mov, 220, "Rober","Sofía");
		Pelicula peli3 = new Pelicula("El padrino III", "Francis", Formato.mov, 220, "Sofía");
		Multimedia multi = new Multimedia("Purple Haze", "Jimmy", Formato.mp3, 49);
		
		lista.add(multi);
		lista.add(peli1);
		lista.add(peli2);
		lista.add(peli3);
		
		// Se muestre la lista por pantalla
		System.out.println(lista);
	}
}
