package EjemplosClase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import java.util.Vector;

public class EjemplosLista {





	//METODOS ELIMINAR ELEMENTOS
	//elementos en ArrayList y vectorList, y linkedList (porque es generico de la clase List)
	public static void  eliminar (List<String> nombre, int posicion) {
		nombre.remove(posicion); 

	}


	//elementos de un LinkedList , este no es generico, solo admite LinkedList (usa Last y First)

	public static void eliminarLinkedLast (LinkedList<Integer> nombre) {
		nombre.removeLast();
	}

	public static void eliminarLinkedFirst (LinkedList<Integer> nombre) {
		nombre.removeFirst();
	}







	//METODOS QUE MODIFICAN ELEMENTOS CON SET
	public static void modificarElementos (ArrayList<String> nombre, int posicion, String modificacion) {
		nombre.set(posicion, modificacion); 
	}


	public static void modificarElementos (LinkedList<Integer> nombre, int posicion, Integer modificacion) {
		nombre.set(posicion, modificacion); 
	}



	//METODOS QUE OBTIENEN UNA POSICIÓN CONCRETA (SOLAMENTE LA OBTIEENE UNO QUE ES FOR-EACH, PORQUE LA ENCUENTRA PRIMERO, PERO HE COMPROBADO QUE TODOS LA MUESTRAN)

	public static String getElementoPosicion (List<String> nombre, int posicion) {
		String elemento = "no encontrado"; //recoge el elemento 

		System.out.println("*****************OBTERNER POSICION USANDO FOR******************************");
		for(int i = 0; i < nombre.size();i++) {
			if(posicion == i) {
				elemento = nombre.get(i);
				return elemento; 
			}
			break;//deja de buscar.
		}


		System.out.println("*************OBTERNER POSICION USANDO FOR-EACH****************************");

		//para hacerlo con for-each e Iterator, es un poco más complejo, porque debemos crear una variable auxiliar que compare la posicion
		//con el numero de veces que llavamos recorridas.
		int recorrido = 0; 
		for(String copia : nombre) {
			if(recorrido == posicion) {
				elemento = nombre.get(posicion);
				return elemento; 

			}

			recorrido++; //si no entra, en el if, entonce recorrido aumenta su valor para buscar en la siguiente posición.
			break; 
		}


		System.out.println("***********************OBTENER POSICION CON ITERATOR**************************");

		Iterator<String> iterator = nombre.iterator();

		while(iterator.hasNext()) {

			if(recorrido == posicion) {
				elemento = nombre.get(posicion); 
				return elemento; 
			}

			recorrido++; 
			break;
		}

		return elemento; //sino imprime elemento no encontrado
	}


	//METODOS QUE DEVUELVEN LA POSICION QUE OCUPA UN ELEMENTO, Y SI LA LISTA LO CONTIENE
	//FALLA EN LA POSICION QUE DEVUELVE
	
	
	
	
	public static boolean isListForEach (List<String> nombre, String buscar) {
		System.out.println("*******************************Usando FOR-EACH************************************************");
		boolean exists = false; 
		int recorrido = 0; 
		
		
		for (String copia : nombre) {
			
			if(copia.contains(buscar)) {
				
				exists = true; 
				System.out.println("El elemento se ene cuentra en: "+ recorrido);
				break; 
			}
			recorrido ++; 
	
		}
		System.out.print("El elemento se ubica en esta lista: ");
		return exists; 
		
		}
	
	
	
	public static boolean isListIterator (List<String> nombre, String buscar) {

		System.out.println("*****************USANDO ITERATOR**********************************************************");
		boolean exists = false; 
		int recorrido = 0; 


		Iterator<String> iterator = nombre.iterator(); 

		while(iterator.hasNext()) {
			String	elemento = iterator.next();

			if(buscar.contains(elemento)) {
				exists = true;
				break;
			}
			recorrido++; 

		}
		System.out.println("La posición del elemento es: "+recorrido+ " ");
		System.out.print("El elemento se enecuntra en la lista: ");
		return exists;

	}//CIERRE DEL METODO

	
	
