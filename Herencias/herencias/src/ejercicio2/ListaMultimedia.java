package ejercicio2;
// Importamos las clases del ejercicio 1
import ejercicio1.Multimedia;

import java.util.Arrays;

import ejercicio1.Formato;

public class ListaMultimedia {
	private Multimedia vector[];
	private int contador;
	private int tamaño;
	
	public ListaMultimedia(int tamaño) {
		super();
		this.contador = 0;
		this.tamaño = tamaño;
		vector = new Multimedia[tamaño];
	}
	
	int size() {
		return contador;
	}
	/*
	 * Añade el objeto a la lista y
	 * devuelve true, en caso de que la lista esté llena, devuelve false.
	 */
	boolean add(Multimedia m) {
		boolean insertado = false;
		
		if(contador<tamaño) {
			vector[contador] = m;
			contador++;
			insertado = true;
		}
		
		return insertado;
	}
	
	/*
	 * devuelve el objeto situado en la posición especificada
	 */
	Multimedia get(int position) {
		Multimedia aux = null;
		
		if(position<tamaño) {
			aux = vector[position];
		}
		
		return aux;
	}

	/*
	 * devuelve la información de los objetos que están en la lista @Override
	 */
	public String toString() {
		String result = "ListaMultimedia [contador=" + contador + ", tamaño=" + tamaño
				+ "]" + " Vector: \n";
		
		// Cada objeto muestra según la clase de objeto que es (Pelicula o Multimedia)
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] != null) {
				result += vector[i].toString() + "\n";
			}
		}
		
		return result;
	}

}
