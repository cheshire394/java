package Ejercicio8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntFunction;

import Ejercicio7.Estudiante;




public class Colores {


	/*Haciendo uso de una colección de tipo HashSet:
● Añade los siguientes elementos al HashSet: Red, Green, Black,
White, Pink y Yellow.
● Utiliza un iterador para mostrar los elementos anteriormente
añadidos.
● Muestra el número total de elementos del HashSet.
● Crea otro HashSet y clona el contenido del primero (método clone).
Muestra el contenido del nuevo HashSet.
● Convierte el HashSet en un array estático de String. (método
toArray). Muestra el contenido del array.
● Convierte el HashSet en un TreeSet. Revisa los constructores de
TreeSet. Muestra el contenido del TreeSet.
● Crea otro HashSet que contenga los siguientes elementos: Red, Pink,
Black y Orange. A continuación, implementa lo que corresponda
para comprobar si este nuevo HashSet es igual al primero.

● Implementa lo que corresponda para que el primer HashSet se
quede únicamente con los elementos que pertenecen a ambos
HashSet (método retainAll). Muestra el nuevo contenido del
HashSet.*/


	public static void mostrarColores(Set<String> set) {

		System.out.println("****** MOSTRAR COLORES CON ITERATOR*********");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("*******MOSTRAR COLORES CON FOR-EACH**********");
		for(String cp : set) {
			System.out.println(cp);
		}

		System.out.println("********MOSTRAR COLORES CON FOR DESCENDENTE **************");
		System.out.println("Hemos tenido que convertirlo en un ArrayList");
		//Recuerda que set no permite utilizar get ni set como arrayList, entonces si queremos
		//usar for tendremos que convertir el HashSet en un ArrayList tanto es ascendente como
		//descendente, el criterio de ordenación será el orden de posición.

		ArrayList<String> lista = new ArrayList<String>(set);
		for(int i = set.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}

		System.out.println("***********DESCENDIENDO CON ITERATOR descending**********************");
		//en este caso estamos convirtiendo en TreeSet, o lo que el orden de ordenación de datos
		//dependera del alfabeteto.
		TreeSet<String> tree = new TreeSet<String>(set); 
		System.out.println("aqui lo ordena alfabeticamente y con for lo hacia por orden de posicion");
		Iterator<String> itTree = tree.descendingIterator();
		while(itTree.hasNext()) {
			System.out.println(itTree.next());
		}


		//NOTA: no se puede usar previous porque NO pertece a Linked y a ListIterator.
		//TAMPOCO ADMITE DESCENDING porque no es bidireccional
		//NO ADMITE Collections.sort(lista,Collections.reverseOrder());

		//Resumiendo HashSet es una lista  NO ORDENADA que no admite Duplicado
		//y si quieres añair y/o descenderla tendrás que convertirala en lista o TreeSet


	}

	public static int contarElementos (Set<String> set) {

		int cantidadElementos = set.size();
		System.out.print("La cantidad de elementos que tiene el set es: ");
		return cantidadElementos; 
	}



	//el ejercicio impone, que debemos utilizar el método clonar:
	//pero también se puede hacer creando un nuevo set que parta del anterior.

	public static Set<String> clonar(HashSet<String> set){
		/* La conversión (HashSet<String>) es necesaria porque clone() 
		 * devuelve un Object y necesitamos convertirlo al tipo correcto.
		 * es decir que al usar clone, es necesario volver a especificar el tipo de dato */
		HashSet<String> clon = (HashSet<String>)set.clone();
		return clon; 
	}



	public static String convertirArray (Set<String> set) {

		String[]array = set.toArray(new String[set.size()]);


		return Arrays.toString(array); 

	}


	public static TreeSet<String> convertirTree (HashSet<String>set){
		//1) la primera es crear un TreeSet y pasarle por
		//parametro el HashSet (me gusta más esta opción). 
		TreeSet<String> tree = new TreeSet<String>(set);

		//return tree; comentamos para mostrar la otra posible solucción 

		//la segunda opción es crear un un TreeSet sin parametros, y usar el metodo addAll.
		TreeSet<String> treeAddAll = new TreeSet<String>();
		treeAddAll.addAll(set);

		return treeAddAll;

	}

