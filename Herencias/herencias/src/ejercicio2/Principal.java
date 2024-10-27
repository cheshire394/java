package ejercicio2;

import ejercicio1.Formato;
import ejercicio1.Multimedia;
import ejercicio1.Pelicula;

public class Principal {
	public static void main(String[] args) {
		// Se cree un objeto de tipo ListaMultimedia de tama�o 10.
		ListaMultimedia lista = new ListaMultimedia(10);
		
		// Se creen tres pel�culas y se a�adan a la lista.
		Pelicula peli1 = new Pelicula("El padrino", "Francis", Formato.mov, 220, "Sof�a");
		Pelicula peli2 = new Pelicula("El padrino II", "Francis", Formato.mov, 220, "Rober","Sof�a");
		Pelicula peli3 = new Pelicula("El padrino III", "Francis", Formato.mov, 220, "Sof�a");
		Multimedia multi = new Multimedia("Purple Haze", "Jimmy", Formato.mp3, 49);
		
		lista.add(multi);
		lista.add(peli1);
		lista.add(peli2);
		lista.add(peli3);
		
		// Se muestre la lista por pantalla
		System.out.println(lista);
	}
}