	public static boolean isListFor (List<String> nombre, String buscar) {

		boolean exists = false; 
		System.out.println("*******************************Usando FOR************************************************");
		for(int i = 0; i < nombre.size(); i++) {
			if(buscar.contains(nombre.get(i))) {
			
				exists = true;
				System.out.println("La posición del elemento es: "+ i);
				
				break; 
			}
		}

	
		System.out.print("El elemento se ubica en esta lista: ");
		return exists; 
	}
	
	








	//METODOS QUE MUESTRAN UNA LISTA , es de tipo generico.

	public static void mostrarString (List<String> nombre) {
		System.out.println("MOSTRAR CON FOR-EACH");
		for (String copia : nombre) {
			System.out.println(copia);
		}

		System.out.println("MOSTRAR CON FOR");

		for (int i = 0; i < nombre.size(); i++) {
			System.out.println(nombre.get(i));
		}

		System.out.println("MOSTRAR CON ITERATOR");

		Iterator<String> iterator = nombre.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}



	public static void mostrarInteger (List<Integer> nombre) {
		System.out.println("MOSTRAR CON FOR-EACH");
		for (Integer copia : nombre) {
			System.out.println(copia);
		}


		System.out.println("MOSTRAMOS CON ITERATOR");
		//IMPORTANTE --> previous (solo se puede usar en las clase LinkedList, por eso iteratos debe de llevar "List delante", y debe emepezar en una
		//posiicon que no sea 0, en este caso, es el final de la lista (size()).
		//ESTO ES UNA ALTERNATIVA PARA MOSTRAR LinkedList DE FORMA DESCENDENTE otra alternativa es descending (que solo ale para linkedList y descendinSet() que
		//solo es válido para TreeSet
		ListIterator<Integer> iteratorPrevious = nombre.listIterator(nombre.size()); 
		while(iteratorPrevious.hasPrevious()) {
			System.out.println(iteratorPrevious.previous());
		}
	}
	
	public static void Buscarduplicados(List<Integer>lista) {
		
		//creamos dos ciclos for, uno que recorra la lista y otro que compare cada uno de los elementos
		for(int i = 0 ; i < lista.size()-1; i++) {
			int elementoActual = lista.get(i);
			for(int j = i+1; j < lista.size(); j++) {
				
				if(elementoActual == lista.get(j)) lista.set(j, 0); 
			}
			
		}
		System.out.println(lista);
	}








