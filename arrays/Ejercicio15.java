
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Ejercicio15 {

	//creamos atributos


	/*15. Realiza un programa que dado un vector de 10 posiciones numéricas
			enteras:
			a. Rellénalo de números aleatorios entre 100 y 200 (ambos
			incluidos).
			b. Muestra su contenido en una línea de pantalla.
	
		c. Ordénalo de menor a mayor utilizando un algoritmo de
			ordenación. d. Muestra su contenido actual en una línea de pantalla.

			e. Ordénalo de mayor a menor utilizando un algoritmo de
			ordenación.
			f. Muestra su contenido actual de mayor a menor en una línea
			de pantalla.
			Nota: usa clases y estructura tu programa en diferentes métodos
			reutilizables.*/
	
	




	//Metodo para colorcar un array ascendente
	public static void ascender (int[] vector) {
		Arrays.sort(vector);
		
	}


	// Método para ordenar el array de forma descendente
	//IMPORTANTE--> IMPORTAR COMPARADOR
	public static void descenderConComparador(int[] array) {
		Integer[] arrayObjetos = Arrays.stream(array).boxed().toArray(Integer[]::new);
		Arrays.sort(arrayObjetos, Comparator.reverseOrder());
		for (int i = 0; i < array.length; i++) {
			array[i] = arrayObjetos[i];
		}
	} 

	/*CREAMOS METODO PARA ORDENAR ARRAY DESCENDENTE*/

	public static void descender (int [] vector) {
		for(int i = 0; i < vector.length -1; i++) {
			for(int j = 0; j < vector.length -i -1; j++) {
				if (vector[j] < vector[j +1]) {
					//intercambiamos posiciones utilizando una variable
					int aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}

		}
	}






	public static void main(String[] args) {

	
		System.out.println("************************************");
		final int FINAL_ARRAY = 10;
		//creamos vector con POO

		int [] vector = new int [FINAL_ARRAY];

		int [] vector2 = new int [FINAL_ARRAY];

		//creamos for que recorre todas las posiciones del array y asigna un número aleatorio entre 200 y 100;

		for (int i = 0; i < FINAL_ARRAY; i++) {
			vector[i]= (int)(Math.random()*(200-100+1)+100);
			//mostramos contenido	

		}

		//damos posiciones al array 2 con for-each
		System.out.print("array 2 con for-each = ");
		for(int copiaVector2 : vector2) {
			copiaVector2= (int)(Math.random()*(200-100+1)+100);
			System.out.print(" "+copiaVector2+ " ");
		}



		System.out.println("Array original: " + Arrays.toString(vector));

		// Ordenar de forma ascendente
		ascender(vector);
		System.out.println("Array ascendente: " + Arrays.toString(vector));
		//ordenar de forma descendente
		descenderConComparador(vector);
		System.out.println("Array descendente Con comparador: " + Arrays.toString(vector));
		// Ordenar de forma descendente
		descender(vector);
		System.out.println("Array descendente Con Burbuja: " + Arrays.toString(vector));

	}

}
