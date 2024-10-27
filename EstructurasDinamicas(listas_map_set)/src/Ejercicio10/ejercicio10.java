package Ejercicio10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ejercicio10 {

	/*Añade al TreeSet los colores: Red, Green, Orange, White y Black.
Muestra el contenido de la colección.
● Utiliza un iterador para mostrar cada elemento de la colección en
una línea.
● Crea otro TreeSet con los colores: Pink, Blue y Yellow. Añade al
primer TreeSet los elementos del segundo TreeSet llamando
únicamente a un método de la API. Muestra los elementos que
componen el primer TreeSet. ¿Se muestra ordenados?

● Muestra en orden inverso los elementos del primer TreeSet. Revisa
la API de Iterator para ver con qué método se puede hacer esto.

● Muestra los elementos que ocupan la primera y la última posición
del TreeSet. Revisa los métodos de la API.

● Crea un TreeSet de números enteros y añade 10 números distintos.
A continuación, muestra cuántos de los números añadidos son
menores que 7. Revisa la API de Java para ver qué método hace
esto.

● Muestra (para los elementos que forman parte del TreeSet) el
primer número que es mayor o igual que un número pasado como
parámetro. Revisa la API de Java para ver qué método hace esto.
● Y si fuese menor o igual ¿qué método tendrías que utilizar?


● Elimina el primer y el último elemento del TreeSet. Revisa la API de
Java para ver qué método hace esto.


● Elimina el número pasado como parámetro del TreeSet. Revisa la
API de Java para ver qué método hace esto.*/


	public static void mostrar (Set<String>set) {
		System.out.println("**************** MOSTRAR CON ITERATOR ****************************");

		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


		System.out.println("**************** MOSTRAR CON FOR-EACH ****************************");

		for (String cp : set) {
			System.out.println(cp);
		}
		System.out.println("**************** MOSTRAR CON FOR ****************************");

		System.out.println("En el caso de set, para mostar con for, hay que pasar a lista para acceder al get");
		ArrayList<String> lista = new ArrayList<String>(set); 

		for(int i = 0; i < set.size(); i++) {
			System.out.println(lista.get(i));
		}

	}


	public static void mostrarDescendente (TreeSet<String> set) {

		System.out.println("**************** MOSTRAR CON ITERATOR DESCENDENTE ****************************");
		System.out.println("RECUEDA QUE PARA MOSTRAR CON DESCENDING UN SET ES NECESARIO QUE SEA TREESET");
		Iterator it = set.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


		System.out.println("**************** MOSTRAR CON FOR DESCENDENTE ****************************");
		ArrayList<String> lista = new ArrayList<String>(set); 

		for(int i = set.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}

	}

	public static Set<String> unirSet (Set<String> set, Set<String> set2) {

		//creamos una copia del set original que realice la unión
		TreeSet<String> unir = new TreeSet<String>(set); 
		unir.addAll(set2);
		System.out.print("La union de "+set +" + "+set2+ " = ");
		return unir; 
	}




	public static void main(String[] args) {

		TreeSet<String>colores = new TreeSet<String>();

		colores.add("Red");
		colores.add("Green");
		colores.add("Orange");
		colores.add("White");
		colores.add("Black");

		// Crear otro TreeSet y añadir sus elementos al primero
		TreeSet<String> colores2 = new TreeSet<>();
		colores2.add("Pink");
		colores2.add("Blue");
		colores2.add("Yellow");


		mostrar(colores);
		mostrarDescendente(colores); 

		System.out.println();
		System.out.println("COMO VES EN EL EJEMPLO SET SIEMPRE SE MUESTRA ORDENADO ");

		//unimos dos set

		//recuerda que en las listas sino quieres que te duplique los elementos
		//tienes que usar removeAll primero, para eliminar los elementos iguales.
		System.out.println(unirSet(colores, colores2));

		System.out.println();

		//TreeSet (HashSet NO PERMITE ESTA ACCION), permite acceder unicamente a la primera
		//y la última posición sin necesidad de convertir a List.
		colores.first();
		colores.last();


		/*● Crea un TreeSet de números enteros y añade 10 números distintos.
		A continuación, muestra cuántos de los números añadidos son
		menores que 7. Revisa la API de Java para ver qué método hace
		esto.*/

		TreeSet<Integer> numeros = new TreeSet<Integer>();


		System.out.println("genera hasta 10 numeros aleatorios no duplicados");
		do {
			int num; 
			num = (int) (Math.random()*(30 - 1)+1);

			// si el TreeSet no contiene el numro lo añadimos al Set
			if(!numeros.contains(num)) numeros.add(num);

		}while(numeros.size() != 10); //hacer mientras numeros no sea igual a 10.

		System.out.println(numeros);

		System.out.println();

		System.out.println("Genera un formula para sacar los numeros menores a un numero (x) de un set");
		//false para indicar < , en vez <=
		TreeSet<Integer> numerosMenores = (TreeSet<Integer>) numeros.headSet(10, false);
		System.out.println();
		System.out.println(numerosMenores);
		System.out.println("La cantidad de elementos < 10: "+numerosMenores.size());

		System.out.println();

		Set<Integer> numerosMayores = (Set<Integer>) numeros.tailSet(10, true);

		System.out.println(numerosMayores);
		System.out.println("La cantidad de elementos < 10: "+numerosMayores.size());

		/*● Muestra (para los elementos que forman parte del TreeSet) el
			primer número que es mayor o igual que un número pasado como
			parámetro. Revisa la API de Java para ver qué método hace esto.
			● Y si fuese menor o igual ¿qué método tendrías que utilizar?*/
		
		
		int n = 10; 
		
		Integer numeroMenor = numeros.floor(n); 
		System.out.println(numeroMenor);
		
		int numeroMayor = numeros.ceiling(n);
		System.out.println(numeroMayor);
		
		
		/*● Elimina el primer y el último elemento del TreeSet. Revisa la API de
		Java para ver qué método hace esto.*/
		
		numeros.pollFirst();//elimina el primerElemento 
		numeros.pollLast(); //elimina el último elemento
		
	      // Eliminar número pasado como parámetro del TreeSet
        int numeroEliminar = 6;
        numeros.remove(numeroEliminar);
		
		
        
        /// otros métodos
		int x; 
		
		x = numeros.first();
		
		x = numeros.last();
		
		x = numeros.lower(numeroMenor);
		
		
		x = numeros.higher(numeroMenor);
	
		
		numeros.hashCode();
		
	
		
		
		
		
		
	

		
	}

}