	@Override
	public String toString() {
		return "EjemplosLista [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	//LINEA MAIN
	public static void main(String[] args) {


		//CREAMOS OBJETOS DE TIPO LISTA: 
		//creamos una lista
		ArrayList<String> arrayList = new ArrayList<String>(); 

		//creamos listVector
		Vector<String> vectorList = new Vector <String>(); 

		//creamos LinkenList
		LinkedList<Integer> LinkedNum = new LinkedList<Integer>(); 





		//AÑADIMOS LOS OBJETOS DE TIPO LISTA: 

		//añadirmos elementos a la ArrayList
		arrayList.add("nombre1"); 
		arrayList.add("nombre2"); 
		arrayList.add(0, "nombre0"); //indicamos la posición exacta, en este caso la primera
		//añadimos elementos a Linked
				LinkedNum.add(1); 
				LinkedNum.add(2);
				LinkedNum.addFirst(0);//añade al principio de la lista
				LinkedNum.addLast(3); //añade al final de la lista
				LinkedNum.add(0,6); //añade en un cualquier lugar de la lista

				//añadimos elementos al Vector
				vectorList.add("Nombre1");
				vectorList.add(0, "Nombre0");

				
		int buscar = Collections.binarySearch(arrayList,"nombre1");
		System.out.println("BUSCADO CON BINARY: "+buscar);
	

		boolean iguales = arrayList.equals(LinkedNum);
		System.out.println("SON IGUALES "+ iguales);
		
		
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		
		
		System.out.println("mueve aleatoriamente los elementos");
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		
		
		ArrayList<String> clonList = (ArrayList<String>) arrayList.clone(); 
		
		boolean comunes = Collections.disjoint(arrayList, clonList);
		System.out.println("tienen elementos en comun: "+comunes); 
		System.out.println(clonList);
		System.out.println(arrayList);
		
		
		int veces = Collections.frequency(arrayList, "nombre1");
		System.out.println("Numero de veces que tiene un elemento= "+veces);
		
		

		


		//MOSTRAMOS LAS LISTAS: 
		System.out.println("********************MOSTRAR ANTES DE ELIMINAR ELEMENTOS *************************************************");
		System.out.println("****************************ArrayList***********************************************");
		mostrarString(arrayList); 
		System.out.println("***************************VectorList**********************************************");
		mostrarString(vectorList); 
		System.out.println("***************************LinkedList************************************************");
		mostrarInteger(LinkedNum); 


		//ELIMINAMOS ELEMENTOS

		eliminar(arrayList,0); 
		eliminar(vectorList,0); 
		eliminarLinkedFirst(LinkedNum); 
		eliminarLinkedLast(LinkedNum); 


		System.out.println("********************MOSTRAR DESPUES DE ELIMINAR ELEMENTOS *************************************************");
		System.out.println("****************************ArrayList***********************************************");
		mostrarString(arrayList); 
		System.out.println("***************************VectorList**********************************************");
		mostrarString(vectorList); 
		System.out.println("***************************LinkedList************************************************");
		mostrarInteger(LinkedNum); 


		//OBTENER UN ELEMENTO, CUYA POSICION HA SIDO PASADA POR PARAMENTRO
		System.out.println(	getElementoPosicion(arrayList,1));


		//OBTERNER LA POSICION DE UN ELEMENTO EN UNA LISTA, SI ES QUE LO CONTIENE
		System.out.println("Imprimimos la lista para ver los elementos");
		System.out.print(arrayList+ " ");
		System.out.println(isListIterator(arrayList, "nombre2"));
		System.out.println(isListFor(arrayList, "nombre2"));
		System.out.println(isListForEach(arrayList, "nombre2"));
		
		
		
		//CREAMOS ARRAYS EN ARRAYSlist
		
		ArrayList<String[]> listaArrays = new ArrayList <String[]>(); 
		
		listaArrays.add(new String [] {"alicia", "eva","roberto"}); 
		listaArrays.add(new String [] {"blanco", "rosa", "azul"}); 
		listaArrays.add(new String [] {"perro", "gato", "caballo"}); 
		
		//accedemos a posiciones concretas del arrays y las modificamos
		
		//modificar el primer elemento 0 (alicia) de la lista 1 (nombres)
		listaArrays.get(0)[0]= "ali"; 
		System.out.println("lista modificada "+ listaArrays.get(0)[0]);
		
		//modificamos caballo por yegua, y lo hacemos directamente
		
		listaArrays.get(2)[2]= "yegua"; 
		System.out.println("lista modificada "+ listaArrays.get(2)[2]);
		
		
		
		int ultimoLast =LinkedNum.getLast(); 
		
		
		
		
		int ultimoSize =LinkedNum.get(LinkedNum.size()-1); 
		
		
		
		
		System.out.println(ultimoLast);
		System.out.println(ultimoSize);
		
		
		ArrayList<int []> arrays = new ArrayList<>(); 
		
		arrays.add(new int []{1,2,3});
		arrays.add(new int []{4,5,6});
		arrays.add(new int []{7,8,9}); 
		
		System.out.println("MOTRAR ELEMENTOS lista con arrays");
		
		for (int i = 0; i < arrays.size(); i++) {
			//crea una variable local para almacenar arrays
			int [] array = arrays.get(i);
			System.out.println();
			
			for(int j = 0 ; j < array.length; j++) {
				
				System.out.print(arrays.get(i)[j]);
			}
		}
		
		System.out.println();
		
		
		//sin parentesis en el array. obtiene y modifica su valor
		int posicion = arrays.get(1)[2] = 10; // es 6
		System.out.println("obtener posicion concreta "+ posicion);
		
		
		
		
		for(int i = 0; i < arrays.size(); i++) {
			int [] variable = arrays.get(i);
			System.out.println();
			
			for (int j = 0; j < variable.length; j++) {
				System.out.print(arrays.get(i)[j]);
				
				if (arrays.get(i)[j] == 9) arrays.get(i)[j] = 8; //modifica si cumple la condicion

				}
			}
		
	





	}

}