	//creamos el método equals para hacer las comparaciones

	public static boolean isEquals (Object A, Object B) {

		boolean isEquals = false;

		if(A.equals(B)) isEquals = true; 
		System.out.println("¿El objeto: "+ A + " y el objeto "+ B +" son iguales?");
		return isEquals; 

	}







	public static void main(String[] args) {

		HashSet<String> coloresHash = new HashSet<String>();

		// Añadir los colores al HashSet
		coloresHash.add("Red");
		coloresHash.add("Green");
		coloresHash.add("Black");
		coloresHash.add("White");
		coloresHash.add("Pink");
		coloresHash.add("Yellow");


		mostrarColores(coloresHash); 


		System.out.println(contarElementos(coloresHash));


		System.out.println("Soy un clon: ");
		System.out.println(clonar(coloresHash));
		//creamos el clon en main para comprobar equals
		HashSet<String> clon = (HashSet<String>)coloresHash.clone();

		System.out.println("Soy un array: ");
		System.out.println(convertirArray(coloresHash));
		String[]array = coloresHash.toArray(new String[ coloresHash.size()]);

		System.out.println("Soy una conversión a Tree");
		System.out.println(convertirTree(coloresHash));



		/*● Crea otro HashSet que contenga los siguientes elementos: Red, Pink,
			Black y Orange. A continuación, implementa lo que corresponda
			para comprobar si este nuevo HashSet es igual al primero.*/

		// Crear un HashSet con los elementos especificados
		HashSet<String> coloresOtroHash = new HashSet<>();

		// Agregar elementos al HashSet
		coloresOtroHash.add("Red");
		coloresOtroHash.add("Pink");
		coloresOtroHash.add("Black");
		coloresOtroHash.add("Orange");


		//VAMOS A COMPRAR NUESTA LISTA ORIGINAL HashSet CON:

		//  1) su clon (que deberia ser true) //retorna true
		System.out.println(isEquals(coloresHash, clon));


		//  2) un TreeSet que es igual que HashSet
		TreeSet<String> tree = new TreeSet<String>(coloresHash);
		System.out.println(isEquals(coloresHash, tree));

		//  3) un array igual que la lista //retorna true
		System.out.println(isEquals(coloresHash, array));



		// 4) un ArrayList que es igual que HashSet
		ArrayList<String> lista = new ArrayList<String>(coloresHash);
		System.out.println(isEquals(coloresHash, lista));

		//  5) otra HashSet totalmente diferente. //obviamente son false
		System.out.println(isEquals(coloresHash, coloresOtroHash));

		//CONCLUSIONES: SI EL CONTENIDO ES IGUAL, RETORNA TRUE SOLAMENTE SI SON DE LA MISMA CLASE
		//EN ESTE CASO ES SET, PUES UN HashSet y TreeSet si son iguales es True.

		//PERO NO SUCEDE IGUAL SIN COMPARAMOS UN ARRAY O UNA LISTA CON UN SET, QUE SON IDENTICOS
		//COMO NO FORMAN PARTE DE LA MISMA CLASE VA ARETORNAR FALSE)


		//NO OBSTANTE NO ES NECESARIO IMPLEMENTAR EL MÉTODO, YA QUE JAVA YA LO TIENE INTERNAMENTE.
		//Y UTILIZA LA MISMA LÓGICA.
		System.out.println(coloresHash.equals(coloresOtroHash));
		System.out.println(coloresHash.equals(array));
		System.out.println(coloresHash.equals(lista));
		System.out.println(coloresHash.equals(clon));

		//REGITRAR FUNCIONAMIENTO DE EQUALS.

		HashSet<Integer> numHashSet = new HashSet<Integer>();

		numHashSet.add(6);
		numHashSet.add(4);
		numHashSet.add(2);

		TreeSet<Integer> numTree = new TreeSet<Integer>(numHashSet);

		System.out.println("¿PUEDEN SER IGUALES UN HASHSET Y UN TREESET: ");
		System.out.println(numTree.equals(numHashSet)); //TRUE. PORQUE FORMAN PARTE DE LA CLASE SET




		ArrayList<Integer> numArrayList = new ArrayList<Integer>(numHashSet);


		System.out.println("¿PUEDEN SER IGUALES UN ARRAYLIST Y UN LINKEDLIST : ");
		LinkedList<Integer> numLinked = new LinkedList<Integer>(numArrayList);
		System.out.println(numLinked.equals(numArrayList)); //TRUE. SON LA MISMA CLASE


		System.out.println("¿PUEDEN SER IGUALES UN HASHSET Y UN ARRAYLIST: ");
		System.out.println(numArrayList.equals(numHashSet)); //FALSE. DISTINTAS CLASES
		System.out.println("HashSet"+ numHashSet);
		System.out.println("ArrayList"+ numArrayList);





		/*Cuando se llama al método retainAll(), se modifica la colección actual 
		 * (por ejemplo, ArrayList, HashSet, etc.) para que solo contenga los elementos 
		 * que están presentes tanto en la colección actual como en la colección especificada.
		 *  Todos los demás elementos se ELIMINAN.*/

		//POR LO TANTO, SI NO QUEREMOS QUE SE PODRUZACAN ELIMINACIONES EN NUESTRA LISTA ORIGINAL
		//LO SUYO ES CREAR POR EJEMPLO UNA COPIA Y TRABAJAR CON retainAll() SOBRE LA COPIA.
		// AUNQUE ES IMPORTANTE QUE SEPAS, QUE LO PUEDES HACER DIRECTAMENTE SOBRE LA LISTA ORIGINAL.


		HashSet<String> copia = (HashSet<String>) coloresHash.clone();

		copia.retainAll(coloresOtroHash);

		//ahora copia, solo contiene los elemento que tiene en comun con coloresOtroHash

		System.out.println("¿PODEMOS USAR retainAll COMPARANDO UNA LISTA Y UN SET?");

		ArrayList<String> arrayLista = new ArrayList<String>(coloresHash); // parametro es un SET

		//añadimos nuevos colores para ver como retainAll los elimina al no coincidir:
		arrayLista.add("MAGENTA"); 
		System.out.println(arrayLista);

		arrayLista.retainAll(coloresHash);
		System.out.println(arrayLista);




		//CONVERTIR A ARRAY

		Integer [] vector = numHashSet.toArray(new Integer[numHashSet.size()]);
		System.out.println("Soy un vector "+Arrays.toString(vector));

		String [] vector2 = coloresHash.toArray(new String [coloresHash.size()]); 
		System.out.println("Soy un vector "+Arrays.toString(vector2));



		System.out.println("¿PUEDEN SER IGUALES UN HASHSET Y UN ARRAY: ");
		System.out.println(vector.equals(numHashSet)); //FALSE. SON DISTINTAS CLASES
		System.out.println("HashSet"+ numHashSet);


		//CONVERTIR UN ARRAY EN UNA LISTA

		List<Integer> arrayToList1 = Arrays.asList(vector); 
		System.out.println(arrayToList1);
		
		// asList. solo permite crear sin excepciones listas de tipo List<>
		
		//  Ejemplos que retornan excepción: 
		//  Set<String> arrayToSet = (Set<String>) Arrays.asList(vector2);
		//	ArrayList<Integer> arrayToList2 =(ArrayList<Integer>) Arrays.asList(vector)
		//	LinkedList<Integer>arrayToList3 = (LinkedList<Integer>) Arrays.asList(vector);
		//	HashSet<String> arrayToSet = (HashSet<String>) Arrays.asList(vector2); 

		//EVITAR ESTE TIPO DE EXCEPCIONES:
		
		// Definir un vector (array) de ejemplo
        int[] vector3 = {1, 2, 3, 4, 5};

        // Crear un ArrayList
        ArrayList<Integer> arrayToList = new ArrayList<>();

        // Iterar sobre el array y agregar cada elemento al ArrayList
        for (int num : vector3) {
            arrayToList.add(num);
        }

        // Imprimir el ArrayList
        System.out.println(arrayToList);



	}

}
