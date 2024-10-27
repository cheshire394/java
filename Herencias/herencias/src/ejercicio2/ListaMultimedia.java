package ejercicio2;
// Importamos las clases del ejercicio 1
import ejercicio1.Multimedia;

import java.util.Arrays;

import ejercicio1.Formato;

public class ListaMultimedia {
	private Multimedia vector[];
	private int contador;
	private int tama�o;
	
	public ListaMultimedia(int tama�o) {
		super();
		this.contador = 0;
		this.tama�o = tama�o;
		vector = new Multimedia[tama�o];
	}
	
	int size() {
		return contador;
	}
	/*
	 * A�ade el objeto a la lista y
	 * devuelve true, en caso de que la lista est� llena, devuelve false.
	 */
	boolean add(Multimedia m) {
		boolean insertado = false;
		
		if(contador<tama�o) {
			vector[contador] = m;
			contador++;
			insertado = true;
		}
		
		return insertado;
	}
	
	/*
	 * devuelve el objeto situado en la posici�n especificada
	 */
	Multimedia get(int position) {
		Multimedia aux = null;
		
		if(position<tama�o) {
			aux = vector[position];
		}
		
		return aux;
	}

	/*
	 * devuelve la informaci�n de los objetos que est�n en la lista @Override
	 */
	public String toString() {
		String result = "ListaMultimedia [contador=" + contador + ", tama�o=" + tama�o
				+ "]" + " Vector: \n";
		
		// Cada objeto muestra seg�n la clase de objeto que es (Pelicula o Multimedia)
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] != null) {
				result += vector[i].toString() + "\n";
			}
		}
		
		return result;
	}

}
